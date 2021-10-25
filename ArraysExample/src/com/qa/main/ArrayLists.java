package com.qa.main;

import java.util.ArrayList;

public class ArrayLists {
	// Ctrl Shift 0 - - fixes all import errors (by importing or removing things)
	
	//Array Lists are an implementation of the collections class with Java
	// They have inbuild functionality to add, read, update and delete
	// And they are mutable meaning we can change the length of our array at will
	
	//creating public array list
	
	// to create an array list use: ArrayList<Data type> nameOfList
	// =new ArrayList<>()
	public static ArrayList<String> pizzaList = new ArrayList<>();
	
	// Array lists have inbuilt methods to manipulate
	
	public static void addPizza() {
		
		System.out.println(pizzaList);
		
		//arrayList name.add
		pizzaList.add("Pepporoni"); // Taking the arraylist and adding the string "Pepperoni"
		
		System.out.println(pizzaList);
	}
	
	public static void setupArray() {
		pizzaList.add("Default");
		pizzaList.add("Mushroom");
		pizzaList.add("Chicken");
		System.out.println(pizzaList);
	}
	
	//Using index values we can manipulate specific items
	public static String getPizza(int index) {
		return pizzaList.get(index);//Return the pizza of index index
	}
	
	public static void removePizza(int index) {
		pizzaList.remove(index);// will remove the pizza at index index
	}
	public static void updatePizza(int index) {
		pizzaList.set(index,"new pizza");
		
	}
	public static void clearAllPizza() {
		
	}
	public static void getAllPizza() {
		
	}
	
	//Loops with array lists
	
	public static void forLoopArrayList() {
		// print out all the pizzas line byb line with a loop
		//System.out.println("Method run");
		
		for(String pizza : pizzaList) {
			System.out.println(pizza);
		}
	}

}
