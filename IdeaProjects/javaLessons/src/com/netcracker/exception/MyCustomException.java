package com.netcracker.exception;

public class MyCustomException extends Exception{
    public MyCustomException(String message) {
        super(message);
    }

    public MyCustomException() {
    }
}
