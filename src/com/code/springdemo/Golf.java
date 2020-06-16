package com.code.springdemo;

public class Golf  implements Coach{
	private FortuneService fortuneService;
	
	public Golf(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return " this is golf time ... load...";
	}

	@Override
	public String getFortune() {

		return fortuneService.getFortune();
	}

}
