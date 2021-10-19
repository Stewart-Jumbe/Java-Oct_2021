package com.qa.main;

public class Runner {
	
	// main method is what runs
	// dont write code in main, link to methods
	public static void main(String[] args) {
		
		
		//Code runs FROM main, top to bottom
		

		
		// Tell my main method to run newMethod
		// reference the class first then the method name
		// type in the name of the method to run + () + ;
		Demo.newMethod();
		Demo.helloStewart();
		
		Demo.favWord();
		Demo.favNumber();
		Demo.favPizza();
		
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
	}
	
	
	
	
}
