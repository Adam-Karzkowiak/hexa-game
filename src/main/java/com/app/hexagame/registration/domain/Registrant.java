package com.app.hexagame.registration.domain;


import com.app.hexagame.registration.domain.entrypoint.RegistrantSimpleModel;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Registrant {
    String id;
    Email email;
    Username username;
    Password password;



    public RegistrantSimpleModel toSimpleModel() {
        return RegistrantSimpleModel.builder()
                .id(this.getId())
                .email(email.getEmail())
                .username(username.getUsername())
                .password(password.getPassword())
                .build();
    }
}
