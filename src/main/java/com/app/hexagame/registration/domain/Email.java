package com.app.hexagame.registration.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
class Email {
    String email;

    private Email(String email) {
        this.email = email;
    }

    public static Email create(String email) {
        return new Email(email);
    }
}
