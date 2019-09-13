package com.smagin.springcore.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

//   remove @Autowired  get NullPointerException
    private Car car;
//     required with a default value of true.
    @Autowired(required = false)
    public Controller(Car car) {
        this.car = car;
    }

    @GetMapping("/")
    public String hello(){
        return car.hello();
    }
}
