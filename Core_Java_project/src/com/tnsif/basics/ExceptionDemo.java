package com.tnsif.basics;

public class ExceptionDemo {

	public static void main(String[] args) {
		int d=5;
		int a[]=new int[d];
		System.out.println("Value of d is "+d);
		try {
		int x=42/d;
		a[4]=30;
		
		}
		catch(ArithmeticException e) {
			System.out.println("Cant divide a number by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Cant assign a value");
		}
		finally {
			System.out.println("I am in a finally block");
		}
		System.out.println("outside catch block");
	}
}