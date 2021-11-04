package com.qa.Humans.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // tells the DB to create table with attributes as fields
public class Human {
	
	@Id // tells Spring this is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)// AUTO_INCREMENT
	private Integer id;
	
	
	//Attributes 
	private String name;
	private int 	ageOfBirth;
	private String planetOfOrgin;
	private boolean bionicTech; // whehter they have have bionic implants
	private double 	updateVersion; //bionic human software update level
	private String  implantedAbility; // implanted ability 
	
	//Constructor
	
	
	//default constructor, allows you to create a blank object
	public Human() {
		super();
	}
	
	//
	public Human(String name, int ageOfBirth, String planetOfOrgin, boolean bionicTech, double updateVersion,
			String implantedAbility) {
		super();
		this.name = name;
		this.ageOfBirth = ageOfBirth;
		this.planetOfOrgin = planetOfOrgin;
		this.bionicTech = bionicTech;
		this.updateVersion = updateVersion;
		this.implantedAbility = implantedAbility;
	}
	
	
// Constuctor used for returning info from database
	public Human(Integer id, String name, int ageOfBirth, String planetOfOrgin, boolean bionicTech,
			double updateVersion, String implantedAbility) {
		super();
		this.id = id;
		this.name = name;
		this.ageOfBirth = ageOfBirth;
		this.planetOfOrgin = planetOfOrgin;
		this.bionicTech = bionicTech;
		this.updateVersion = updateVersion;
		this.implantedAbility = implantedAbility;
	}

	//Getters and Setters [Required for DB to work] 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAgeOfBirth() {
		return ageOfBirth;
	}

	public void setAgeOfBirth(int ageOfBirth) {
		this.ageOfBirth = ageOfBirth;
	}

	public String getPlanetOfOrgin() {
		return planetOfOrgin;
	}

	public void setPlanetOfOrgin(String planetOfOrgin) {
		this.planetOfOrgin = planetOfOrgin;
	}

	public boolean isBionicTech() {
		return bionicTech;
	}

	public void setBionicTech(boolean bionicTech) {
		this.bionicTech = bionicTech;
	}

	public double getUpdateVersion() {
		return updateVersion;
	}

	public void setUpdateVersion(double updateVersion) {
		this.updateVersion = updateVersion;
	}

	public String getImplantedAbility() {
		return implantedAbility;
	}

	public void setImplantedAbility(String implantedAbility) {
		this.implantedAbility = implantedAbility;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	// To String [Not needed for DB]

//	@Override
//	public String toString() {
//		return "Human [name=" + name + ", ageOfBirth=" + ageOfBirth + ", planetOfOrgin=" + planetOfOrgin
//				+ ", bionicTech=" + bionicTech + ", updateVersion=" + updateVersion + ", implantedAbility="
//				+ implantedAbility + "]";
//	}
	
	

	

	
	
}
