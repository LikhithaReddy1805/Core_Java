package com.tnsif.polymorphism.runtime;

public class MethodOverridingDemo {

	public static void main(String[] args) {
		RBI obj;
		obj=new RBI();
		System.out.println(obj.getRateOfInterest());
		
		SBI obj1=new SBI();
		System.out.println(obj1.getRateOfInterest());
		
		obj=new HDFC();
		System.out.println(obj.getRateOfInterest()+"%");
	}

}