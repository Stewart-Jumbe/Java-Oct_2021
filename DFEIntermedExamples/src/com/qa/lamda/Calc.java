package com.qa.lamda;

import com.qa.lamda.LambdaTut.FuncInterface;

public class Calc {
	
	
	
	
	//Methods
	public float divMethod(float x, float y) throws ExceptionTypeZero {
		
		if(y==0)
			throw new ExceptionTypeZero("You're trying to divide by zero");
		else {
			float answer = x/y;
			return answer;
		}
		
	}
	
	
	
}
