package com.qa.garage;

import java.util.ArrayList;
import java.util.Scanner;

import com.qa.vehicle.Vehicle;


//The task is to create a garage class with methods for the following:
//- Adding Vehicles to garage
//- Removing vehicles
//- Updating vehicles
//- Reading vehicle
//- Removing all vehicles
//- Running vehicle.fixVehicle() custom method
//Vehicles
//Vehicle should be a base class (parent) with atleast 3 fields
//and a fixVehicle() method
//
//You should create atleast 3 child classes extending off of Vehicle
//(car, bike, helicopter)
//Each child class should inherit the fields AND have 2 specific fields


public class Garage {

	
	

	
	public static ArrayList<Vehicle> garageList = new ArrayList<>();
	
	
	//####Methods to Add vehicle to garage
	// vehicleName should be the name of the object
	public void addVehicleToGarage(Vehicle vehicleName) {
		garageList.add(vehicleName);
		System.out.println("A vehicle named " +vehicleName + " has been added to the Garage List");
	}
	
	
	//##### Method to show vehicles currently in garagelist
	public String showVehicles() {
		String result = garageList.toString();
		System.out.println(result);
		return result;
	}
	
	
	//#### Method to remove vehicles from garage
	// vehicleName should be the name of the object
	
	public void removeVehichleFromGarage (Vehicle vehicleName) {
		int num; //need a variable to be used to remove items by vehicle name from list
		
		// need to find vehicleName in garagelist and get index position
		num = garageList.indexOf(vehicleName);
		
		//If condition that checks if num >= 0, which means its in the garageList, else
		// it informs the customer that we dont have the vehicle.
		if(num>=0) {
		garageList.remove(num);
		System.out.println("A vehicle named " +vehicleName + " has been removed from the Garage List");
		
		}else {
			System.out.println(" Sorry but the vehicle is not in our Garage, try next door");
		}
	
	}
	
	//#### Method for updating garage list by index position and vehicle name
	// vehicleName should be the name of the object
	
	public void updateGarageList (int index, Vehicle vehicleName) {
		garageList.set(index, vehicleName);
		System.out.println("A vehicle named " + vehicleName + " has been added to the list");
	}
		
	
	//#### Method for removing all vehicles
	public String removeAllVehichleFromGarage () {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Are you sure you'd like to remove all vehicles from the garage ?\nPlease type Yes or No");
		String response = input.nextLine();
		System.out.println(response);
		
		if (response.toLowerCase()=="y" || response.toLowerCase()=="yes") {
			 garageList.clear();
			 return "All vehicles have been removed from the garage";
		}else { return Garage.garageList.toString();
		}
	}
	
	//#### Method for fixing a vehicle in the garage
	public void fixVehicle (Vehicle vehicleName) {
		System.out.println("\nA vehicle named " + vehicleName + " has been repaired\n");
	}
	

}
