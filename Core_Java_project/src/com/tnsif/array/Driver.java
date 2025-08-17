package com.tnsif.array;

public class Driver {

	public static void main(String[] args) {
		ArrayOperations obj=new ArrayOperations();
		int arr[]=new int[5];
		obj.addElements(arr);
		obj.printArray(arr);
		System.out.println("The odd count is "+obj.getOddCount(arr));

	}

}