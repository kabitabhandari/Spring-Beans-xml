package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("beanScopeapplicationContext.xml");
		
		// retrieve beans from spring container
		
		Coach coach1 = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);
		//check if they are same bean
		boolean result = (coach1== coach2);
		//print results
		System.out.println("\nPointing to same object     "+ result);
		
		System.out.println("\nMemory location for the coach1"+ coach1);
		System.out.println("\nMemory location for the coach2"+ coach2);
		
		// close context
		context.close();
	}

}
