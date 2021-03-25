package com.app.hexagame.registration.domain.exceptions;

public class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String password) {
        super("Password " + password + " is invalid." +
                "The password should be 8-30 characters long" +
                ", contain at least one uppercase" +
                ", one lowercase" +
                ", and one digit");
    }
}
