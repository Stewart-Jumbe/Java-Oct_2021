package com.qa.bird;

// When making a child class we need to specify what
// is the parent class, with the word extends

public class FlightLessBirds extends Bird {
	
	// Fields
	
	private String habitat;
	private int landSpeed;
	
	
	//Methods
	public void attemptToFly() {
		System.out.println("*Smack face on ground*");
	}
	
	@Override // Good practice to let develops know you are
	// overring a method
	public void makeNoise() {
		System.out.println("Shabang");
	}
	
//Getters and Setters


	public String getHabitat() {
		return habitat;
	}


	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public int getLandSpeed() {
		return landSpeed;
	}


	public void setLandSpeed(int landSpeed) {
		this.landSpeed = landSpeed;
	}
//Constructors


	public FlightLessBirds(String featherColour, int wingSpan, boolean migratory, String habitat, int landSpeed) {
		super(featherColour, wingSpan, migratory);
		this.habitat = habitat;
		this.landSpeed = landSpeed;
	}
	
	
	
	
}
