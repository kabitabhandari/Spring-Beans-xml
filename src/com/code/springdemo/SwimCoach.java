package com.code.springdemo;

public class SwimCoach implements Coach{
private RandomFortuneImpl randomFortune;
	


	public SwimCoach() {

}

	
	public SwimCoach(RandomFortuneImpl randomFortune) {
		this.randomFortune = randomFortune;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Swim in the sea @ 15m per hr";
	}

	@Override
	public String getFortune() {
		
		return randomFortune.getFortune();
	}

}
