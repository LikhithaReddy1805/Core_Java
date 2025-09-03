package com.tnsif.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		System.out.println(l1);
		
		ListIterator li=l1.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}

		l1.add(0, 40);
		
		System.out.println(l1);
	}
}