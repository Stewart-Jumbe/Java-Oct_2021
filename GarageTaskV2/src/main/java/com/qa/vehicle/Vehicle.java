package com.qa.vehicle;

import com.qa.vehicle.Vehicle;

public class Vehicle {
	
	//Fields or Attributes
	
	private String name;
	private int numberOfSeats;
	private String methodOfMotion;
	private String colour;
	private int maxSpeed;
	static int numberOfVehicles;
	


	//Method
	public int fixVehicle() {
		return 500 * numberOfSeats;
	}


	// Constructor
	public Vehicle(String name, int numberOfSeats, String methodOfMotion, String colour, int maxSpeed) {
		super();
		this.name = name;
		this.numberOfSeats = numberOfSeats;
		this.methodOfMotion = methodOfMotion;
		this.colour = colour;
		this.maxSpeed = maxSpeed;
		numberOfVehicles ++;
	}


	
	// To String
	
	@Override
	public String toString() {
		return  name;
	}




	// Getters and Setters
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}


	public String getMethodOfMotion() {
		return methodOfMotion;
	}


	public void setMethodOfMotion(String methodOfMotion) {
		this.methodOfMotion = methodOfMotion;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}




	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	public static String getNumberOfVehicles() {
		return "\nYou have created "+ numberOfVehicles + " vehicles\n";
	}


	public static void setNumberOfVehicles(int numberOfVehicles) {
		Vehicle.numberOfVehicles = numberOfVehicles;
	}
	
	
	
	

}
