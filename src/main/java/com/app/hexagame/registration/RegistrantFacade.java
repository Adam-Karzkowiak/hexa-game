package com.app.hexagame.registration;


import com.app.hexagame.registration.domain.Password;
import com.app.hexagame.registration.domain.Registrant;
import com.app.hexagame.registration.infrastructure.entrypoint.RegistrantWriteModel;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;

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
        int id = identifier.getId();
        String encodedPassword = passwordEncoder.encode(writeModel.getPassword());
        Password password = new Password(encodedPassword);
        Registrant registrant = new Registrant(
                id,
                writeModel.getEmail(),
                password,
                LocalDateTime.now()
        );
        return repository.save(registrant);


    }
}
