package com.banking.dao;

import com.banking.model.User;

/**
 * Data Access Object interface for User entities.
 * 
 * This interface defines the contract for user-related database operations.
 * Implementations of this interface will handle the persistence and retrieval
 * of User objects from the database.
 * 
 * @author Banking App Team
 * @version 1.0
 */
public interface UserDao {
    
    /**
     * Saves a user to the database.
     * 
     * This method can be used for both creating new users and updating existing users.
     * The implementation should determine whether to insert or update based on the
     * user's ID (null or 0 for new users, existing ID for updates).
     * 
     * @param user The user object to save
     * @return The saved user with any database-generated fields (like ID) populated
     * @throws com.banking.exception.DatabaseException if there's an error during the database operation
     * @throws com.banking.exception.DuplicateResourceException if a user with the same email already exists
     */
    User save(User user);
}
