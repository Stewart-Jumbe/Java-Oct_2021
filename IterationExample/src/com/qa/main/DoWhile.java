package com.qa.main;

import java.util.Random;

public class DoWhile {

//	public static void basicExample() {
//		boolean testBool = true;
//		
//		System.out.println("Before loop");
//		// While testBool is false testbool ==false
//		while(!testBool) {
//			System.out.println("Will ths ever print??");
//		}
//		System.out.println("After loop");
//		
//		// Do While - Will always run Once before checking the code
//		
//		do {
//			System.out.println("printed from the do while loop?");
//		} while(!testBool);
//	}
	
public static String eX1DoWhile(int num) {
		
		
		int limit = 87;
		Random rando = new Random();
		do { System.out.println("Your current balance is "+ num);
		
		}while (num > limit); {
			
			num= num - rando.nextInt(50 - 1)+1; // random number can be as high as 50 and as low as 1 , but not zero
			
			System.out.println(num);
		}
		return "You're spending too much money";
	}

	
}
