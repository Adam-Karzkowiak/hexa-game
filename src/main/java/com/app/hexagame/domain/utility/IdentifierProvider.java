package com.app.hexagame.domain.utility;

public class IdentifierProvider {
    static int id = 0;

    public int getId() {
        return ++id;
    }
}