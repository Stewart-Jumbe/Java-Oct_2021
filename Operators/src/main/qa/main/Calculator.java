package main.qa.main;
import java.lang.Math;

public class Calculator {

	
	
	//addition
	
	public static double addMethod (double num1, double num2) {
		return num1 + num2;
	}
	
	//subtraction
	public static double subMethod (double num1, double num2) {
		return num1 - num2;
	}
	//multiplication
	
	public static double multiMethod (double num1, double num2) {
		return num1 * num2;
	}
	//division
	
	public static double divMethod (double num1, double num2) {
		return num1 / num2;
	}
	
	// exponent
	
	public static int expoMethod(int num1, int num2) {
		int result = (int) Math.pow(num1,num2);// (int) is used to cast the output of the math as an int since its a double
		return result;
	}
}
