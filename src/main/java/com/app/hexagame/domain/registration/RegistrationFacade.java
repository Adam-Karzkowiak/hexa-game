package com.app.hexagame.domain.registration;


public class RegistrationFacade {

    private final RegistrationRepository repository;

    public RegistrationFacade(final RegistrationRepository repository) {
        this.repository = repository;
    }
}
