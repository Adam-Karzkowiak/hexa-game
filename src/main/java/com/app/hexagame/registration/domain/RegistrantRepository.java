package com.app.hexagame.registration.domain;

import java.util.List;

public interface RegistrantRepository {

    Registrant save(Registrant entity);

    Registrant findById(String id);

    List<Registrant> findAll();

    Registrant delete(String id);
}
