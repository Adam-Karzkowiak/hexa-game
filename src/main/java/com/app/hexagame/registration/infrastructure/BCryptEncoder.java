package com.app.hexagame.registration.infrastructure;


import com.app.hexagame.registration.domain.DomainPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptEncoder implements DomainPasswordEncoder {
    private BCryptPasswordEncoder bcrypt;

    @Override
    public String encode(final String password) {
        return bcrypt.encode(password);
    }
}
