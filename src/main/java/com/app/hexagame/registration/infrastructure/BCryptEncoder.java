package com.app.hexagame.registration.infrastructure;


import com.app.hexagame.registration.domain.DomainPasswordEncoder;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RequiredArgsConstructor
public class BCryptEncoder implements DomainPasswordEncoder {
    private final BCryptPasswordEncoder bcrypt;

    @Override
    public String encode(final String password) {
        return bcrypt.encode(password);
    }
}
