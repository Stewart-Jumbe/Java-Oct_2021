package com.qa.garage.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.qa.garage.Garage;
import com.qa.vehicle.Vehicle;

public class RunnerTest {

	
	Garage mygarage = new Garage();// to use with test 
	ArrayList<Vehicle> mygarageList = new ArrayList<>(); // to use with test 
	ArrayList<Vehicle> myVehicleList = new ArrayList<>(); 
	Vehicle myVehicle = new Vehicle("myVehicle", 5, "driven", "black", 200);
	Vehicle mySecondVehicle = new Vehicle("mySecondVehicle",5,"driven","red",100);
	
	//Testing whether mygarage object has been
	
		@Test //needed to let Junit know that its a test 
		public void testingGarageObject() {
			
			assertTrue(myVehicle instanceof Vehicle, "True");
		}
}
