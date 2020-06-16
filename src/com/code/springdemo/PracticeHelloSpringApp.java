package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Coach scoach= context.getBean("mySwimCoach", Coach.class);
	System.out.println(scoach.getDailyWorkout());
	System.out.println(scoach.getFortune());
	context.close();
}
}