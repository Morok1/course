package com.smagin.springcore.bean;

import com.smagin.springcore.autowired.Engine;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Config {
    @Bean("engine")
    public Engine engine(){
        return new Engine();
    }
}
