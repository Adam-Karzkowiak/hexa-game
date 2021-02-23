package com.app.hexagame.registration.domain;

import java.util.Optional;

public interface RegistrantRepository {

    Registrant save(Registrant entity);

    Optional<Registrant> findById(String id);
}
