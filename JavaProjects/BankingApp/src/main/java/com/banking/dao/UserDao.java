package com.banking.dao;

import com.banking.model.User;

import java.util.Optional;

public interface UserDao {

    User save(User user);
    Optional<User> findById(Long id);
    Optional<User> findByEmail(String email);
    Optional<User> findByPhone(String phone);
    boolean existsByEmail(String email);
    boolean existsByPhone(String phone);
    boolean update(User user);
    boolean delete(User user);
    boolean softDelete(long id);
}
