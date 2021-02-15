package com.app.hexagame.domain.registration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface RegistrationRepository extends JpaRepository<Integer, Registration> {

}
