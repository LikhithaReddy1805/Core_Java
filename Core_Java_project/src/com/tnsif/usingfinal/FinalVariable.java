package com.tnsif.usingfinal;

public class FinalVariable {
	//The final instance variable must be initialized
	//private final int x;
	
	 final int x=100;
	 
	// Declare a static blank final variable.
	final static int Y;
	
	// Declare & intialize static final variable.
		final static int Z = 10;
		
//instance method
	void change(){
		//this.x=200;//final variables cant be re assigned
		//this.Y=100; //final variables cant be re assigned
	}
	
	// Declare a static block to initialize the final static variable.
		static {
			Y = 20;
			//Z = 100; // Once intialized can't be reassigned
			System.out.println("Value of Y: " + Y);
		}


}