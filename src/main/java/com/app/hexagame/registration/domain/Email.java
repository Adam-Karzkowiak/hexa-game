package com.app.hexagame.registration.domain;

class Email {
    String email;

    private Email(String email) {
        this.email = email;
    }

    public static Email create(String email) {
        return new Email(email);
    }
}
