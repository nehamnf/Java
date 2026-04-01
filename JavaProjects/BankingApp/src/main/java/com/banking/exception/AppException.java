package com.banking.exception;

/**
 * Base exception class for the Banking Application.
 * 
 * This custom exception extends RuntimeException and includes an HTTP status code
 * to provide more context about the error type. All custom exceptions in the
 * banking application should extend this class.
 * 
 * @author Banking App Team
 * @version 1.0
 */
public class AppException extends RuntimeException{

    /** HTTP status code associated with this exception */
    private final int statusCode;

    /**
     * Constructs a new AppException with the specified status code and message.
     * 
     * @param statusCode HTTP status code (e.g., 400, 404, 500)
     * @param message Detailed error message describing the exception
     */
    public AppException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    /**
     * Constructs a new AppException with the specified status code, message, and cause.
     * 
     * @param statusCode HTTP status code (e.g., 400, 404, 500)
     * @param message Detailed error message describing the exception
     * @param cause The underlying cause of this exception
     */
    public AppException(int statusCode, String message, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
    }

    /**
     * Returns the HTTP status code associated with this exception.
     * 
     * @return the HTTP status code
     */
    public int getStatusCode() {
        return statusCode;
    }
}
