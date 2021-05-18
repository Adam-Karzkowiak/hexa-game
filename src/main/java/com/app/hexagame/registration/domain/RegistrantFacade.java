package com.app.hexagame.registration.domain;


import com.app.hexagame.registration.domain.entrypoint.RegistrantSimpleModel;
import com.app.hexagame.registration.domain.entrypoint.RegistrantWriteModel;
import com.app.hexagame.registration.domain.exceptions.EmailAlreadyExistException;
import com.app.hexagame.registration.domain.exceptions.UsernameAlreadyExistException;
import io.vavr.control.Option;

import java.util.Optional;

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

    public String simpleRegistration(RegistrantWriteModel writeModel) {
        requireNonNull(writeModel);
        Email checkEmail = Email.create(writeModel.getEmail());
        Username checkUsername = Username.create(writeModel.getUsername());
        if (repository.existsByEmail(checkEmail)) {
            throw new EmailAlreadyExistException(checkEmail.getEmail());
        }
        if (repository.existsByUsername(checkUsername)) {
            throw new UsernameAlreadyExistException(checkUsername.getUsername());
        }
        Registrant registrant = creator.from(writeModel, encoder);
        repository.save(registrant);
        return registrant.getId();
    }

    public Optional<RegistrantSimpleModel> showRegistrant(String id) {
        Option<Registrant> registrant = repository.findOneById(id);
        RegistrantSimpleModel simpleModel = registrant.get().toSimpleModel();
        return Optional.of(simpleModel);
    }

}
