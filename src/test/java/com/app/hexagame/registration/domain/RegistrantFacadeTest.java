package com.app.hexagame.registration.domain;

import com.app.hexagame.registration.domain.entrypoint.RegistrantWriteModel;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RegistrantFacadeTest {

    private RegistrantFacade facade;

    @BeforeEach
    public void setUp() {
        facade = new RegistrantConfiguration().registrantFacade();
    }

    @Test
    @DisplayName("should save registrant to repository")
    void shouldSaveRegistrantToRepository() {
        String registrantId = facade.simpleRegistration(RegistrantWriteModel.builder()
                .email("adam@adam.pl")
                .password("HasloJeden123&")
                .username("Adam")
                .build());
        Assertions.assertThat(facade.showRegistrant(registrantId).isPresent()).isTrue();
    }

//    @Test
//    @DisplayName("should throw UsernameAlreadyExistException")
//    public void whenUsernameAlreadyExistsInDb() {
//
//        UsernameAlreadyExistException e = org.junit.jupiter.api.Assertions.assertThrows()
//            @Override
//            public void execute() throws Throwable {
//
//            }
//        })
//
//        Assertions.assertThat()
//
//    }


}
