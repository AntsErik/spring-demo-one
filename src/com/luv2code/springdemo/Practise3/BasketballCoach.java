package com.luv2code.springdemo.Practise3;

public class BasketballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Shoot 50 3-pointers!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " Fly baby, fly!";
	}

}
