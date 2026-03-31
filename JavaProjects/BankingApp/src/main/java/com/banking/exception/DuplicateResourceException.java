package com.banking.exception;

public class DuplicateResourceException extends AppException{

    public DuplicateResourceException(String message) {
        super(409, message);
    }
}
