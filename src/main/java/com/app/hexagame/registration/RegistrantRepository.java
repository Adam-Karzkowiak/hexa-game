package com.app.hexagame.registration;

import com.app.hexagame.registration.domain.Registrant;
import org.springframework.data.jpa.repository.JpaRepository;

interface RegistrantRepository extends JpaRepository<Integer, Registrant> {

    Registrant save(Registrant entity);
}
