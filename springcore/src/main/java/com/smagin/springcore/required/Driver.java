package com.smagin.springcore.required;

import org.springframework.beans.factory.annotation.Autowired;

public class Driver {

    private Engine engine;

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
