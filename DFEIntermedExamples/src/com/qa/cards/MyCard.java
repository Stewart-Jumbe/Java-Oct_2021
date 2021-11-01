package com.qa.cards;

import java.util.Random;

import com.qa.enums.Rank;
import com.qa.enums.Suit;

public class MyCard {

	private final Rank rank; // No Setters needed
	private final Suit suit;// No Setters
	
	//Methods for generating random rank and suit
	
	public Rank Randomrank() { // Rank is the type cause that will be return
		Rank rank = Rank.values()[new Random().nextInt(Rank.values().length)]; //Creating variable rank of Type Rank, we create a random then going through the Rank enum 
		//to select a random rank based on the number of items in Rank
		return rank;
	}
	
	public Suit Randomsuit() { // Suit is the type cause that will be return
		Suit suit = Suit.values()[new Random().nextInt(Suit.values().length)]; //Creating variable rank of Type Suit, we create a random index which goes through the Suit enum 
		//to select a random rank based on the number of items in Rank
		return suit;
	}
	
	
	//Constructor
	public MyCard(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	
	public MyCard() {
		super();
		this.rank = Randomrank();
		this.suit = Randomsuit();
	}
	
	

	// Getters

	public Rank getRank() {
		return rank;
	}


	public Suit getSuit() {
		return suit;
	}

	// To String
	@Override
	public String toString() {
		return "MyCard [rank=" + rank + ", suit=" + suit + "]";
	}
	
	
	
	
	
}
