package com.qa.human;

public class VenusHuman extends MarsHuman{
	
	//Attributes
	private boolean ultraSuit;
	private int generation;
	private String superPower;
	
	
	
	//Method
	
	public void planetArrivalDate() {
		System.out.println(" I arrived here in 2077");
	}

	public int enterHibernation(int yrs) {
		
		if (yrs > 0) {
			generation+=yrs;
		}
		
		return generation;
	}
	
	
	//Constructors
	public VenusHuman(String name, int age, int height, boolean vegan, boolean bionic, boolean superStrength,
			String planetaryFood, boolean ultraSuit, int generation, String superPower) {
		super(name, age, height, vegan, bionic, superStrength, planetaryFood);
		this.ultraSuit = ultraSuit;
		this.generation = generation;
		this.superPower = superPower;
	}

	// Getters and Setters
	public boolean isUltraSuit() {
		return ultraSuit;
	}



	public void setUltraSuit(boolean ultraSuit) {
		this.ultraSuit = ultraSuit;
	}



	public int getGeneration() {
		return generation;
	}



	public void setGeneration(int generation) {
		this.generation = generation;
	}



	public String getSuperPower() {
		return superPower;
	}



	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	
	// To string
	@Override
	public String toString() {
		return "VenusHuman [ultraSuit=" + ultraSuit + ", generation=" + generation + ", superPower=" + superPower
				+ ", toString()=" + super.toString() + "]";
	}
	

	
	
	
	
	

}
