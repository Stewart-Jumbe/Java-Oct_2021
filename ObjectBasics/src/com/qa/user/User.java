package com.qa.user;

public class User {
	
	//Fields
	public long  fieldID; // should be used when extracting data from mysql database
	public String firstname;
	public String lastname;
	public String email;
	public int age;
	// Constructor - Overloading
	// Within a class you can use AS MANY constructors as you want - with different combos of fields
	

	// This contructor takes in 4 parameters, 3 strings and 1 int
	// This could be used to insert data into mySQL
	public User(String firstname, String lastname, String email, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
	}

	// Another constructor but his time wih field id
	public User(long fieldID, String firstname, String lastname, String email, int age) {
		super();
		this.fieldID = fieldID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
	}
	
	
	
	

}
