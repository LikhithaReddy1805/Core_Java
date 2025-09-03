package com.tnsif.generics;

import java.util.List;

public class UnBoundedWildCard {
public static void display(List<?> list) {
	for(Object element:list) {
		System.out.println(element);
	}
	
}
}