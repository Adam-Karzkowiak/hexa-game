package com.app.hexagame.registration.domain;



class Password {

    String password;

    private Password(String password) {
        this.password = password;
    }

    public static Password encoded(String password, DomainPasswordEncoder domainEncoder) {
        return new Password(domainEncoder.encode(password));
    }
}
