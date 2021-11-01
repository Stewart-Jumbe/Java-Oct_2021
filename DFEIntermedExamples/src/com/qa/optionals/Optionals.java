package com.qa.optionals;

import java.util.Optional;

public class Optionals {

	
	public static void main(String[] args) {
		
		//Making simple optional
		Optional<Integer> number = Optional.of(100);
		Optional<Integer> nullNumber = Optional.empty();
		
		String item;
		if(Math.random() >= 0.5) {
		    item = "Hello";
		} else {
		    item = null;
		}
		Optional.ofNullable(item);
		System.out.println(item);
				
				
				
		
		
	}
}
