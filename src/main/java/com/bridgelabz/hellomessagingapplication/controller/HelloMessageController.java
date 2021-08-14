
package com.bridgelabz.hellomessagingapplication.controller;

import com.bridgelabz.hellomessagingapplication.dto.UserDTO;
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

    //UC-4 POST Request Method to pass first name and last name in the Body
    @PostMapping("/post")
    public UserDTO hello(@RequestBody UserDTO user) {
        return user;
    }

   //UC-5 PUT Request Method and pass first name as Path Variable and last name as Query Parameter
    @PutMapping("/put/{firstName}")
    public String hello1(@PathVariable("firstName") String firstName ,@RequestParam(value ="lastName")  String lastName){
        return "Hello "+ firstName+" "+lastName+" from Bridgelabz.";
    }
}