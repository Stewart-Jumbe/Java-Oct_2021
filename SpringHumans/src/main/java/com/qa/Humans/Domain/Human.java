package com.qa.Humans.Domain;

public class Human {
	
	//Attributes 
	private String name;
	private int 	ageOfBirth;
	private String planetOfOrgin;
	private boolean bionicTech; // whehter they have have bionic implants
	private double 	updateVersion; //bionic human software update level
	private String  implantedAbility; // implanted ability 
	
	//Constructor
	
	//default constructor
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

	//Getters and Setters

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
	// To String

	@Override
	public String toString() {
		return "Human [name=" + name + ", ageOfBirth=" + ageOfBirth + ", planetOfOrgin=" + planetOfOrgin
				+ ", bionicTech=" + bionicTech + ", updateVersion=" + updateVersion + ", implantedAbility="
				+ implantedAbility + "]";
	}
	
	

	

	
	
}
