package com.tnsif.generics;

public class GenericClassTest {

	public static void main(String[] args) {
		GenericClass<String> object=new GenericClass<String>();
		object.set("Gayatri");

		GenericClass<Integer> object1=new GenericClass<Integer>();
		object1.set(123);

	}

}