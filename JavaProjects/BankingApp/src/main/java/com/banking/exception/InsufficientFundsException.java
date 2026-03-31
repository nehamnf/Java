package com.banking.exception;

public class InsufficientFundsException extends AppException{
    public InsufficientFundsException( String message) {
        super(400, message);
    }
}
