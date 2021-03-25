package com.app.hexagame.registration.domain;


import com.app.hexagame.registration.domain.exceptions.InvalidPasswordException;
import lombok.Getter;

@Getter
class Password {


    String password;

    private Password(String password) {
        this.password = password;
    }

    public static Password encoded(String password, DomainPasswordEncoder domainEncoder) {
        if (!passwordValidation(password)) {
            throw new InvalidPasswordException(password);
        }
        return new Password(domainEncoder.encode(password));
    }

    private static boolean passwordValidation(String password) {
        if (password.length() > 30 || password.length() < 8) {
            throw new IllegalArgumentException("Password length should be x<30, x>8");
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars)) {
            return false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars)) {
            return false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers)) {
            return false;
        }
        return true;
    }
}
