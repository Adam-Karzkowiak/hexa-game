package com.app.hexagame.registration.infrastructure;

import com.app.hexagame.registration.domain.Registrant;
import com.app.hexagame.registration.domain.RegistrantRepository;
import org.springframework.data.jpa.repository.JpaRepository;

interface SqlRegistrantRepository extends RegistrantRepository, JpaRepository<Registrant, String> {
}
