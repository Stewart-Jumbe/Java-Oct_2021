package com.qa.main;
import java.util.Random;

public class IterExercises {
	
	public static String eX1(int num) {
		
		
		int limit = 87;
		Random rando = new Random();
		
		while (num > limit) {
			
			num= num - rando.nextInt(50 - 1)+1; // random number can be as high as 50 and as low as 1 , but not zero
			
			System.out.println(num);
		}
		return "You're spending too much money";
	}

}
