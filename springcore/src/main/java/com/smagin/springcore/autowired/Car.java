package com.smagin.springcore.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Car {
    @Autowired
    private Engine engine;

    public String hello(){
        return engine.hello();
    }

}
