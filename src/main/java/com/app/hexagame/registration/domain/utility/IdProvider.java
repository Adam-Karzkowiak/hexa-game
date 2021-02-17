package com.app.hexagame.registration.domain.utility;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.UUID;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IdProvider {

    public static String generateId(){
        return UUID.randomUUID().toString();
    }


}
