package com.luv2code.springdemo;

public class BasketballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public BasketballCoach() {
	}
	
	@Override
	public String getDailyWorkout() {
		return "Shoot 50 3-pointers!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " Fly baby, fly!";
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("BasketballCoach: inside method doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("BasketballCoach: inside method doMyCleanupStuff");
	}

}
