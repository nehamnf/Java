package com.banking.exception;

public class InvalidOperationException  extends AppException{

    public InvalidOperationException(String message) {
        super(400, message);
    }
}
