package com.banking.exception;

/**
 * Exception thrown when database-related operations fail.
 * 
 * This exception wraps database-specific errors and provides a consistent
 * error handling mechanism for all database operations in the banking application.
 * It can be used for connection failures, query execution errors, constraint violations,
 * and other database-related issues.
 * 
 * HTTP Status: 500 Internal Server Error
 * 
 * @author Banking App Team
 * @version 1.0
 */
public class DatabaseException extends AppException{
    
    /**
     * Constructs a new DatabaseException with the specified error message.
     * 
     * @param message Detailed error message describing the database operation failure
     */
    public DatabaseException(String message) {
        super(500, message);
    }

    /**
     * Constructs a new DatabaseException with the specified error message and cause.
     * 
     * @param message Detailed error message describing the database operation failure
     * @param cause The underlying database exception that caused this exception
     */
    public DatabaseException(String message, Throwable cause) {
        super(500, message, cause);
    }
}
