package com.qa.storage.test;


import com.qa.garage.Garage;

public class GarageTest {

	// Creating garage object that will be tested
	Garage mygarage = new Garage();
	
	
	//Testing whether mygarage is an object  
	@Test
	public void myGarageTypeTest() {
		assertTrue(mygarage instanceof Garage);
		assertFalse( mygarage instanceof Garage);
	}


		
	}
	
	
