package com.qa.cards;

import java.util.Random;

import com.qa.enums.Rank;
import com.qa.enums.Suit;

public class Dealer {
	
	private String card;
	
	
	public MyCard deal() {
		
		Rank rank = Rank.values()[new Random().nextInt(Rank.values().length)]; //Creating variable rank of Type Rank, we create a random then going through the Rank enum 
		//to select a random rank based on the number of items in Rank
		
		Suit suit = Suit.values()[new Random().nextInt(Suit.values().length)]; //Creating variable rank of Type Suit, we create a random index which goes through the Suit enum 
		//to select a random rank based on the number of items in Rank
		//MyCard card2 = new MyCard();
		
		return new Card(rank,suit);
	}
	

}

//public Card dealaCard() {
//    return new Card(Rank.values()[new Random().nextInt(Rank.values().length)],
//            Suit.values()[new Random().nextInt(Suit.values().length)]);
//}