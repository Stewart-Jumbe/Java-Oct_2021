package com.qa.lamda;


//tut from QA
//Lambda with Multi Arguments

public class LambdaTut {
	
	interface FuncInterface {// Creating lamda function
		int operation(int a, int b);// defining inputs to lambda function
	}
	
	private int operate(int a, int b, FuncInterface funcObj) { //creating a private method that returns an int value of the items used in operations
		return funcObj.operation(a,b);
	}
	
	public static void main (String[] args) {
		FuncInterface add = (int x, int y) -> x +y;
		FuncInterface mult = (int x, int y) -> x *y;
		FuncInterface div = (int x, int y) -> x /y;
		FuncInterface sub = (int x, int y) -> x -y;
		
		LambdaTut lambda = new LambdaTut();
		System.out.println(lambda.operate(5,7, add));
		System.out.println(lambda.operate(5,7, sub));
		System.out.println(lambda.operate(10,2, div));
	}
	
	
	
	
	
	
	
	
}


