package com.app.hexagame.registration.infrastructure.entrypoint;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class RegistrantWriteModel {

    @NotNull
    private String email;
    @Min(8)
    @Max(30)
    @NotNull
    private String password;

}
