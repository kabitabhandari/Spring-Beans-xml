package com.code.springdemo;

import java.util.Random;

public class RandomFortuneImpl  implements FortuneService{

	// create an array of strings
		private String[] fortuneArray = { 
				"Beware of the wolf in sheep's clothing",
				"Diligence is the mother of good luck",
				"The journey is the reward"
		};
		
		// create a random number generator
		private Random randomNumberGenerator = new Random();
			
		@Override
		public String getFortune() {
			// pick a random string from the array
			int index = randomNumberGenerator.nextInt(fortuneArray.length);
			
			String theFortune = fortuneArray[index];
			
			return theFortune;
		}
	


}
