package com.app.hexagame.domain.registration;


import java.time.LocalDateTime;

class Registrant {
    int id;
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
