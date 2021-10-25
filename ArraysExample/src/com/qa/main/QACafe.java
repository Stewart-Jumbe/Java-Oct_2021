package com.qa.main;

import java.util.ArrayList;

public class QACafe {
	
//	Exercise - You are running a succesful cafe called QA-Cafe. With a list of orders, create methods with paramaters that can do the following:
//
//
//
//		2 ArrayLists, one doneOrders and orders
//
//
//
//		- Add a new order to an orders array
//		- Move an existing order to a 'Done orders array'
//		- Return the name of an order
//		- Modify the order by index with a new name
//		- Remove the order from either arrays
//		- Print the length of either arrays
//		- Clear either arrays
	
//	Small Espresso
//	Large Cold Brew
//	Medium Cappucinok
//	Medium Flat White
//	Large Choc Cookie Frappe
//	Small Caramel Iced Latte
//	Small Americano
//	Large Cafe Au Lait
//	Medium Strawberry Iced Tea

	
	//Creating my arraylist
	
	//public static ArrayList<String> cafeMenu = new ArrayList<>();
	public static ArrayList<String> orders = new ArrayList<>();
	public static ArrayList<String> doneOrders = new ArrayList<>();
	
	
	public static void addOrders(String newOrder) {
		orders.add(newOrder);
		System.out.println(orders);
	}

	public static void moveOderToDone(int index) {
		doneOrders.add(orders.get(index));
		System.out.println("current orders are" + orders);
	}
		//public static void removeDoneOrders (int index) {
		//}
		
	public static void changeOrder (int index, String orderName) {
		
		orders.set(index, orderName);
		String replacedOrder = orders.get(index);
		
		System.out.println("your new order has been added" + replacedOrder);
	}

	public static void getOrderName (int index) {
		
		String orderName = orders.get(index);
		System.out.println("The order was" + orderName);
	}
	
	public static void numberOfOders () {
		int presentOrders = orders.size(); // removes all items in the array
		System.out.println("you currently have " + presentOrders + " orders");
	}
	
	public static void showOders() {
		for(String order: orders) {
			System.out.print( order + ","+" ");
			
		}System.out.println("");
	}
	
	
	//print clear either array
	public static void clearOrders () {
		orders.clear(); // removes all items in the array
		System.out.println("Order list is empty is " + orders.isEmpty());
	}
	
	/// Stretch exe
	
//	Stretch goal - Using either multi dimensional arrays OR objects use the following orders splitting size, name and extras
//
//	Small Espresso w/ Chocolate
//
//	Large Cold Brew w/ double shot
//
//	Medium Cappucino w/ Oat Milk
//
//	Medium Flat White
//
//	Large Choc Cookie Frappe w/ sugar free syrup
//
//	Small Caramel Iced Latte w/ honeycomb dust
//
//	Small Americano
//
//	Large Cafe Au Lait w/ extra milk
//
//	Medium Strawberry Iced Tea
	
	
	
	
		
	
}	
	