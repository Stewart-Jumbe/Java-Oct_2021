package com.qa.vehicle;

import com.qa.vehicle.Vehicle;

public class RocketShip extends Vehicle {
	
	
	//Fields
	
	private String companyName;
	private String	payloadType;
	private int 	payloadQuantity;
	
	
	//Constructors

	public RocketShip(String name, int numberOfSeats, String methodOfMotion, String colour, int maxSpeed,
			String companyName, String payloadType, int payloadQuantity) {
		super(name, numberOfSeats, methodOfMotion, colour, maxSpeed);
		this.companyName = companyName;
		this.payloadType = payloadType;
		this.payloadQuantity = payloadQuantity;
	}


	// Custom Method
	@Override
	public int fixVehicle() {
		if(payloadType =="human" || payloadType =="Human") {
				return 500 * getNumberOfSeats() + payloadQuantity*2;
				
		}else {return 500 * getNumberOfSeats() + payloadQuantity;
		}
	}

	//Getters and Setters
	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getPayloadType() {
		return payloadType;
	}


	public void setPayloadType(String payloadType) {
		this.payloadType = payloadType;
	}


	public int getPayloadQuantity() {
		return payloadQuantity;
	}


	public void setPayloadQuantity(int payloadQuantity) {
		this.payloadQuantity = payloadQuantity;
	}
	
	



}
