package com.qa.main;

public class Runner {
	
	// main method is what runs
	// dont write code in main, link to methods
	public static void main(String[] args) {
		
		
		//Code runs FROM main, top to bottom
		

		
		// Tell my main method to run newMethod
		// reference the class first then the method name
		// type in the name of the method to run + () + ;
		//Demo.newMethod();
		//Demo.helloStewart();
		
		//Demo.favWord();
		//Demo.favNumber();
		//Demo.favPizza();
		
		
		//System.out.println("1");
		//System.out.println("2");
		//System.out.println("3");
		
		
//		Stack.firstMethod();
//		Stack.secondMethod();
		
//		Returns.printHello();
//		Returns.returnHello();
//		Returns.myChar();
	
		
//		System.out.println(Returns.myChar());
//		System.out.println(Returns.myBoolean());
//		System.out.println(Returns.myString());
//		System.out.println(Returns.myDouble());
//		System.out.println(Returns.myFloat());
	
		
		
		//Creating a Dragon object
//		Dragon jack = new Dragon(4,"black");
//		System.out.println(jack.dragonAge());
//		
	
	//System.out.println(MethodStack.firstLayer());
	//System.out.println(DiceStack.threeSidedDice());
	System.out.println("Sum of 4 sided dice is " + DiceStack.sum4SidedDice());
	System.out.println("Sum of 10 sided dice is " + DiceStack.sum10SidedDice());
	System.out.println("Sum of All sided dice is "+ DiceStack.sumAllSidedDice());
	System.out.println(DiceStack.sum4SixSidedDice());
	
	
	}
	
	
	
	
}
