package com.code.springdemo;

public class CricketCoach implements Coach{
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() { //no arg const
		 System.out.println("inside Cricket Coach 0 arg const");
	}

	public void setFortuneService(FortuneService fortuneService) { // setter method
		System.out.println("inside setter");
		this.fortuneService = fortuneService;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
	
		return "new new new practice fast bowling";
	}

	@Override
	public String getFortune() {

		return fortuneService.getFortune();
	}

}
