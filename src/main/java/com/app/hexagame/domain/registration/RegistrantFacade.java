package com.app.hexagame.domain.registration;


import com.app.hexagame.domain.registration.dto.RegistrantWriteModel;
import com.app.hexagame.domain.utility.IdentifierProvider;
import com.app.hexagame.domain.utility.ValidationService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.URI;
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
