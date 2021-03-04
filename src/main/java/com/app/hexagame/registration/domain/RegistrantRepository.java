package com.app.hexagame.registration.domain;

import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

interface RegistrantRepository extends Repository<Registrant, String> {

    Registrant save(Registrant entity);

    Optional<Registrant> findOneById(String id);

    List<Registrant> findAll();

    void delete(String id);

    boolean existsByEmail(Email email);

    boolean existsByUsername(Username username);
}
