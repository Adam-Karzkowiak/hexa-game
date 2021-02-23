package com.app.hexagame.registration.domain;

public interface RegistrantRepository {

    Registrant save(Registrant entity);

    Registrant findById(String id);
}
