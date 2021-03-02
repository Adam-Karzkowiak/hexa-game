package com.app.hexagame.registration.domain;

import com.app.hexagame.registration.infrastructure.BCryptEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class RegistrantConfiguration {

    RegistrantFacade registrantFacade() {
        return registrantFacade(new InMemoryRegistrantRepository());
    }

    @Bean
    RegistrantFacade registrantFacade(RegistrantRepository registrantRepository) {
        RegistrantCreator creator = new RegistrantCreator();
        BCryptEncoder encoder = new BCryptEncoder();
        return new RegistrantFacade(registrantRepository, creator, encoder);
    }

}
