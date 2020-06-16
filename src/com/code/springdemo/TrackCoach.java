package com.code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
	}
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "run run run run";
	}

	@Override
	public String getFortune() {
	
		return fortuneService.getFortune();
	}
	
	// add init method  : always use void becauise it wont return anything
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach: inside method doMyStartUpStuff ()");
	}
	
	//add destroy method
	public void doMyCleanUpStuff() {
		System.out.println("TrackCoach: inside method doMyCleanUpStuff ()");
	}
	
	
}
