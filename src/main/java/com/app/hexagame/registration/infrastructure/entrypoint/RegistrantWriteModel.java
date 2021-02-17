package com.app.hexagame.registration.infrastructure.entrypoint;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class RegistrantWriteModel {

    @NotNull
    private String email;
    @Min(8)
    @Max(30)
    @NotNull
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
}
