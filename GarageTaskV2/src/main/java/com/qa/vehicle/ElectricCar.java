package com.qa.vehicle;

import com.qa.vehicle.Vehicle;

public class ElectricCar extends Vehicle {

	private int batteryCapacity;
	private int range;
	
	
	// Custom method
	@Override
	public int fixVehicle() {
		
		if (range >= 200) {
			return getNumberOfSeats() + range*50; 
		}else {
			 return 500 * getNumberOfSeats() + range;
		}
		
	}

	

	//Constructors
	public ElectricCar(String name, int numberOfSeats, String methodOfMotion, String colour, int maxSpeed,
			int batteryCapacity, int range) {
		super(name, numberOfSeats, methodOfMotion, colour, maxSpeed);
		this.batteryCapacity = batteryCapacity;
		this.range = range;
	}
	

	
	// Getters and Setters
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
