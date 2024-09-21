package com.example.crud.exceptions;

public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException() {
        super("Data not found");
    }

    public DataNotFoundException(String message) {
        super(message);
    }
}
