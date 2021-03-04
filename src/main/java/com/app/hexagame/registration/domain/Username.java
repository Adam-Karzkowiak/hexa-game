package com.app.hexagame.registration.domain;

import lombok.Getter;

@Getter
class Username {

    String username;

    private Username(String username) {
        this.username = username;
    }

    public static Username create(String username) {
        return new Username(username);
    }
}
