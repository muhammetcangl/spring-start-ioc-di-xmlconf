package com.mcg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        //load the spring conf file

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        //retreive bean from spring container
        ICoach theCoach = context.getBean("myCoach", ICoach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        //let's call our new method for fortunes
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
