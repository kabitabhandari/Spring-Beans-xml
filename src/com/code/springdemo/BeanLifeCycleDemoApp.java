package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("beanLifeCycleApplicationContext.xml");
		
		// retrieve beans from spring container
		
		Coach coach1 = context.getBean("myCoach", Coach.class);
		System.out.println(coach1.getDailyWorkout());
		
		// close context
		context.close();
	}

}
