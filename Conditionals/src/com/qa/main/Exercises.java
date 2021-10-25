package com.qa.main;

public class Exercises {

	
public static int blackJack( int num1,int num2) {
		
		// comparison when num1 and num2 are <= 21
			if (num1 <=21 && num2 < num1) {
				return num1; // returning the one closest in value to 21
			} else if (num2 <= 21 && num1 < num2) {
				return num2;
		
			} if(num1>=21 && num2>=21) { // checking if num1 or num2 are >= than 21
				return 0;
			} else if (num1>= 21 && num2 <=21) {
				return num2;
			} else {
				return num1;
			} 
}
	
	public static int uniqueSum(int num1, int num2, int num3) {
		
		//if they all equal each other return 0
		if (num1 ==num2 && num2 ==num3) {
			return 0;
			//checking for (1,1,3)
		}if (num1 ==num2 && num3 != num1) {
				return num3;
				// checking for (1,2,1)
			}else if (num2 != num1 && num3== num1) {
				return num2; 
			}else { return num1 + num2 + num3;
		}
	}
	
	public static String fizzBuzz(int num) {
		
		if (num!=0 && num % 3 == 0 && num % 5 == 0) {
			return "FizzBuzz";
		}if(num!=0 && num % 3 == 0) {
			return "Fizz";
		}else if (num!=0 && num % 5 == 0) {
			return "Buzz";
		}else {
		return "not a factor of 3 or 5";
		
	}
	}
	
	
}
