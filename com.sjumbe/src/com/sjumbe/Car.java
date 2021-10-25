package com.sjumbe;

public class Car {
	//Public keyword is a type of access modifier
	//Public means others classes have access to the class being created without
	//restrictions
	//Private access modifier limits the variables that exist in a class to only be seen by
	//- the class they are created in
	//Declaring variables as private allows for encapsulation which is a method of wrapping the data (variables)
	//- and code acting on the data (methods) together as a single unit, this can help prevent the creation of invalid
	//- objects e.g incorrect card number of vehicle model
	
	//Attributes - fields
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
	//Method
	
	// Setter method
	public void setModel(String model) { //model in this situation is passed as a parameter
		//To associate the parameter model to the field model (attributes) we use the this keyword
		//once "link" is made, updating the parameter model will update the attribute model
		
		String validModel = model.toLowerCase(); // converts model to lowercase
		if (validModel.equals("carrera") || validModel.equals("yeti")) {
			this.model = model;
		} else {
			this.model = "Unknown";
		}
		
		
	}
	
	
	// Getter method
	public String getModel() {//this get method will gives as an output for the model
		return this.model;
	}
	
	

}
