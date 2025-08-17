package com.tnsif.array;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// Get the Array
	int intArr[] = { 10, 20, 15, 22, 35, 18 , 14 };

   //To print all the elements in the array before sorting
	System.out.println("Array elements are "+Arrays.toString(intArr));
	
	//Sorting array
	Arrays.sort(intArr);
	System.out.println("Array elements are "+Arrays.toString(intArr));
	
	int keyValue=22;
	
	System.out.println(keyValue +" "+"found at "+Arrays.binarySearch(intArr, keyValue));
	
	//creates a new array with a specified length, 
			System.out.println("\nNew Arrays by copyOf:\n");
			int intArr2[]=Arrays.copyOf(intArr, 7);
			System.out.println("Integer Array: " + Arrays.toString(intArr2));
	}

}