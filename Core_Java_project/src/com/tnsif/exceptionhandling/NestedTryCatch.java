package com.tnsif.exceptionhandling;

public class NestedTryCatch {
	
	public static void check() {
		String str="TNSIF";
		int slength=str.length();
		System.out.println("The length of the string is "+slength);
		String anotherString=null;
		int y=6;
		
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException se) {
				System.err.println("index is out of bounds" + se.getMessage());	
			}
		
				System.out.println("The length of the Anotherstring is "+anotherString.length());
		}
		
		catch(NullPointerException ne) {
			System.err.println(ne.getMessage());
		}
		
	}


}