package com.smagin.springcore.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Driver {
    @Autowired
    private @Qualifier("car") Vehicle vehicle;


}
