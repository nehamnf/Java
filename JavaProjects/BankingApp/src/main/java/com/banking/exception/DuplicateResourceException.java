package com.banking.exception;

/**
 * Exception thrown when attempting to create a resource that already exists.
 * 
 * This exception is used to indicate a conflict with the current state of the resource.
 * Common scenarios include creating a user with an email that already exists,
 * or creating an account with a duplicate account number.
 * 
 * HTTP Status: 409 Conflict
 * 
 * @author Banking App Team
 * @version 1.0
 */
public class DuplicateResourceException extends AppException{

    /**
     * Constructs a new DuplicateResourceException with the specified error message.
     * 
     * @param message Detailed error message describing the duplicate resource conflict
     */
    public DuplicateResourceException(String message) {
        super(409, message);
    }
}
