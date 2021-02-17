package com.app.hexagame.registration.domain.utility;

public class ValidationService {

    public void isPasswordValid(String password) {

        if (password.length() > 30 || password.length() < 8) {
            throw new IllegalArgumentException("Password must be less than 30 and more than 8 characters in length.");
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars)) {
            throw new IllegalArgumentException("Password must have at least one uppercase character.");
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars)) {
            throw new IllegalArgumentException("Password must have at least one lowercase character");
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers)) {
            throw new IllegalArgumentException("Password must have at least one number");
        }

    }
}
