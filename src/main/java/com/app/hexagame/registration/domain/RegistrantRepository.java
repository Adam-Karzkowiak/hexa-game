package com.app.hexagame.registration.domain;

import org.springframework.data.repository.Repository;

import java.util.List;

interface RegistrantRepository extends Repository<Registrant, String> {

    Registrant save(Registrant entity);

    List<Registrant> findAll();

    void delete(String id);

    boolean existsByEmail(Email email);

    boolean existsByUsername(Username username);
}
