package com.qa.lamda;

import com.qa.exceptions.CustomException;

public class CalcTryCatchWithCustom {

	
	public static int calcDiv(int num1, int num2) {
        int result = 0; // creates result object
        try { // will try and do the block
            // if checks if 1 greater than 2 = throw error
            if (num1 < num2) {
                throw new CustomException("Please ensure the first number is greater than the second!");
            }
            result = num1 / num2; // if the if statement doesn't apply result = divide
        }
        catch (ArithmeticException e) {
            e.printStackTrace(); //
            System.out.println("Please don't Divide by Zero");
        } catch (CustomException e) {// we dont neeed to have a throw statement because we have a catch statement
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
