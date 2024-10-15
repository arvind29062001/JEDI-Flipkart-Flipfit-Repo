package com.flipfit.exceptions;

/**
 * Exception thrown when user is invalid
 * @Author Pratik Singh
 */
public class UserInvalidException extends Exception {
    public UserInvalidException(String message) {
        super(message);
    }
}