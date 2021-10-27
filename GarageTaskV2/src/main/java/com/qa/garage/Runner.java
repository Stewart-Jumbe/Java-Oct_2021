package com.qa.garage;

import com.qa.vehicle.ElectricCar;
import com.qa.vehicle.Helicopter;
import com.qa.vehicle.RocketShip;
import com.qa.vehicle.Vehicle;

public class Runner {
	
public static void main(String[] args) {

// Create a vehicle object
	
	Vehicle myHelicopter = new Helicopter("myHelicopter",6, "flight", "Dark Blue", 200, 4000);
	Vehicle myRocket = new RocketShip("myRocket", 10, "flight", "black", 800,
			"FutureCraft", "human", 10);
	Vehicle myElectricLeaf = new ElectricCar("myElectricLeaf", 5,"Blue", null, 150,
			1000, 500);
	Vehicle zapElectricTesla = new ElectricCar("zapElectricTesla", 5,"red", "120", 150,
			1000, 500);
	
	
	// creating garage object where vehicles will go
	Garage totterdownGarage = new Garage();
	
	//adding objects to garage
	totterdownGarage.addVehicleToGarage(myHelicopter);
	totterdownGarage.addVehicleToGarage(myRocket);
	totterdownGarage.addVehicleToGarage(myElectricLeaf);
	totterdownGarage.addVehicleToGarage(zapElectricTesla);
	
	//Checking number of vehicles created
	System.out.println(Vehicle.getNumberOfVehicles());
	
	//Checking vehicles in garage
	//totterdownGarage.showVehicles();
	
	//Method to remove vehicles from garage
	totterdownGarage.removeVehichleFromGarage(myElectricLeaf);
	totterdownGarage.removeVehichleFromGarage(myRocket);
	
	
	
	//Method for updating garage list by index position and vehicle name
	totterdownGarage.updateGarageList(0, myRocket);
	totterdownGarage.updateGarageList(0, myElectricLeaf);
	
	//Method for fixing a vehicle in the garage
	totterdownGarage.fixVehicle(zapElectricTesla);
	totterdownGarage.fixVehicle(myElectricLeaf);
	
	//Method for removing all vehicles
	totterdownGarage.removeAllVehichleFromGarage();
	System.out.println(totterdownGarage.garageList.toString());
	
}
}