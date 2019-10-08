package com.luv2code.springdemo.Practise3;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	
	// random number generation
	private Random myRandomNumber = new Random();
	
	// Array of fortunes
	private String[] fortuneArray = { 
			"Look out for the Python!",
			"Repetition is the grandfather of mastery!",
			"Never look down, never give up!"
	};
	
	@Override
	public String getFortune() {
		// choose a random member of array
		int randomNumber = myRandomNumber.nextInt(fortuneArray.length);
		
		String theFortune = fortuneArray[randomNumber];
		
		return theFortune;
	}

}
