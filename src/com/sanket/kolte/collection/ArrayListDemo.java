package com.sanket.kolte.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>(5);
		for (int i = 1; i <= 5; i++) {
			a.add(i);
		}
		System.out.println(a);
		a.remove(3);

		System.out.println(a);
		System.out.println("Array Size " + a.size());

		for (int number : a) { // Enhanced For Loop
			System.out.println(number);
		}
	}
}
