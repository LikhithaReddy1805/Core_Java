package com.tnsif.array;

import java.util.Scanner;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student arr[];	
		arr=new Student[5];
		
		Student s1=new Student(1,"Gayatri");
		arr[0]=s1;
		
	   arr[1]=new Student(2,"Madhav");
	   
	   for(int i=2;i<arr.length;i++) {
		   System.out.println("Enter the rollnumber of student");
		   int rollNum=sc.nextInt();
		   System.out.println("Enter the name of student");
		   String name=sc.next();
		   arr[i]=new Student(rollNum,name);
		   
	   }
	// accessing the elements of the specified array
			for (int i = 0; i < arr.length; i++)
				System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName());

	}
}