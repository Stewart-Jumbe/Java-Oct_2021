package com.qa.main;

public class Cat {
	
	// First we need its attributes
	
	int age;//will have default value of zero
	boolean isHairShort = true;
	String hairColour = "Ginger";
	String favouriteFood;
	
	//Methods - CAN DOS
	
	//private// method could only be used within the class
	public void scratch() {
		System.out.println("I scwatch");
	}

	
	public int catDoesMath(int a, int b) {
		//return a + b
		int z = a + b;
		System.out.println(z);
		return z;
		
	}
}
