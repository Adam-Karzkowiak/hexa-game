package com.app.hexagame.registration.domain;


import lombok.Builder;

@Builder
public class Registrant {
    String id;
    Email email;
    Username username;
    Password password;

    public String getId() {
        return id;
    }

}
