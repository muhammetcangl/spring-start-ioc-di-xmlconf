package com.mcg.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        ICoach theCoach = context.getBean("myCoach",ICoach.class);

        ICoach alphaCoach = context.getBean("myCoach",ICoach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println("Pointing to the same object: " + result);

        System.out.println("Memory location for theCoach: " + theCoach);

        System.out.println("Memory location for alphaCoach: " + alphaCoach);

        context.close();
    }
}
