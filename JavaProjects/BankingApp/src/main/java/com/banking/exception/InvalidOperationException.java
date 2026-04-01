package com.banking.exception;

/**
 * Exception thrown when an invalid operation is attempted in the banking application.
 * 
 * This exception is used to indicate that a requested operation cannot be performed
 * due to business logic constraints or invalid state. For example, attempting to
 * withdraw from an inactive account or performing unauthorized operations.
 * 
 * HTTP Status: 400 Bad Request
 * 
 * @author Banking App Team
 * @version 1.0
 */
public class InvalidOperationException  extends AppException{

    /**
     * Constructs a new InvalidOperationException with the specified error message.
     * 
     * @param message Detailed error message describing why the operation is invalid
     */
    public InvalidOperationException(String message) {
        super(400, message);
    }
}
