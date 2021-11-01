package com.qa.enums;

public class Enums {

	private String fuel;
	
	enum Vehicles{
		CAR,BIKE,TRAIN,PLANE,BOAT;
	}
	
	//constructor
	public Enums(String fuel) {
		super();
		this.fuel = fuel;
	}
	
	
	public static void main(String[] args) {
		Vehicles v = Vehicles.BOAT;
		Vehicles ve = Vehicles.CAR;
		Vehicles veh[] = Vehicles.values();
		for(Vehicles x: veh) {
			System.out.println(x.toString());
		}
		
		System.out.println(v.toString().toLowerCase());
		System.out.println(v.ordinal());
		
	}

	
}
