package com.tnsif.generics;

import java.util.ArrayList;

public class WithGenerics {

	public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
		
		al.add("JAVA");
		//al.add(123);//Compile Time run
		
		for(String object:al) {
			
			System.out.println(object);
		}

	}

	}

