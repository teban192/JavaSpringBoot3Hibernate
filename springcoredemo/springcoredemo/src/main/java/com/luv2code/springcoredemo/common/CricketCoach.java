package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In Constructor"+ getClass().getName());
    }
    /*@PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff()"+getClass().getSimpleName());
    }
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStuff()"+getClass().getSimpleName());
    }*/
    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes!";
    }
}
