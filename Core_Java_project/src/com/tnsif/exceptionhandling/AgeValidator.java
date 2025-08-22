package com.tnsif.exceptionhandling;

public class AgeValidator {

	public static void validateAge(int age)throws InvalidAgeException {
		
		if(age<18)
			throw new InvalidAgeException("Early to cast the vote");
	}

}