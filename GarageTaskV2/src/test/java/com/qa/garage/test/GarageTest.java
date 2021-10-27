package com.qa.garage.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import com.qa.garage.Garage;
import com.qa.vehicle.Vehicle;

public class GarageTest 
{
	
	// Junit 5		-	Junit 4
	//@BeforeAll	-	@BeforeClass : Needs to be a static method, this will run before everything else; here 
	//@BeforeEach	-	@Before : Method to run before every test, this is best to set up our prereqs before testing ,e.g create an object
	//@AfterAll		-	@AfterClass: A static method rat at the end of everything; used to disconnect or close down our components e.g DB.close()
	//@AfterEach	-	@AfterClass: Method to run after every test, best used to teardown any allocated resource post test e.g. clearling a list, 
	//@Test			-   @Test:Specifies a Method that Junit will run , typically containing an assertion
	//@Disable		-	@Ignore:Prevents a test by running 
	
//	Garage mygarage;
//	ArrayList<Vehicle> mygarageList;
//	ArrayList<Vehicle> myVehicleList;
//	Vehicle myVehicle;
//	Vehicle mySecondVehicle;
//	
//	@BeforeAll
//	public static void init() {
	Garage mygarage = new Garage();// to use with test 1
	ArrayList<Vehicle> mygarageList = new ArrayList<>(); // to use with test 2
	ArrayList<Vehicle> myVehicleList = new ArrayList<>(); 
	Vehicle myVehicle = new Vehicle("myVehicle", 5, "driven", "black", 200);
	Vehicle mySecondVehicle = new Vehicle("mySecondVehicle",5,"driven","red",100);
//	}
	
	
	@Test //needed to let Junit know that its a test 
	public void testingGarageObject() {
		
		assertTrue(mygarage instanceof Garage, "True");
	}
	
	
	@Test // test 2
	public void myArrayListTest() {
		assertTrue(mygarageList instanceof ArrayList, "True");
		
	}
	
	
	@Test // test 3 - checking whether the method that adds a vehicle to the garagelist works
	public void testAddVehiclemeth() {
		mygarage.addVehicleToGarage(myVehicle);
		assertTrue(mygarage.garageList.contains(myVehicle));//uses contain to return a boolean value concerning whether myvehicle is in garage
		//assertEquals(myVehicle,mygarage.garageList.get(0)); // alternative method
		
	}
	
	
	@Test // test 4 - checking whether the method that remove a vehicle to the garagelist works
	public void testremoveVehiclemeth() {
		mygarage.addVehicleToGarage(myVehicle);// adding myvehicle to the garage
		mygarage.addVehicleToGarage(mySecondVehicle);// adding second vehicle which will be removed
		mygarage.removeVehichleFromGarage(mySecondVehicle); // removing second vehicle from garage
		assertTrue(mygarage.garageList.contains(myVehicle)); // confirming that myvehicle is in garagList
		assertFalse(mygarage.garageList.contains(mySecondVehicle)); // boolean contains confirms that mySecondVehicle isn't in the garage 
	}
		
	@Test // test 5 - checking the method that shows the garagelist as a string
	public void testShowVehicles() {
		mygarage.addVehicleToGarage(myVehicle);// adding myvehicle to the garage
		//ArrayList myarray = new ArrayList();
		//myVehicleList.add(0, myVehicle);// added my vehicle as the only item in myarray
		//assertEquals(myarray.toString(),"[myVehicle]");
		assertEquals(mygarage.showVehicles() ,"[myVehicle]");
	}
	
	
	@Test // test 6 - checking whether the method that remove a vehicle to the garagelist works
	public void testUpdateGarageList() {
		mygarage.addVehicleToGarage(myVehicle);// adding myvehicle to the garage
		//checking that garageList has myVehicle
		assertEquals(mygarage.showVehicles() ,"[myVehicle]");
		
		//adding a vehicle at an index position in the garageList
		mygarage.updateGarageList(0, mySecondVehicle);
		
		
		
	}
	
	
	
	

}
