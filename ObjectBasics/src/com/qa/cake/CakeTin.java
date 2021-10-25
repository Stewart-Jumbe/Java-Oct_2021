package com.qa.cake;

public class CakeTin {
	
	// Fields - Attributes to describe the object
	
	public String flavour;
	public int size;
	public boolean glutenFree;
	public String colour;
	
	// Static field (all cakes will have the same value)
	public static int cakesBaked;
	
	// Methods - functions that the object can do
	
	public void eatCake() {
		System.out.println("Cake was delicious!");
	}

	// Static method (accessed via the class
	
	public static void numberOfBakedCakes() {
		System.out.println("Number of baked kakes is "+ cakesBaked);
	}
	
	
	// Constructor - Constructors are 'methods. to create objects from a class
	// Constructors have No Return (doesnt mean void, means no return)
	
	//Constructor name MUST BE THE CLASS NAME EXACTLY
	public CakeTin() {
//		flavour = "Vanilla";
//		size = 12;
//		glutenFree =true;
//		colour = "Beige";
	}
	
	

	@Override
	public String toString() {
		return "CakeTin [flavour=" + flavour + ", size=" + size + ", glutenFree=" + glutenFree + ", colour=" + colour
				+ "]";
	}

	public CakeTin(String flavour, int size, boolean glutenFree, String colour) {
		super(); // Within Java everything is an object of something - java,lang.object object
		this.flavour = flavour;
		this.size = size;
		this.glutenFree = glutenFree;
		this.colour = colour;
		cakesBaked++; //Whenever this constructor runs, increment cakes baked by 1
		// this. - when creating THIS object 
		
	}
	

	// I should be able to from my runner create any cake i pass the value in
	

}
