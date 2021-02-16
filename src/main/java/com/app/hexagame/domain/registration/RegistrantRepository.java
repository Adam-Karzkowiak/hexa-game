package com.app.hexagame.domain.registration;

import com.app.hexagame.domain.registration.dto.RegistrantWriteModel;
import org.springframework.data.jpa.repository.JpaRepository;

interface RegistrantRepository extends JpaRepository<Integer, Registrant> {

    Registrant save(RegistrantWriteModel writeModel);
}
