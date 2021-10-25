package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		
		//Demo.arrayDemo();
		//ArrayExes.exeOne();
//		ArrayLists.addPizza();
//		ArrayLists.setupArray();
//		System.out.println(ArrayLists.getPizza(1));
//		ArrayLists.forLoopArrayList();
		QACafe.addOrders("chocolate");
		QACafe.addOrders("milk");
		QACafe.addOrders("Small Espresso");
		QACafe.addOrders("Large Choc Cookie Frappe");
		QACafe.showOders();
		QACafe.numberOfOders();
		QACafe.clearOrders();
		
		
	}

}
