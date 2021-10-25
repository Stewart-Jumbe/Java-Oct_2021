package com.qa.main;

public class ArrayExes {
	
	public static void exeOne() {
	int myArray[] = {1,2,3,4,5,6,7,8,9,10};
	int secArray[] = {1,1,1,1,1,1,1,1,1,1};
	int thirdArray[] = {1,1,1,1,1,1,1,1,1,1};
	
	for(int i=0; i <myArray.length;i++) {
		int outArray = myArray[i]*2;
		int outSArray= myArray[i]*i;
		System.out.println(outArray);
		System.out.println(outSArray);
	}
	
	//Alternative method using using for each loop
	for(int num :myArray) {
		System.out.println(myArray[num]);
	}
	
	

	//loop to create array that stores squared values
	for (int i=0; i <secArray.length;i++) {
		secArray[i] = myArray[i]*i;
		System.out.print(secArray[i] + " ");
	}
	
	for (int i=0; i <myArray.length;i++) {
		
		int reverseNum = i+1;
				
		thirdArray[myArray.length -reverseNum] = myArray[i]*i;
		System.out.print(thirdArray[i]);
	}

}
}