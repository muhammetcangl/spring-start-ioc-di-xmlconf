package com.mcg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //create object

        ICoach theCoach = new TrackCoach();

        //use the object
        System.out.printf(theCoach.getDailyWorkout());
    }
}
