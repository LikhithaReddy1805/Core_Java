package com.tnsif.exceptionhandling;

public class PercentageValidator {

	public static void isValidPercentage(float perc) throws ArithmeticException {
		if (perc >= 0 && perc <= 100) {
			System.out.println("Valid percentage: " + perc);
		} else {
			throw new ArithmeticException("Percentage should be between 0 and 100");
		}
		
	}

}