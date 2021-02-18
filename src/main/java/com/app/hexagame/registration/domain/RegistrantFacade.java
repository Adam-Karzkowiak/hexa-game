package com.app.hexagame.registration.domain;


import com.app.hexagame.registration.domain.utility.IdProvider;
import com.app.hexagame.registration.infrastructure.entrypoint.RegistrantWriteModel;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class RegistrantFacade {

    private final RegistrantRepository repository;
    private final DomainPasswordEncoder encoder;


    public Registrant simpleRegistration(RegistrantWriteModel writeModel) {
        String id = IdProvider.generateId();
        Registrant registrantBuild = Registrant.builder()
                .id(id)
                .email(writeModel.getEmail())
                .password(Password.encoded(writeModel.getPassword(), encoder))
                .build();
        return repository.save(registrantBuild);
    }
}
