package main;

import com.qa.cake.CakeTin;
import com.qa.human.Human;
import com.qa.human.MarsHuman;
import com.qa.human.VenusHuman;
import com.qa.penguin.Penguin;

public class Runner {

	public static void main(String [] args) {
		
		// CakeTin is the data type
		// gfSpongeCake is the name of the object
		// Equal to new CakeTin (The method we're using
//		CakeTin gfSpongeCake = new CakeTin("Vanilla",12,false,"pink");
//		System.out.println(gfSpongeCake.flavour);
//		gfSpongeCake.eatCake();
//		CakeTin.numberOfBakedCakes();
		
		
//		Penguin penguin1 = new Penguin("Paulie",true,"Noot noot",false);
//		System.out.println(penguin1.getNoise());
//		penguin1.setName("Dragon Eater");
//		System.out.println(penguin1.getName());
		
		//CakeTin.eatCake();// Cant run an instanced method from a class
		
		
		//HUMAN CLASS STUFF
		//testing out newly created Human object
		Human abraham = new Human ("abraham", 700 , 175, false);
		Human jack = new Human ("jack", 18 , 185, true);
		
		//using getters to retrieve info from human class about objects
		System.out.println(abraham.getAge());
		System.out.println(abraham.getHeight());
		
		//using setters to assign to new values to objects
		abraham.setEthnicity("Isralie");
		System.out.println(abraham.getEthnicity());
		
		// Add some conditions to restrict data in Human class
		abraham.setName(";DropTables");//trying to prevent SQL injection
		
		MarsHuman drake = new MarsHuman("Drake", 120, 175, false, false, true,
				"boiled Truxi");
		System.out.println(drake.isBionic());// checking if drake is part bioninc
		
		// Creating Venus Human
		VenusHuman moses = new VenusHuman("Moses", 100, 175, true, true, true,
				"Sun dried gluba eggs", true, 5, "Planetary devastation");
		moses.enterHibernation(5);
		System.out.println(moses.getGeneration());// generation should have increased by 5
		
		
		
		
		// testing Human objects that can be defined on initialisation
		//Human eve = new Human("Eve", 32 , 167, false);
		//System.out.println(eve.toString());// printing out all attributes of eve
		
	}
	// Static methods belong to classes
	// non static belong to objects
}
