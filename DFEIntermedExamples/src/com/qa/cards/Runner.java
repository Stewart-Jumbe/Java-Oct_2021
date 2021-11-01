package com.qa.cards;

import java.util.ArrayList;
import java.util.List;

import com.qa.enums.Rank;
import com.qa.enums.Suit;


//Create two classes called "card" and "dealer", the purpose of this ex will be to
//use your knowledge of enums to populate that of the card class with enumerated values
//for example, create a enum called rank or suit.


public class Runner {

	public static void main(String[] args) {
		
		
		//Instance of mycard
//		MyCard card = new MyCard(Rank.FIVE, Suit.CLUBS);
//		MyCard card2 = new MyCard();
//		System.out.println(card2.toString());
		
//		System.out.println(card.Randomrank().toString());
//		System.out.println(card.Randomsuit().toString());
//		System.out.println(card.toString());
		
		// Instantiating Dealer
		Dealer jackTheDealer = new Dealer();
		System.out.println(jackTheDealer.deal());
		
		List<Integer> mylist = new ArrayList();
		mylist = {1,2.3};
		
		System.out.println(());
	
		
	}

}
