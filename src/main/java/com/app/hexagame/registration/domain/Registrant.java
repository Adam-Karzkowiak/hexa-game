package com.app.hexagame.registration.domain;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

class Registrant {
    int id;
    @Email
    @NotNull
    String email;
    Password password;
    LocalDateTime createdOn;

    Registrant(int id, String email, Password password, LocalDateTime createdOn) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.createdOn = createdOn;
    }

    int getId() {
        return id;
    }

}
