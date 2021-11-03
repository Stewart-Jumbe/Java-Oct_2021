package com.qa.puppies.domain;


public class Puppy {

	private String name;
	private String breed;
	private int height; // encapsulation i.e making it private means that they need to use getters and setters

	//Constructor- Review constructors
	public Puppy(String name, String breed, int height) {
		super();
		this.name = name;
		this.breed = breed;
		this.setHeight(height);//condition in setters is linked to the constructor 
	}
	//Getters and Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height> 8 && height < 100) {
		this.height = height;
		}else {
			System.out.println("invalid" + height);
		}
	}
	//To String

	@Override
	public String toString() {
		return "Puppy [name=" + name + ", breed=" + breed + ", height=" + height + "]";
	}
	
	
	
	
	
}
