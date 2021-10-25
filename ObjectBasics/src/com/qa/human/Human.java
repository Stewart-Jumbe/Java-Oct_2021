package com.qa.human;

public class Human {
	
	// Fields - Attributes to describe the object
	
//	public String name;
//	public int age;
//	public int height;
//	public String ethnicity;
//	public boolean vegan;
//	
	private String name;
	private int age;
	private int height;
	private String ethnicity;
	private boolean vegan;
	
	// Method - functions that human objects can do
	
	public void humanTalk() {
		System.out.println("Hello I am the first human you've created");
	}
	
	// Constructor
	
//	public Human() {
//		name = "Adam";
//		age = 29;
//		height = 175;
//		ethnicity = "Black";
//		vegan = false;
//				
//	}
	
	//Creating constructor that allows object attributes to be changed at initialisation
	public Human(String name, int age , int height, boolean vegan) { 
		this.name = name;
		this.age = age;
		this.height = height;
		this.vegan =vegan;
	}
	
	// To String
	@Override // helpful for pritting out all attributes of object
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", height=" + height + ", ethnicity=" + ethnicity + ", vegan="
				+ vegan + "]";
	}

	
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if( name.contains(";")) {
			System.out.println("Entry not permissible");
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public boolean isVegan() {
		return vegan;
	}

	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}
	

	
	//Task - Add Getters and Setters to your constructor class and make your fields private
	//Then from your main method print out some of the getters and setters
	
	
	
	
	
	
	
	

}
