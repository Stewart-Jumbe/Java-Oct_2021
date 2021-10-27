package com.qa.lamda;

public class LambdaEx {

	
	interface Calc {
		int method(int n1, int n2);// this is a default method, which  returns an int object
	}
	
	public static void main (String[] args) {
		
		Calc add = (i,j) -> (i+j);
		Calc multi = (i,j) -> (i*j);
		Calc addReturn = (int x, int y) -> {return (x+y);};
		
		System.out.println(add.method(1, 2));
		System.out.println(multi.method(1, 2));
		System.out.println(addReturn.method(1, 2));
		
		
		
	}
	
}

