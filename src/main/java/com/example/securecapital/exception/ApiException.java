package com.example.securecapital.exception;

public class ApiException extends RuntimeException{
    public ApiException(String message){
        super(message);
    }
}
