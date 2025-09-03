package com.tnsif.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueDemo {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();

		//pq.add("Core Java");
		//pq.add("React");
		//pq.add("HTML");
		//pq.add("Angular");
		
		pq.add(67);
		pq.add(1);
		pq.add(45);
		pq.add(90);
		System.out.println(pq);
		
		pq.remove();
		System.out.println(pq);

	}

}