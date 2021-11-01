package com.sjumbe.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Methods {


    public Integer sumMethod(Integer num1, Integer num2){
        return num1 + num2;
    }
    
    
    // public String myScanner(String scanReqMsg) {
    	
    // 	//creating scanner object
    // 	Scanner scan = new Scanner(System.in);
    	
    // 	//prints out user defined message
    // 	System.out.println(scanReqMsg);
    	
    // 	String scannedInput = scan.next();
    	
    // 	scan.close();
    	
    // 	return scannedInput; 
    // }
    
    //42. Write a Java program to input and display your password
    public void myPass() {
    	
    	
    	//Creating an instance of the scanner
    	//System.in is needed to allow inputs from the console
		Scanner scan = new Scanner(System.in);
    	
		//asking the user for pas
    	System.out.println("Please enter your password below");
		//Capturing input in the scanner
		String userPass = scan.nextLine();
		scan.close();
    	
    	//gets next word entered and stores it as pass
    	
    	
    	System.out.println(String.format("%s %s", "Your password was:",userPass)) ;
    }
    
    //45. Write a Java program to find the size of a specified file. Go to the editor
    // 
    
    public void determineFileSize() {
    	//Creating scanner object
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Please enter the path of the file you'd like to determint the size of");
    	
    	//Capturing file path as filePath variable
    	String filePath = scan.next();
    	//using Java Nio
    	Path path = Paths.get(filePath);
		
    	try {
			Long fileSize = Files.size(path);
			System.out.println(String.format("%s, bytes", fileSize));
			System.out.println(String.format("%s, kilobytes", fileSize/1024));

			
		}catch (IOException e) {
			e.printStackTrace();
		}
    	scan.close();
    	
    }

    
}
