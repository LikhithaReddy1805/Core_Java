package com.tnsif.constructor;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
        System.out.println(c1);
        Customer c2=new Customer();
        System.out.println(c2);
        
        Customer c3=new Customer("Gayatri","Bangalore",2);
        System.out.println(c3);
        
        Scanner sc=new Scanner(System.in);
        String name, city;
    	int id;
    	System.out.print("Enter Customer Id : ");
    	id=sc.nextInt();
    
    	System.out.print("Enter Customer Name : ");
    	name=sc.next();
    	
    	System.out.print("Enter Customer City : ");
    	city=sc.next();
    	
    	Customer c4=new Customer(name,city,id);
        System.out.println(c4);
	}

}