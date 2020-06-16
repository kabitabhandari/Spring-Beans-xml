package com.code.springdemo;

public class BaseballCoach implements Coach {

	//define a private field for dependency
	private FortuneService fortuneService;
	
	
	
	public BaseballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getFortune() {
		
		return fortuneService.getFortune();
	}
	

}
