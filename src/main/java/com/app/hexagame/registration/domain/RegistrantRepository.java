package com.app.hexagame.registration.domain;

import io.vavr.control.Option;
import org.springframework.data.repository.Repository;

import java.util.List;

interface RegistrantRepository extends Repository<Registrant, String> {

    Registrant save(Registrant entity);

    Option<Registrant> findOneById(String id);

    List<Registrant> findAll();

    void delete(String id);

    boolean existsByEmail(Email email);

    boolean existsByUsername(Username username);
}
