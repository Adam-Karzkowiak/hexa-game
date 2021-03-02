package com.app.hexagame.registration.domain;


import com.app.hexagame.registration.domain.entrypoint.RegistrantWriteModel;

import static java.util.Objects.requireNonNull;

public class RegistrantFacade {

    private RegistrantRepository repository;
    private RegistrantCreator creator;
    private DomainPasswordEncoder encoder;

    RegistrantFacade(final RegistrantRepository repository,
                     final RegistrantCreator creator,
                     final DomainPasswordEncoder encoder) {
        this.repository = repository;
        this.creator = creator;
        this.encoder = encoder;
    }

    public Registrant simpleRegistration(RegistrantWriteModel writeModel) {
        requireNonNull(writeModel);
        Registrant registrant = creator.from(writeModel,encoder);
        return repository.save(registrant);
    }

}
