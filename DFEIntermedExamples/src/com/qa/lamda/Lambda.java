package com.qa.lamda;

import java.util.ArrayList;

public class Lambda {

	
	interface StrFunc{
		String create(String str); // this can be placed anywhere, outside by cibventuib
		
	}
	
	interface StrFunc2{
		String create(String str, String str1); // created lamda with 2 inputs
	}
	
	
	
	
	
	
	public  static void main(String[] args) {
		
	StrFunc s = new StrFunc() {
	public String create(String str) {
		String msg = "People";
		return str + " " +msg;
		}	
	};
	
	System.out.println(s.create("Hello"));
	
	StrFunc betterWayToDoIt = (n) -> n + "everyone";
		System.out.println(betterWayToDoIt.create("Hello "));
		
		StrFunc2 betterWayToDoIt2 = (n,x) -> n + x + "everyone";
		System.out.println(betterWayToDoIt2.create("Hello","again"));
		
		
		ArrayList<String> arrlist1 = new ArrayList<>(); // ArrayLists and lists can use the same methods because they inherit them from the collections
		arrlist1.add("Hello");
		arrlist1.add("car");
		arrlist1.get(1);
		
		
		ArrayList<Integer> arrlist2 = new ArrayList<>(); // ArrayLists and lists can use the same methods because they inherit them from the collections
		arrlist2.add(1);
		arrlist2.add(2);
		arrlist2.get(1);

		
		// Lambda syntax : (arg1, arg2) -> {System.out.println("Two arguments " + arg1 + " and " + arg2);}

		
		
		
}

	
	
	
}