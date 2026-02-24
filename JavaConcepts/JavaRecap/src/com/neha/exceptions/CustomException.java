package com.neha.exceptions;

class MyCustomException extends RuntimeException {

    public MyCustomException() {
        super("This is my custom Exception");
    }

}

public class CustomException {
    public static void main(String[] args) {
        try {
            throw new MyCustomException();
        } catch (MyCustomException e) {
           e.printStackTrace();
        }

    }
}
