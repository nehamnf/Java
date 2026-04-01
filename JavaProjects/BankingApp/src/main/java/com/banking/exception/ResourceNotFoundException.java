package com.banking.exception;

/**
 * Exception thrown when a requested resource cannot be found.
 * 
 * This exception is used to indicate that a specific resource (user, account, transaction, etc.)
 * does not exist in the system. Common scenarios include looking up a non-existent user ID,
 * accessing an account that doesn't exist, or retrieving a transaction with an invalid ID.
 * 
 * HTTP Status: 404 Not Found
 * 
 * @author Banking App Team
 * @version 1.0
 */
public class ResourceNotFoundException extends AppException{

    /**
     * Constructs a new ResourceNotFoundException with the specified error message.
     * 
     * @param message Detailed error message describing which resource was not found
     */
    public ResourceNotFoundException(String message) {
        super(404, message);
    }

    /**
     * Constructs a new ResourceNotFoundException with the specified error message and cause.
     * 
     * @param message Detailed error message describing which resource was not found
     * @param cause The underlying exception that caused this resource not found error
     */
    public ResourceNotFoundException(String message, Throwable cause) {
        super(404, message, cause);
    }
}
