package com.app.hexagame.domain.registration;

import org.springframework.security.crypto.bcrypt.BCrypt;

class Password {
    String password;

    Password(final String password) {
        BCrypt.hashpw(password, this.password);
    }
}
