package com.qa.optionals;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating people for person class
		//public Person(Long id, String firstName, String lastName, String email, int phoneNumber) {
		Person eddy = new Person(1L, "Eddy", "Johnson", null, null);
		Person hip = new Person(1L, "Hip", "Lee", null, 752123188L);
		
		System.out.println(hip.getEmail());
		System.out.println(hip.getLastNameBol());
		System.out.println(hip.getLastName());
		System.out.println(eddy.getPhoneNumber());
		
		
		//eddy.getPhoneNumber();
		
		

	}

}
