package com.smagin.springcore.autowired;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class Engine {
    private static Logger logger = Logger.getLogger(Engine.class.getSimpleName());

    public String  hello() {
        return "care";
    }
}
