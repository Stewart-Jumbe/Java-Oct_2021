package com.qa.penguin;

public class Penguin {
	
	// Encapsulation - Limiting and controlling who/what has access to our data
	// Limiting the type of data that can be used to replace existing data
	
	//Public - accessible by everything within this package
	// Private - Data is only accessible by this Class
	public void printOut() {
		System.out.println(SecretData.bankNumber);
	}
	
	private String name;
	private boolean eatenFish;
	private String noise;
	private boolean happyFeet;
	
	
	public Penguin(String name, boolean eatenFish, String noise, boolean happyFeet) {
		super();
		this.name = name;
		this.eatenFish = eatenFish;
		this.noise = noise;
		this.happyFeet = happyFeet;
	}


	//Getters and Setters 
	//Gettes - return the data
	// Setters - Allow you to update the data
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
		
		if (name == "Dragon Eater") {
			System.out.println("I dont like that name");
			return; // return is used to end a method 
		}
		
	}


	public boolean isEatenFish() {
		return eatenFish;
	}


	public void setEatenFish(boolean eatenFish) {
		this.eatenFish = eatenFish;
	}


	public String getNoise() {
		return noise;
	}


	public void setNoise(String noise) {
		this.noise = noise;
	}


	public boolean isHappyFeet() {
		return happyFeet;
	}


	public void setHappyFeet(boolean happyFeet) {
		this.happyFeet = happyFeet;
	}
	

	
	
	
	
}
