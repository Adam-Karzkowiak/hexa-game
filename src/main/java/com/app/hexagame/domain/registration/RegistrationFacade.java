package com.app.hexagame.domain.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationFacade {

    private final RegistrationRepository repository;

    @Autowired
    public RegistrationFacade(final RegistrationRepository repository) {
        this.repository = repository;
    }
}
