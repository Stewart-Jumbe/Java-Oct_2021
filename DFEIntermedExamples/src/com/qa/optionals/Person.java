package com.qa.optionals;

import java.util.Optional;

public class Person {

	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private Long phoneNumber;

	
	
	
	//methods




	//Constructor
	public Person(Long id, String firstName, String lastName, String email, Long phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	
	//2nd Constructor
	
	public Person( String firstName, String lastName) { // this can be used just to create a new person
		super();
		//this.id = id;
		this.firstName = firstName;
		lastName = lastName;
		//this.email = email;
		//this.phoneNumber = phoneNumber;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return Optional.ofNullable(lastName).orElse("Last name not present");
	}
	
	public boolean getLastNameBol() {
		//Getter that returns a boolean value to confirm whether a lastname was provided or not
		return Optional.ofNullable(lastName).isPresent();
		//Optional.ofNullable(lastName) turned the lastName variable into an optional, allowing us to use optional methods
	}


	public void setLastName(String lastName) {
		lastName = lastName;
	}


	public String getEmail() {
		
		return Optional.ofNullable(email).orElse("Email address not present");
	}
	

	public void setEmail(String email) {
		this.email = email;
	}


	public Long getPhoneNumber() {
		return Optional.ofNullable(phoneNumber).orElseThrow(() -> new RuntimeException("Phone number not provided"));// if phone number present, it will be printed, else error message
	}


	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// To String
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", LastName=" + lastName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
}
