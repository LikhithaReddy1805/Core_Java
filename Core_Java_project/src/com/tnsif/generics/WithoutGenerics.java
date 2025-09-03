package com.tnsif.generics;

import java.util.ArrayList;

public class WithoutGenerics {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("JAVA");
		al.add(123);
		
		for(Object object:al) {
			String str=(String)object;
			System.out.println(str);
		}

	}

}