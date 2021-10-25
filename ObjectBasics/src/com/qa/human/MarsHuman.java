package com.qa.human;

public class MarsHuman extends Human {
	
//	Task - Create a Parent class of any type (animal, car whatever) with atleast 3 fields and 1 simple method
//	- Create 2 child classes of that parent class with 2 specific fields and 1 extra method
//	- Create objects of the child classes and run the methods from your main method

	//Attributes:
	
	private boolean bionic;
	private boolean superStrength;
	private String planetaryFood;
	
	
	// Methods
	
	public void marsSpeak() {
		System.out.println("Cloudo frayuki nito");
		System.out.println("Translation: you look like you've just come from Earth");
	}

//Getters and Setters
	public boolean isBionic() {
		return bionic;
	}

	public void setBionic(boolean bionic) {
		if(bionic == false) {
			System.out.println("You should consider a bionic implant it will make your life\nhere easier");
		}
		this.bionic = bionic;
	}

	
	public String getPlanetaryFood() {
		return planetaryFood;
	}

	public void setPlanetaryFood(String planetaryFood) {
		this.planetaryFood = planetaryFood;
	}

	public boolean isSuperStrength() {
		return superStrength;
	}

	public void setSuperStrength(boolean superStrength) {
		this.superStrength = superStrength;
	}

	
	// Constructor
	
	public MarsHuman(String name, int age, int height, boolean vegan, boolean bionic, boolean superStrength,
			String planetaryFood) {
		super(name, age, height, vegan);
		this.bionic = bionic;
		this.superStrength = superStrength;
		this.planetaryFood = planetaryFood;
	}

	
	

}
