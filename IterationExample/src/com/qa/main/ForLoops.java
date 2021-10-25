package com.qa.main;

public class ForLoops {
	
	// For loops primarily work with numerical values
	// They will run for a set number of times, based on how they've been configured
	
	//For loops have four components to configure
	//Initialisation (initial value)
	// Condition (what we're checking for)
	// Iterator (How we loop through the code)
	// Body (What code we are looping)
	
	public static void countToTen() {
		
		
		for(
				int i=0;//initialisatioon - starting from the value 0
				i < 10; // Condition - Do this code while i is less than 10
				i++		//Iterator - we're adding 1 to i after every loop
				) {
			System.out.println(i);//body - what code will display
		}
	}
	
	public static void countDownFromTen() {
		
		for(int i =10; i >=0 ; i--) {
			System.out.println("The value of i is: "+ i);
		}
	}
	
	public static void cointInFours() {
		for (int i = 5; i <123; i+=4) {
			System.out.println("Value of i is "+ i);
		}
	}
	
	public static void countWithParams( int x, int y, int z) {
		for(int i = x; i > y; i+=z) {
			System.out.println("Value of i is " + i);
	}
	}
	}
		


