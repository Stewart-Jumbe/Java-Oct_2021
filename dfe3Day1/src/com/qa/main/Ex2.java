package com.qa.main;

public class Ex2 {
	
	public static void main(String[] args) {
		
	//System.out.println("H3LL0 W0.000000r1d 5.0 false);
	
	//int five = 5;
	//int seven = 7;
	
	//H3LL0 W0r1d 5.0 false
	
	boolean status = false;
	int zero = 0;
	short three = 3;	
	float fiver = 5.0f;
	String leadZeros = String.format("%06d",0 );//added 6 reading zeros
	//double zeros = 0.001d;
	char W = 'W';
	char L = 'L';
	//System.out.println(leadZeros + zeros);
	System.out.println("H" + three + L+L+ zero + " " + W + leadZeros + "r" + 1 +"d" +" " + fiver +" "+ status);
	
	
}
}