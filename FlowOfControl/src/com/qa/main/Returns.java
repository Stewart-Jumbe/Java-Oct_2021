package com.qa.main;

public class Returns {

	//Methods run blocks of repeatable code
	//Methods run the code until either
		//The body ends
		//or The method RETURNS something
	
	
	public static void printHello() {
		System.out.println("Hello");
	}
	
	//void = returns nothing
	//Java is explicitly data typed, meaning you have to define what data it returns
	public static String returnHello() {
		return "Hello";
	}
	
	public static String classString = "testString";

	public static String myString() {
		return "Alright";
	}
	
	public static char myChar() {
		return 4;
	}
	
	public static float myFloat() {
		return 0.5f;
	}

	public static double myDouble() {
		return 0.005d;
	}

	public static boolean myBoolean() {
		int x = 5;
		int y = 7;
		return x>y ;
	}

}

