package com.upgrad.hirewheels.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HireWheelsRest {
    @GetMapping("/")
        public String Hello () {

        return "Hello World " + LocalDateTime.now();
    }}


