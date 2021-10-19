package main.qa.main;

public class Operators {
	
	// Operatots are functions you can use to change numerical values
	// Add      +
	// Sub      -
	// Multiply *
	// Divide
	// Modulus %
	
	
	
	//What is Modulus
	
// 15 / 4 = 3.75
// in integers its 15 / 4 = 3 remainder 3
	// when using the modulus, you're just asking for what the remainder when two numbers are divided
	
	// Modulus can be used to see if a number is odd or even
	// any Number % 2 =0 (even)
	
	public static int addMethod() {
		
		int result = 5 + 5;
		return result;
	}

	public static float divideMethod() {
		float result = 10.0f / 3.0f;//make numbers float if you want more figures after the decimal
		return result;
	}
	
	// This method will take in two numbers, add them and return the result
	public static int addNums(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
