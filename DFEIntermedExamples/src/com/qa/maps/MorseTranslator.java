package com.qa.maps;

import java.util.HashMap;

public class MorseTranslator {
	
	
	
	public static void populate() {
	
		HashMap<String, Character> morseCode = new HashMap<String, Character>();
		
		morseCode.put(".-", 'A');
		morseCode.put("-...", 'B');
		morseCode.put("-.-.", 'C');
		morseCode.put("-..", 'D');
		morseCode.put(".", 'E');
		morseCode.put("..-.", 'F');
		morseCode.put("--.", 'G');
		morseCode.put("....", 'H');
		morseCode.put("..", 'I');
		morseCode.put(".---", 'J');
		morseCode.put("-.-", 'K');
		morseCode.put(".-..", 'L');
		morseCode.put("--", 'M');
		morseCode.put("-.", 'N');
		morseCode.put("---", 'O');
		morseCode.put(".--.", 'P');
		morseCode.put("--.-", 'Q');
		morseCode.put(".-.", 'R');
		morseCode.put("...", 'S');
		morseCode.put("-", 'T');
		morseCode.put("..-", 'U');
		morseCode.put("...-", 'V');
		morseCode.put(".--", 'W');
		morseCode.put("-..-", 'X');
		morseCode.put("-.--", 'Y');
		morseCode.put("--..", 'Z');
		
		System.out.println(morseCode.get(".-"));
	}
		
		//Method for printing text
		
	public void printText(String str) {
	    for (char ch: str.toCharArray()
	         ) {
	        if(ch == ' '){
	            System.out.println("space here");
	        }else if(ch == '.'){
	            System.out.println("dot here");
	        }else if(ch == ','){
	            System.out.println("comma here");
	        }else {
	            if(myHash.get(ch)!=null){
	                System.out.println(myHash.get(ch));
	            }
	        }
	    }
	}
			
	
	
	}
}

