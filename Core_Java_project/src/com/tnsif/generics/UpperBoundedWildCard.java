package com.tnsif.generics;

import java.util.ArrayList;

public class UpperBoundedWildCard {
	public static Double sumOfList(ArrayList<? extends Number> al) {
		double sum=0.0;
		for(Number n:al) {
			sum=sum+n.doubleValue();
		}
		return sum;
	}

}