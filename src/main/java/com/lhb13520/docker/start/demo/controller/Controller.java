package com.lhb13520.docker.start.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class Controller {

    @GetMapping
    public String hello() {
        return "hello world3! " + LocalDateTime.now();
    }

}
