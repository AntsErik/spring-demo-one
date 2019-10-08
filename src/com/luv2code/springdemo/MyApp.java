package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the object
		//Changing theCoach sub-type from BaseballCoach to the interface Coach -> BaseballCoach theCoach = new BaseballCoach();
		//Changing Baseball coach to TrackCoach -> Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();
		//use the object
		System.out.println(theCoach.getDailyWorkout());

	}

}
