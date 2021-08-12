
package com.bridgelabz.hellomessagingapplication.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/welcome")
public class HelloMessageController {

    //UC-1 GET Request Method to display a message
    @GetMapping("/get")
    public String hello() {
        return "Hello From Bridgelabz.";
    }

    //UC-2 GET Request Method to pass name as query parameters
    @GetMapping("/queryparam")
    public String hello(@RequestParam(value = "name" ) String name ) {
        return "Hello " + name + " from Bridgelabz.";
    }

    //UC-3 GET Request Method to pass name as Path Variable
    @GetMapping("/hello/{name}")
    public String helloMessage(@PathVariable("name") String name){
        return "Hello " + name + " from Bridgelabz.";
    }
}
