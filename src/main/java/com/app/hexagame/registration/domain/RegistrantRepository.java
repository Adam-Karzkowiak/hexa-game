package com.app.hexagame.registration.domain;

import io.vavr.control.Option;

import java.util.List;

public interface RegistrantRepository {

    Registrant save(Registrant entity);

    Option<Registrant> findById(String id);

    List<Registrant> findAll();

    void delete(String id);

    boolean existsByEmail(Email email);

    boolean existsByUsername(Username username);
}
