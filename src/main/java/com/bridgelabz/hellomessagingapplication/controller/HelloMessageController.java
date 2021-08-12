package com.bridgelabz.hellomessagingapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class HelloMessageController {
    @GetMapping("/get")
    public String hello() {
        return "Hello From Bridgelabz.";
    }
}
