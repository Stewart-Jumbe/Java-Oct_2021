package com.qa.main;
import java.util.Random; //importing  a random


public class DiceStack {
	
	
	//3 sided dice
	public static int threeSidedDice() {
		int roll = new Random().nextInt(3);
		roll++;// avoids getting zero
		return roll;
	}
	
	
	
	//4 sided dice
	public static int fourSidedDice() {
		int roll = new Random().nextInt(4)+1;
		return roll;
	}
	
	
	//6 sided dice
	public static int sixSidedDice() {
		int roll = new Random().nextInt(6)+1;
		return roll;
	}
	
	//8 sided dice
	public static int eightSidedDice() {
		int roll = new Random().nextInt(8)+1;
		return roll;
	}
	
	//10 sided dice
	public static int tenSidedDice() {
		int roll = new Random().nextInt(11);
		roll = roll +1; // avoid rolling 0
		return roll;
	}
	
	
	// sumof 4 six sided dice
	public static int sum4SidedDice() {
		int roll1 = sixSidedDice();
		int roll2 = sixSidedDice();
		int roll3 = sixSidedDice();
		int roll4 = sixSidedDice();
		
		return roll1 +roll2 + roll3 +roll4;
	}
		
	// sum of 2 10 sided dice and 2 3 sided dice
	
	public static int sum10SidedDice() {
		int roll1 = tenSidedDice();
		int roll2 = tenSidedDice();
		
		
		return roll1 +roll2;
	}
	
	//sum of 1 of each dice
	public static int sumAllSidedDice() {
		int roll1 = fourSidedDice();
		int roll2 = sixSidedDice();
		int roll3 = eightSidedDice();
		int roll4 = tenSidedDice();
		
		return roll1 +roll2 + roll3 +roll4;
	}
	
	// Sum of 4 six sided dice ignoring the smallest value
	
	public static int sum4SixSidedDice() {
		int roll1 = sixSidedDice();
		int roll2 = sixSidedDice();
		int roll3 = sixSidedDice();
		int roll4 = sixSidedDice();
		
		int total = 0;
		
		if (roll1 < roll2 && roll1 < roll3 && roll1 < roll4) {
			
			 total = roll2 + roll3 + roll4;
		}
		
		else if (roll2 < roll1 && roll2 < roll3 && roll2 < roll4) {
			 total = roll1 + roll3 + roll4;
		}
		
		else if (roll3 < roll1 && roll3 < roll1 && roll3 < roll4) {
			 total = roll1 + roll2 + roll4;
		}
		
		else if (roll4 < roll1 && roll4 < roll2 && roll4 < roll3) {
			 total = roll1 + roll3 + roll2;
		}
		
		return total;
			
		
	}
	
	// if any of the dice roll a 1 the totl sum is 1 if any dice roll their max number roll the dice again
	
	public static int finalChallenge() {
		int v = 0;
		return v;
	}

	
	
	
}
