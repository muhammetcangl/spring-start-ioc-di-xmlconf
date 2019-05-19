package com.mcg.springdemo;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "The happy fortune service";
    }
}
