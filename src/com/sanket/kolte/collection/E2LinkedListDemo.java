package com.sanket.kolte.collection;

import java.util.LinkedList;

public class E2LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.addLast("E");
		list.addFirst("A");
		list.add(2, "AA");

		System.out.println(list);

		list.remove("A");
		list.removeFirst();
		list.removeLast();

		System.out.println(list);

	}

}
