package com.qa.main;

import java.util.Arrays;

public class Demo {
	
	//Arrays within Java are collections of data
	// Arrays can only contain one data type Strings, ints, booleans, objects
	// Arrays are immutable -can't be changed once they're created
	// You can change the Values but can't change the data type OR the length
	
	//Arrays in Java = Train, you can change the customers getting on and off
	//but you can't change the length of the train or type of cargo mid journey
	
	
	//making new method
	public static void arrayDemo() {
		
		// When creating arrays you need to use [] to denote its an array
	
		String colour="Red";
		String[] colourList = {"Blue","Purple","Teal","Yellow"};
//		public static String[] colourList = {"Blue","Purple","Teal","Yellow"}; // making this a class layer variable (everything in this class can access it)
		
		System.out.println(colour);
		System.out.println("===============");
		System.out.println(colourList);
		System.out.println(colourList[1]);
		
		// For loop to access our colours
		// Accessing the length of our array with
		for (int i =0; i <colourList.length;i++ ) {
			System.out.println(colourList[i]);// will print each element of the list
			System.out.print(colourList[i] + " ");// this will print out the whole list on one line
		}
	
		// How to manipulate our values
		// colourList[1] = "purple"
		
		colourList[1] = "Moave";
		System.out.println();
		System.out.println(colourList[1]);
		
		/// Printing out an array without a for loop (not a common method)
		// Get the array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // Get the String representation of array
        String stringArr = Arrays.toString(arr);
        // print the String representation
        System.out.println("Array: " + stringArr);

	}
//	
//	public static void forEachLoop() {
//		// For each string in the array colourList
//		for(String Newcolour:colourList);{
//			System.out.println(Newcolour);
//		}
//	}
	
}
