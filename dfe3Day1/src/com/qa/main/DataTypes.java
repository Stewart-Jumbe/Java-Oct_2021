package com.qa.main;

public class DataTypes {
	public static void main(String[] args) {
	//Primitives are the most basic for of data types, there are 8 types
	//boolean
	//char
	//byte
	//short
	//int
	//long
	//float
	//double
	
	//BOOLEAN- a switch (true or false only 0 and 1 are not considered bools)
	
	boolean isItMonday = true;
	
	//CHAR
	
	char letterA ='A';//uses single quotation marks, chars follows unicode so entering a NUMBEr e.g will produce a character
	System.out.println(letterA);// prints out letter A		

	
	//BYTE- 8 bit, 00000000
	
	byte aLittleBite = 30;
	System.out.println(aLittleBite);
	
	//short 00000000 00000000 16bit
	
	short shorty = 500;
	
	//int 00000000 00000000 00000000 00000000 32bit 
	
	int integerFunTime = 500000;
	
	
	//Long 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 64bit
	long aNumber = 400000000000945L; // need to add L so that compiler knows is a long number
			
			
	//FLOAT , 32 bit
	
	float pi = 3.14519f;// needs to add an f so that the compiler knows its a float
	
	//Double - 64 bit float
	
	double doubley = 2.1155252D;// need to add a D so that the compiler knows its a double
	
	int z = shorty + integerFunTime; //this should work
	//int z = shorty + aNumber:// this would not work as int is limited to 32 bit and cant store a 64bit number
	//Hierachy byte,short, int, long
	
	
	//Reference, classes that you create and initialise to store values
	
	String stringy = "I'm a String";
	
	
	
	
}
}
