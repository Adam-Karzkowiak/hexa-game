package com.app.hexagame.registration.domain.exceptions;

public class EmailAlreadyExistException extends RuntimeException {
    public EmailAlreadyExistException(String email) {
        super("Email " + email + " taken");
    }
}
