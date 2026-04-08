package com.banking.dao;

import com.banking.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoImpl implements UserDao{
     private final static Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

     private static final String INSERT_USER = "INSERT INTO users (full_name,email,password,phone)" +
             "VALUES (?, ?, ?, ?)"+
             "RETURNING id,created_at";

     private static final String SELECT_USER_BY_ID = "SELECT id,full_name,email,password,phone,created_at,is_deleted,deleted_at " +
             "FROM users WHERE id = ?";

     private static final String SELECT_USER_BY_EMAIL = "SELECT id,full_name,email,password,phone,created_at,is_deleted,deleted_at " +
             "FROM users WHERE email = ?";

     private static final String SELECT_USER_BY_PHONE = "SELECT id,full_name,email,password,phone,created_at,is_deleted,deleted_at " +
             "FROM users WHERE phone = ?";





}
