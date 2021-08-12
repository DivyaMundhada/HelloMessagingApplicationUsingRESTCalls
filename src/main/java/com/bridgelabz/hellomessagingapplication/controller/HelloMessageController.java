package com.bridgelabz.hellomessagingapplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class HelloMessageController {
    @GetMapping("/get")
    public String hello() {
        return "Hello From Bridgelabz.";
    }

    @GetMapping("/queryparam")
    public String hello(@RequestParam(value = "name" ) String name ) {
        return "Hello " + name + " from Bridgelabz.";
    }
}
