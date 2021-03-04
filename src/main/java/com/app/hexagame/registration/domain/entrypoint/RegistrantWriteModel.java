package com.app.hexagame.registration.domain.entrypoint;

import com.app.hexagame.registration.infrastructure.validation.ValidPassword;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Builder
@Getter
public class RegistrantWriteModel {

    @NotNull
    @Email
    private String email;

    @NotNull
    @Min(4)
    @Max(16)
    private String username;

    @NotNull
    @ValidPassword
    private String password;

}
