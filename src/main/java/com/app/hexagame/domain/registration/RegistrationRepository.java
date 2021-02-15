package com.app.hexagame.domain.registration;

import com.app.hexagame.domain.registration.dto.RegistrationWriteModel;
import org.springframework.data.jpa.repository.JpaRepository;

interface RegistrationRepository extends JpaRepository<Integer, Registration> {

    Registration save(RegistrationWriteModel writeModel);
}
