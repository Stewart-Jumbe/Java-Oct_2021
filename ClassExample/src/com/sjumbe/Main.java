package com.sjumbe;

public class Main {

	public static void main(String[] args) {
		Car porsche = new Car(); //created an objected called car based on template called car
		Car skoda = new Car();
		SimpleCalculator cassio = new SimpleCalculator();
		
		cassio.getFirstNumber();
		System.out.println("Model is " +cassio.getFirstNumber());
		skoda.setModel("Blahblah");
		porsche.setModel("Carrera");//Carrera is being set as the model of Porsche
		//porsche.setModel("911");// should print out model is unknown due to validation is setter method
		
		System.out.println("Model is " +porsche.getModel());

	}

}
