package com.qa.vehicle;

public class Helicopter extends Vehicle{
	
	//Fields / Attributes
	
	private int propellerSpeed;
	
	//custom method
	
	@Override
	public int fixVehicle() {
			return 500 * getNumberOfSeats() + propellerSpeed;
	}
	

	

	// Constructor
	public Helicopter(String name, int numberOfSeats, String methodOfMotion, String colour, int maxSpeed,
			int propellerSpeed) {
		super(name, numberOfSeats, methodOfMotion, colour, maxSpeed);
		this.propellerSpeed = propellerSpeed;
	}

	//Getters and Setters
	public int getPropellerSpeed() {
		return propellerSpeed;
	}


	public void setPropellerSpeed(int propellerSpeed) {
		this.propellerSpeed = propellerSpeed;
	}
	
	
	
	
	

	
	
	
	
	
	
	


	
	
	
	
	

		
	}
	


