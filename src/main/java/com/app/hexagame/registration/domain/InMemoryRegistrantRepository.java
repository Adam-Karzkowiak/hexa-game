package com.app.hexagame.registration.domain;


import io.vavr.collection.Seq;
import io.vavr.collection.HashMap;
import io.vavr.collection.Map;

import java.util.*;

class InMemoryRegistrantRepository implements RegistrantRepository {
    private Map<String, Registrant> runtimeRepo = HashMap.empty();

    @Override
    public Registrant save(final Registrant entity) {
        runtimeRepo = runtimeRepo.put(entity.getId(), entity);
        return entity;
    }

    @Override
    public List<Registrant> findAll() {
        Seq<Registrant> sequence = runtimeRepo.values();
        return sequence.toJavaList();
    }

    @Override
    public void delete(final String id) {
        runtimeRepo = runtimeRepo.remove(id);
    }


    @Override
    public boolean existsByEmail(final Email email) {
        return runtimeRepo.exists(entity -> entity._2
                .toSimpleModel()
                .getEmail()
                .equals(email.getEmail()));
    }

    @Override
    public boolean existsByUsername(final Username username) {
        return runtimeRepo.exists(entity -> entity._2
                .toSimpleModel()
                .getUsername()
                .equals(username.getUsername()));
    }
}
