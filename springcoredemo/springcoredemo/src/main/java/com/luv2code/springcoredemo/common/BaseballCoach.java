package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    public BaseballCoach(){
        System.out.println("In Constructor"+ getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spring 30 minutes in batting practice";
    }
}
