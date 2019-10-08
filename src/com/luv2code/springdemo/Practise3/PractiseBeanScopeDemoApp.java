package com.luv2code.springdemo.Practise3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PractiseBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScopePractise-applicationContext.xml");
		
		//retrieve bean from the spring container
		Coach headCoach = context.getBean("myBasketballCoach", Coach.class);
		Coach assistantCoach = context.getBean("myBasketballCoach", Coach.class);
		
		//check to see if these are the same beans
		boolean result = (headCoach == assistantCoach);
		
		//print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for headCoach: " + headCoach);
		
		System.out.println("\nMemory location for assistantCoach: " + assistantCoach + "\n");
		
		//close the context
		context.close();
	}

}
