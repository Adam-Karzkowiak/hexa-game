package com.app.hexagame.registration;

import com.app.hexagame.inmemorypersistance.registration.InMemoryRegistrantRepository;
import com.app.hexagame.registration.domain.DomainPasswordEncoder;
import com.app.hexagame.registration.domain.Registrant;
import com.app.hexagame.registration.domain.RegistrantFacade;
import com.app.hexagame.registration.infrastructure.entrypoint.RegistrantWriteModel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RegistrantFacadeTest {

    private RegistrantFacade facade;
    private InMemoryRegistrantRepository inMemo;
    private DomainPasswordEncoder domainPasswordEncoder;

    @BeforeAll
    void setUp() {
        inMemo = new InMemoryRegistrantRepository();
        facade = new RegistrantFacade(inMemo, domainPasswordEncoder);
    }

    @Test
    @DisplayName("should save object to db")
    void test1() {
        RegistrantWriteModel entity = new RegistrantWriteModel();
        Registrant registrant = new Registrant()
        facade.simpleRegistration()
    }
}
