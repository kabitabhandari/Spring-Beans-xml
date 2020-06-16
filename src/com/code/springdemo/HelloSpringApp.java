package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

		public static void main(String[] args) {

			// load the spring configuration file
			ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext("applicationContext.xml");
					
			// retrieve bean from spring container
			Coach theCoach = context.getBean("myCoach", Coach.class); // Coach.class is an INTERFACE
			//FortuneService theFortune = context.getBean("myFortune", FortuneService.class);
			
			// call methods on the bean
			System.out.println(theCoach.getDailyWorkout());
			//System.out.println(theFortune.getFortune());
			
			System.out.println(theCoach.getFortune());
			
			// close the context
			context.close();
}
}
