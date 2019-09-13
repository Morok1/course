package com.smagin.springcore.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("car")
    public Car car(){
        return new Car();
    }
    @Bean("bycycle")
    public Bycycle bike(){
        return new Bycycle();
    }
}
