package com.smagin.springcore.value;


import org.springframework.beans.factory.annotation.Value;

public class Main {
    private int integer;

    @Value("${engine.fuelType}")
    private String fuelType;

    public Main(@Value("8") int integer) {
        this.integer = integer;
    }

    //alternatively
/*
    @Value("8")
    public Main( int integer) {
        this.integer = integer;
    }
*/



}
