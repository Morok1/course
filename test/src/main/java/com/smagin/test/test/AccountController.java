package com.smagin.test.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AccountController {

    @GetMapping("/account")
    public ResponseEntity getUserAccount() throws Exception {
        final String VALUE = "Value";
        return Optional
                .ofNullable(VALUE)
                .map(a -> new ResponseEntity<>(a, HttpStatus.OK))
                .orElseThrow(() -> new Exception("Accounts for user doesnot exist!"));
    }

}
