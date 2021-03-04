package com.app.hexagame.registration.domain.exceptions;

public class UsernameAlreadyExistException extends RuntimeException {

    public UsernameAlreadyExistException(String username) {
        super("Username " + username + " taken");
    }
}
