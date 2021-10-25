package com.qa.bird;

//specifying that this is an abstract class by typing abstract class
public abstract class AbstractBird {

	////Abstract classes use abstract methods
	//Abstract methods have no body- their ONLY purpose is to make sure child objects use this method
	public abstract void noise();
	
	
	// Regular method with a body
	public void sleep() {
		System.out.println("zzz zzz zzz");
	}
	
	
}
