package com.smagin.springcore.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Biker {
    @Autowired
    @Qualifier("bike")
    private Vehicle vehicle;
}
