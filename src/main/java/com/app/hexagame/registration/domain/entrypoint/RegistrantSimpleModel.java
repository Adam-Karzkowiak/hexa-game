package com.app.hexagame.registration.domain.entrypoint;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegistrantSimpleModel {
    String id;
    String email;
    String username;
}
