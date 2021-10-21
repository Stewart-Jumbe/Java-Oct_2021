package com.qa.main;

public class Scope {
	
	// Scope is how accessible the variables / methods / fucntions are
	// Global / Class Level Scope
	// Class level variables / methods are accessible everywhere in the class
	
	
	public static String helloWorld() {
		System.out.println(total);
		return "Hello";
	}

	public static String helloDemo() {
		return helloWorld();
	}
	
	public static int total = 5;

	//Downsides - accidentally messing up every other method, by accessing in use variables
	//Positives - saves time from having to declare the same variable everywhere
	
	//LOCAL SCOPE variables
	//Variables that are declared inside of a method, and can't be used elsewhere
	
	public static void bankAccount() {
		// local variable
		int bankNunber = 123457689;
	}

	//lets say a hacker was trying to expose the local variable created above
	//public static void bigH4ck3r() {
	//	System.out.println(bankNumber);//this WONT WORK
	//}

	
	


}
