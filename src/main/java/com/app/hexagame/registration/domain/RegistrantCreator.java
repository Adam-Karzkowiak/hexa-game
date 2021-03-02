package com.app.hexagame.registration.domain;

import com.app.hexagame.registration.domain.entrypoint.RegistrantWriteModel;
import static java.util.Objects.requireNonNull;

class RegistrantCreator {


    Registrant from(RegistrantWriteModel writeModel,DomainPasswordEncoder encoder) {
        requireNonNull(writeModel);
        String id = IdProvider.generateId();
        return Registrant.builder()
                .id(id)
                .email(Email.create(writeModel.getEmail()))
                .password(Password.encoded(writeModel.getPassword(), encoder))
                .build();
    }
}
