package com.sanket.kolte.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class E8QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> obj = new PriorityQueue<String>();// (FIFO)

		obj.add("A");
		obj.add("B");
		obj.add("C");
		System.out.println(obj);

		String s = obj.poll();
		System.out.println("Popped element : " + s);
		System.out.println(obj);
		System.out.println(obj.size());
	}
}
