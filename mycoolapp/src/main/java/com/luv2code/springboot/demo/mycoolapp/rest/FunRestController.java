package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose a "/" that returns "hello word"
    @GetMapping("/")
    public String saidHello(){
        return "Hello world";
    }
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day!";
    }
}
