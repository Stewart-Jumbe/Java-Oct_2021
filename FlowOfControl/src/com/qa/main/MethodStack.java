package com.qa.main;

import java.util.Random; //importing  a random

public class MethodStack {
	
	// This method will return to main
	
	public static int firstLayer() {
		System.out.println("First layer called");
		int result = secondLayer();
		
		//run secondLayer again, add the value to it again
		//System.out.println("Second layer called again");
		result = result + secondLayer();
		
		System.out.println("First layer finished");
		return result;
				
		
		
	}

	//This method will provide a random number for firstLater to use
	public static int secondLayer() {
		// new Random().nextInt() will return a random number from 0 to max (-1)
		// import java.util.Random;
		System.out.println("second layer called");
		int result = new Random().nextInt(6);
		System.out.println("second layer finished");
		return result;
	}
}
