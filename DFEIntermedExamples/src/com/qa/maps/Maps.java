package com.qa.maps;

import java.util.ArrayList;
import java.util.HashMap;
// HashMaps are the Java equivalent of Dictionaries
public class Maps {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> animals = new HashMap<Integer, String>();
		HashMap<String, HashMap<Integer,String>>cities = new HashMap<>();//string would be the key, so would have to be unique
		
		animals.put(1, "Tiger");
		animals.put(2, "Panda");
		animals.put(3, "Koala");
		animals.put(4, "Rabbit");
		
		animals.forEach((x,i)-> System.out.println(x + " " + i));
		
		//animals.remove(1); // removed item in key 1
		//Advanced for loop
		for (String e : animals.values()) {
			System.out.println("Value: " + e);
		}
		
		for(Integer i: animals.keySet()) {
			System.out.println("Key: "+ i);
		}
		
		System.out.println("==========");
		
		for( Integer i : animals.keySet()) {
			System.out.println(String.format("Key: %d, Value: %s", i, animals.get(i))); // String Format takes in 2 values, 
			//the String you want to create and the variables you want inserted
			
		}
		
		
	}
		
	}


