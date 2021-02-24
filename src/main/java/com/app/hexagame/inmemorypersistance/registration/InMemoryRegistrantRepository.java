package com.app.hexagame.inmemorypersistance.registration;

import com.app.hexagame.registration.domain.Registrant;
import com.app.hexagame.registration.domain.RegistrantRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryRegistrantRepository implements RegistrantRepository {
    private HashMap<String, Registrant> runtimeRepo = new HashMap<>();

    @Override
    public Registrant save(final Registrant entity) {
        runtimeRepo.put(entity.getId(), entity);
        return entity;
    }

    @Override
    public Registrant findById(String id) {
        return runtimeRepo.get(id);
    }

    @Override
    public List<Registrant> findAll() {
        return new ArrayList<>(runtimeRepo.values());
    }

    @Override
    public void delete(final String id) {
        runtimeRepo.remove(id);
    }
}
