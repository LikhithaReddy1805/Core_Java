package com.tnsif.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCardDemo {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(11);
		intList.add(22);
		intList.add(33);
		System.out.println(UpperBoundedWildCard.sumOfList(intList));

		ArrayList<Float> floatList = new ArrayList<Float>();
		floatList.add(11.22f);
		floatList.add(22.22f);
		floatList.add(33.3f);
		System.out.println(UpperBoundedWildCard.sumOfList(floatList));
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Hi");
		stringList.add("Hello");
		stringList.add("Bye");
		//Cant call the method
		//System.out.println(UpperBoundedWildCard.sumOfList(stringList));
		
	}

}