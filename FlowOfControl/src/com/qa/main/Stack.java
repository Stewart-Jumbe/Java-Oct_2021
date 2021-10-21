package com.qa.main;

public class Stack {
	
	public static void firstMethod() {
		System.out.println("First in the stack");
		secondLayer();
		System.out.println("called second");
	}
	
	public static void secondMethod() {
		System.out.println("Second method");
	}

	public static void secondLayer() {
		System.out.println("I'm being called by first Method");
	}
}
