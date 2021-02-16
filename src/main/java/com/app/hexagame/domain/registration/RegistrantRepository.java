package com.app.hexagame.domain.registration;

import org.springframework.data.jpa.repository.JpaRepository;

interface RegistrantRepository extends JpaRepository<Integer, Registrant> {

    Registrant save(Registrant entity);
}
