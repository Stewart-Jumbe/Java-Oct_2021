package com.qa.lamda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcTryCatch {

	
	public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            System.out.print("Input the first number: ");
            int a = input.nextInt();
            System.out.print("Input the second number: ");
            int b = input.nextInt();
            int d = (a/b);
            System.out.println();
            System.out.println("The division of a and b is:" +d);
           
            //ArithmeticException 
        }   catch(ArithmeticException e){
            
        	//InputMismatchException
            System.out.println ("You Shouldn't divide a number by zero");
        }   catch(InputMismatchException e){
            System.out.println ("Enter a whole number");
        } 
}
}
