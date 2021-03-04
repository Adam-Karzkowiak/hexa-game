package com.app.hexagame.registration.domain;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
class IdProvider {

    public static String generateId(){
        return UUID.randomUUID().toString();
    }


}
