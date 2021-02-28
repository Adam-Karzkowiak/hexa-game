package com.app.hexagame.registration.domain;


import lombok.Getter;

@Getter
class Password {

    String password;

    private Password(String password) {
        this.password = password;
    }

    public static Password encoded(String password, DomainPasswordEncoder domainEncoder) {
        return new Password(domainEncoder.encode(password));
    }
}
