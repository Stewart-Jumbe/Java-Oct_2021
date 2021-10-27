package com.qa.sets;

import java.util.ArrayList;
import java.util.HashSet;

public class Sets {
	//By default our sets and lists are unordered
	public  static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<>(); // ArrayLists and lists can use the same methods because they inherit them from the collections
		arrlist.add("Hello");
		arrlist.add("car");
		arrlist.get(1);


	
		HashSet<String> animals = new HashSet<String>();
		animals.add("Panda");
		animals.add("Lion");
		animals.add("Lion");
		animals.add("Tiger");
		System.out.println(animals.size());
		animals.remove("Panda");
		animals.forEach(System.out::println);//this is an example of a lambda expression with a single argument
		animals.contains("Lion");
		
		
	// Lambda syntax : (arg1, arg2) -> {System.out.println("Two arguments " + arg1 + " and " + arg2);}
	
	}	
	
}
