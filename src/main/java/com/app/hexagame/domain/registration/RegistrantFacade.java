package com.app.hexagame.domain.registration;


import com.app.hexagame.domain.registration.dto.RegistrantWriteModel;
import com.app.hexagame.domain.utility.IdentifierProvider;
import com.app.hexagame.domain.utility.ValidationService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class RegistrantFacade {

    private final RegistrantRepository repository;
    private final ValidationService validation;
    private final IdentifierProvider identifier;
    private final BCryptPasswordEncoder passwordEncoder;

    public RegistrantFacade(final RegistrantRepository repository, final ValidationService validation, final IdentifierProvider identifier, final BCryptPasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.validation = validation;
        this.identifier = identifier;
        this.passwordEncoder = passwordEncoder;
    }


    Registrant simpleRegistration(RegistrantWriteModel writeModel) {

    }
}
