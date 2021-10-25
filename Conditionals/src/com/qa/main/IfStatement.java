package com.qa.main;

public class IfStatement {
	
	// Conditionals are used when developers want code to have multiple outcomes
	
	//If a variable is certain value
	// do a think
	// else do other thing

	
	public static void conditionalDemo() {
		
		// Java uses if else statements (like basically every programming / scripting language)
		// computing / programming is binary true/false
	
	
		boolean isKettleOn = true;
		//isKettleOn = false;
		//if is the command word
		// next to if within () is the statement
		// = - assignment
		// == comparison (checking the value)
		
		if (isKettleOn==true) {
			// is the body
			//what code does if the if statement is true
			System.out.println("I'll take milk no sugar:) ");
		} else 
		{
			System.out.println("Pop the kettle on!");
		}
	
		
		boolean binsOut = true;
		
		if(binsOut) {
			System.out.println("Bins are out!");
		} else {
			System.out.println("Bins were forgotten :(");
		}
				
	// Conditional Operators
	// == : equals
	// > : greater than
	// < : less than
	// <= : less than Or equals
	// >= : greater than or equals
	//	|| : OR
	// && : AND
	// != : not equals
		
	
		
		
	
	
	}
	// Task - Using Java If else create an If else stack that does the following:
		// -prints out "Greater
	
	public static String ifComparison(int num){
		
		String status = "None";
		
		if (num> 10) {
			status = "Greater than";
		} else if (num == 10) {
			status = "Equals";
		}else {
			status = "Less than";
		}
		
		return status;
	}
		
	
	public static int exeOne( int num1,int num2, boolean torf) {
		
		int result = 0;
		if (num1 < num2 && torf == true) {
			result = num1 + num2;
		} else if (num1 == num2 && torf == false) {
			result = num1 * num2 ;
		} else if (num1 == num2 && torf== true) {
			result = num1 + num2;
		}
		
		return result; 
	}
	
//	public static String exeTwo (int num) {
//		String result = "0";
//		if ( num > 2000) {
//			return "A";
//		} else if (num < 2000) {
//			return "2";
//		} else if (num > 100) {
//			return "3";
//		}
//		return result;
//	
	public static String numberStatment() {
		
		int x = 12;
		if (x > 10) {
			return "greater than 10";
		} else if (x ==10) {
			return "equals to 10";
		} else {
			return "less than 10";
		}
		
		// Always end an if block either with 
		// else
		// return (outside of the block
	}
	
	
//	public static void complexStatment() {
//		
//		boolean bool= true;
//		String colour = "Red";
//		
//		if (bool == true || colour == "Red") {
//			System.out.println("bool is true Or colour is red");
//			//How can i tell whether its bool being true or colour being red that triggered this?
//			
//			//single if else block (which only print out 1 thing)
//			if (bool== true && colour =="Red") {
//				System.out.println("bool is true AND colour is red");
//			} else if( bool== true) {
//			  System.out.println("bool is true");
//			} else if (colour== "Red") {
//			  System.out.println("colour is red and bool is not true");
//			}
//		
//		}
//	}
	
	
	

	
}

