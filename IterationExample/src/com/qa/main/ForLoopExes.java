package com.qa.main;

public class ForLoopExes {

	
	public static void flowChart1(int num) {
		
		for (int i= num; i <200; i++) {
			System.out.println(i);
		}
		
	}
	
public static void flowChart2(int num) {
		
		for (int i= num; i <=200; i++) {
			if (i%2 ==0) {
			System.out.println(i);
		}	else {
			System.out.println("*");
		}
		
	}
}

//public static void coins(double payment) {
//	
//	int cost;
//	double change = payment -cost;
//	// 15.42 = 20 - 4.58
//	int tenNote = 10;
//	int fiveNote = 5;
//	float tenPence = 0.10f;
//	float pence= 0.01f;
//	double money = 0;
//	
//	double remains = change % 10; //5.42
//	
//	
//
//	}

public static void changeMethod(float price, float amountPaid) {
	
	float change = amountPaid -price;
	int twenty = 0;
	int tenner = 0;
	int fiver = 0;
	int twoPound= 0;
	int onePound = 0;
	float fiftyPence = 0;
	float twentyPence = 0;
	float tenPence = 0;
	float fivePence= 0;
	float onePence= 0;
	
	
	//While the amount of change is greater than 20 (our first currency value)
	while (change>= 20) {
		change -=20;
			twenty++;
	}
	while (change >= 10) {
		change -= 10;
		tenner++;
		
	}
	
	while (change >= 5) {
		change -= 5;
		fiver++;
	}
	
	while (change >= 2) {
		change -= 2;
		twoPound++;
	}
	while (change >= 1) {
		change -= 1;
		onePound++;
	}
	
	while (change >= 0.50f) {
		change -= 1;
		fiftyPence++;
	}
	
	System.out.println("Number of twenty pound notes is" + twenty);
	System.out.println("Number of ten pound notes is" + tenner);
	System.out.println("Number of ten pound notes is" + fiver);
}

//Create a method to print the numbers 1 to 10 as many times as the value of that number.
//For example; you will print 1 once, and 10 ten times
// need to practise problems that require nested for loops 
public static void flowChartDemo() {
	
	for (int i = 1; i < 10; i++) {
		
		for (int y = 1; y <= i; y++) {
			
		System.out.println("value of i is" + i);
		}
	}
}
}
