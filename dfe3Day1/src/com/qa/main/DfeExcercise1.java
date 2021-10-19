package com.qa.main;

public class DfeExcercise1 { // creating a class called DfEExcercise1
    
	public static void main(String[] args) { //Parameters are string and args
        boolean amIHappy = false; // A boolean names amIHAppy is being declared and assigned false
        int weight = 20; //an integer variable weight is being declared and assigned value of 20
        String name = "Billy Bob"; // a string variable name is being declared and assigned Billy bob 
        Dog goodBoy = new Dog(name, weight); //Object is being created called goodboy and assigning it values created above
        int x = weight - 10; // an interger variable is being declared as x, with the weight being subtracted by 10
        
        if (x < 15) goodBoy.bark(); // if statement checking if x is less than 15 (x = 10) and then running the bark method, True so dog will bark
        
        while (x < 3) {// while statement that checks whether x is less than 3, value is current 10, so play method will not return a value,
            goodBoy.play();// for the play method , while loop is currently an infinate loop
        }
        
        int[] numList = {1,2,3,4,5,6}; // an int array,numlist, is being declared and assigned
        System.out.println("How are you");//printing out How are you
        System.out.println("My " + name + " is doing great"
                + " how's yours");// print statement that concatenates strings and variables : my billy bob is doing great how's are yours
        String num = "305"; //String named num called 305
        int z = Integer.parseInt(num);// New variable called z and converts it into an integer
    }

}
