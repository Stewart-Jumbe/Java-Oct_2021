package com.qa.domian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component// tells spring to create instances of car, so that we dont have to create instances of the car manually
public class Car {
	
	private String model;
	private String colour;
	private int miles;

	
	public Car() {
		System.out.println("Car Created");
	}


	public Car(String model, String colour, int miles) {
		super();
		this.model = model;
		this.colour = colour;
		this.miles = miles;
	}
	
	@Autowired // used to inject class into a method so that the object in the method can use the methods from the injected class
	private Driver dean;
	
	
}
