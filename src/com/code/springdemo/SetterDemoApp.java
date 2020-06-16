package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		//retrieve bean from spring container
		//Coach coach = context.getBean("myCricketCoach", Coach.class); // coach ko object which is interface
		
		
			CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);  // CricketCoachko obj which is implementing class of interface jun garda ni OK
		
		// call methods on bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
		// close the context
		context.close();
		
		
	}

}
