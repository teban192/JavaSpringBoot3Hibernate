package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for the dependency
    private Coach myCoach;
    //define a constructor for dependency injection
    @Autowired
//    Setter injection
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }
//    Constructor Injection
    public DemoController(@Qualifier ("cricketCoach")Coach theCoach){
        System.out.println("In Constructor"+ getClass().getName());
        myCoach = theCoach;
    }
    //using with primary
//    public DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }



    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
