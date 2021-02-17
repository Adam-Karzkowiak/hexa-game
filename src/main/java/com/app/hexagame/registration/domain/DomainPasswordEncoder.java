package com.app.hexagame.registration.domain;

public interface DomainPasswordEncoder {
    String encode(String password);
}
