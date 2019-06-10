package com.mcg.springdemo;

public class TrackCoach implements ICoach {

    private FortuneService fortuneService;

    public TrackCoach(){

    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }

    // add an init method
    public void doMyStartupStuff(){
        System.out.println("TrachCoach: inside method doMyStartupStuff");
    }

    // add a destory method
    public void doMyCleanupStuffYoYo(){
        System.out.println("TrachCoach: inside method doMyCleanupStuffYoYo");
    }
}
