package com.tnsif.generics;

import com.tnsif.inheritance.hirarchial.Citizen;

public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethod obj = new GenericMethod();
		
		Integer[] intarray = { 10, 20, 30, 40 };
		
		String[] str = { "java", "programming", "learning" };
		
		Citizen[] c= {new Citizen("Gayatri","Bangalore",1462269847,364861386L),new Citizen("Gayatri","Bangalore",1462269847,364861386L)};

		//Display Integer Array 
				obj.displayArrayElements(intarray);
				
				//Display Stringr Array 
				obj.displayArrayElements(str);
				
				//Display Citzen Array 
				obj.displayArrayElements(c);
		
	}

}