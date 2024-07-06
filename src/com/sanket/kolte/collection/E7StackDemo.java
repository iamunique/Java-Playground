package com.sanket.kolte.collection;

import java.util.Stack;

public class E7StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> obj = new Stack<>();// (LIFO)

		obj.push("A");
		obj.push("B");
		obj.push("C");
		System.out.println(obj);

		String s = obj.pop();
		System.out.println("Popped element : " + s);
		System.out.println(obj);
		System.out.println(obj.size());
	}
}
