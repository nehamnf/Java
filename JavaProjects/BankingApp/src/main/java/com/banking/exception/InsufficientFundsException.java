package com.banking.exception;

/**
 * Exception thrown when attempting to withdraw more funds than available in an account.
 * 
 * This exception is used to indicate that a banking operation cannot be completed
 * due to insufficient account balance. Common scenarios include withdrawal attempts,
 * transfer operations, or any debit transaction that would result in a negative balance.
 * 
 * HTTP Status: 400 Bad Request
 * 
 * @author Banking App Team
 * @version 1.0
 */
public class InsufficientFundsException extends AppException{
    
    /**
     * Constructs a new InsufficientFundsException with the specified error message.
     * 
     * @param message Detailed error message describing the insufficient funds situation
     */
    public InsufficientFundsException( String message) {
        super(400, message);
    }
}
