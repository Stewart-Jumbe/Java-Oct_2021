package com.sjumbe.main;

public class Runner {
	
	public static void main (String[] args) {
		
		Methods accessMeths = new Methods();
		System.out.println(accessMeths.sumMethod(10, 30));
		
		//Trying out the pass method
		//accessMeths.myPass();// it works
		
		//trying to determine size of file method
		accessMeths.determineFileSize();
		
		
		
		
//		int myvalue = 10000;
//		int myValue2 = 10_000;// another way of writing 10000, java 7 and above
//
//		//Int occupies 32 bits, width 32
//		int myMinIntValue =Integer.MIN_VALUE; // shows min value that int can be
//		int myMaxIntValue =Integer.MAX_VALUE; // shows max value that int can be
//		System.out.println("Integer Minimum Value = " + myMinIntValue);
//		System.out.println("Integer Maximum Value = " + myMaxIntValue);
//
		
		//Java uses the concept of a Wrapper class for all eight primitive types - 
		//in the case of an int we can use Integer, doing this give us ways to perform operation on an int.
		// In the case above we are using MIN_VALUE and MAX_VALUE to get Java to tell us the max and min ranges of numbers that can be stored.
		//When a value is larger than the max or smaller than the min value in Java, then you get an OverFlow in the case of the maximum value 
		//or an underflow in the case of the minimum.
		//This means the computer skips back to the min or max value the number is allowed to be...which is not what you want.

//		//Byte occupies 8 bits, width 8
//		byte myMaxByteValue = Byte.MAX_VALUE;
//		byte myMinByteValue = Byte.MIN_VALUE;
//		System.out.println("Maximum value for a byte is :" + myMaxByteValue);
//		System.out.println("Minimum value for a byte is :" + myMinByteValue);
//
//		//Short occupies 16 bits, width 16
//		short myMaxShortValue =Short.MAX_VALUE;
//		short myMinShortValue =Short.MIN_VALUE;
//		System.out.println("Maximum value for a short is: "+ myMaxShortValue);
//		System.out.println("Minimum value for a short is: "+ myMinShortValue);
//
//		//Long occupies 64 bits, width 64
//		long myMaxLongValue = Long.MAX_VALUE;
//		long myMinLongValue = Long.MIN_VALUE;
//		System.out.println("Maximum value for a long is: "+ myMaxLongValue);
//		System.out.println("Minimum value for a long is: "+ myMinLongValue);
//
//		//Double occupies 64 bits, width 64
//		double myMaxDoubleValue = Double.MAX_VALUE;
//		double myMinDoubleValue = Double.MIN_VALUE;
//		System.out.println("Maximum value for a double is: "+ myMaxDoubleValue);
//		System.out.println("Minimum value for a double is: "+ myMinDoubleValue);
//
//
//		/// Casting in JAVA
//
//		//Why we need it:
//		//byte myByte = (myMaxByteValue/2);//get an error saying an int cannot be converted to a byte
//		// this can be overcome by casting, which will convert a number from one type to another:
//		byte myBytev2 = (byte)(myMaxByteValue/2); // Error has disappeared
//		System.out.println(myBytev2);
//
//		short myshort = (short)(myMaxShortValue/2);
//		System.out.println(myshort);
//
//		long mylong = 50000L +10*(myMaxByteValue +myMaxShortValue+myMaxIntValue);
//		System.out.println(mylong);
//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
}
