package com.app.hexagame.registration.domain;


import lombok.Builder;

@Builder
class Registrant {
    String id;
    String email;
    Username username;
    Password password;

    String getId() {
        return id;
    }

}
