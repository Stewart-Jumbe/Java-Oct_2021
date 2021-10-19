package com.qa.main;

public class Turtle {
	
	//Attributes - Haves
	int age= 77;
	int speed;
	int polygons;//number of polygons on its back
	
	boolean doIhaveFlippers = true;
	float length = 15.7f;
	String name = "Jack";
	String food = "Green Leaf";
	
	
	
	//Methods - Does
	public String hungry() {// [accessibility][datatype][variable name]
		return "I'm very hungry...food...please?";
	}
	
	public void speeding() {
		if (speed > 5) { // && = AND , || = OR
			System.out.println("Come on son");
		}
		else {System.out.println("Bit slow init");
	}}
	
	
	public Turtle() {//empty constructor
		
	}
	
	public Turtle(int age,int speed, boolean doIhaveFlippers,String food) {
		this.age = age;
		this.speed = speed;
		this.doIhaveFlippers = doIhaveFlippers;
		this.food = food; }
	
	public Turtle(int age,int speed,String food) {//a constructor with the variables users can enter when object is instantiated
		this.age = age;
		this.speed = speed;
		this.food = food; }
	

	@Override
	public String toString() {
		return "Turtle [age=" + age + ", speed=" + speed + ", polygons=" + polygons + ", doIhaveFlippers="
				+ doIhaveFlippers + ", length=" + length + ", name=" + name + ", food=" + food + "]";
	}
	
	
	
}
