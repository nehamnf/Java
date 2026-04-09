package com.banking.dao;

import com.banking.config.DatabaseConfig;
import com.banking.exception.DatabaseException;
import com.banking.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class UserDaoImpl implements UserDao{
     private final static Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

     private static final String INSERT_USER = "INSERT INTO users (full_name,email,password,phone)" +
             "VALUES (?, ?, ?, ?)"+
             "RETURNING id,created_at";

     private static final String SELECT_USER_BY_ID = "SELECT id,full_name,email,password,phone,created_at,is_deleted,deleted_at " +
             "FROM users WHERE id = ?";

     private static final String USER_EXISTS_BY_EMAIL = "SELECT 1 FROM users WHERE email = ?";

     private static final String UPDATE_user = "UPDATE users set full_name=? , email =?, phone =? where id=?";

     @Override
     public User save(User user) {
          try(Connection connection = DatabaseConfig.getConnection();
               PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)) {
               preparedStatement.setString(1, user.getFullName());
               preparedStatement.setString(2, user.getEmail());
               preparedStatement.setString(3, user.getPassword());
               preparedStatement.setString(4, user.getPhone());
               ResultSet resultSet = preparedStatement.executeQuery();
               if(resultSet.next()){
                    user.setId(resultSet.getLong("id"));
                    user.setCreatedAt(resultSet.getTimestamp("created_at").toLocalDateTime());
               }
               logger.info("user saved successfully with id: "+user.getId());
               return user;
          } catch (SQLException e) {
               throw new DatabaseException("Failed to save user: " + user.getEmail(), e);
          }
     }

     @Override
     public Optional<User> findById(Long id) {
          return Optional.empty();
     }

     publ
}
