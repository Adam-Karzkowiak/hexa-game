package com.app.hexagame.inmemorypersistance.registration;

import com.app.hexagame.registration.domain.Registrant;
import com.app.hexagame.registration.domain.RegistrantRepository;
import com.app.hexagame.registration.domain.utility.IdProvider;

import java.util.HashMap;
import java.util.Map;

public class InMemoryRegistrantRepository implements RegistrantRepository {
    private Map<IdProvider, Registrant> runtimeRepo = new HashMap<>();

    @Override
    public Registrant save(final Registrant entity) {
        runtimeRepo = runtimeRepo.put(entity.getId(), entity);
        return entity;
    }
}
