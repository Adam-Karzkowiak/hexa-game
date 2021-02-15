package com.app.hexagame.domain.registration;


import com.app.hexagame.domain.registration.dto.RegistrationWriteModel;
import com.app.hexagame.domain.utility.IdentifierProvider;
import com.app.hexagame.domain.utility.ValidationService;

public class RegistrationFacade {

    private final RegistrationRepository repository;
    private final ValidationService validation;
    private final IdentifierProvider identifier;

    public RegistrationFacade(final RegistrationRepository repository, final ValidationService validation, final IdentifierProvider identifier) {
        this.repository = repository;
        this.validation = validation;
        this.identifier = identifier;
    }


    Registration simpleRegistration(RegistrationWriteModel writeModel) {

    }
}
