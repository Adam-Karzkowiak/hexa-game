package com.app.hexagame.registration.domain;

import com.sun.istack.NotNull;


class Password {
    @NotNull
    String password;

    Password(String password) {
        this.password = password;
    }
}
