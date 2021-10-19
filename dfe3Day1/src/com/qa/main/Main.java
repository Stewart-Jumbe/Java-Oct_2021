package com.qa.main;

public class Main {// everything in java needs a main method
	public static void main(String[] args){//plublic = accessibility, .i.e can be where it can be viewed, static = method employed main instance
	//have to be created each time i want to use the method, void = it will return nothing, alternatives are string,int etc if void is present
	//return statement is not needed, main == parameters
	//System.out.println("Hello World\nI'm at Stewart's house");//every statement needs to end in a semicolon, always use double quotation

		Turtle mrJackson = new Turtle(27,6,true,"fish"); //creates a new instance on an object
		Turtle eel = new Turtle();
		Turtle jack = new Turtle(12,100,"cheese");
		System.out.println(jack.toString());
		System.out.println(mrJackson.food);
}
}

