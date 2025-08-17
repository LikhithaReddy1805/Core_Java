package com.tnsif.polymorphism;

import java.util.ArrayList;

public class PolymorphismDemo {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		int result=c1.add(c1.getNumOne(), c1.getNumTwo());
		System.out.println(result);
		
		Calculator c2 = new Calculator();
		int resultOne = c2.add(c2.getNumThree(), c2.getNumFour());
		System.out.println(resultOne);
		
		Calculator c3 = new Calculator(100,200);
		System.out.println(c3.add(c3.getNumOne(),c3.getNumTwo()));
		
		//ArrayList al=new ArrayList<>();
		
	}

}