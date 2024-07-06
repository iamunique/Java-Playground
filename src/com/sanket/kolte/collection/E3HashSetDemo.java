package com.sanket.kolte.collection;

import java.util.HashSet;

public class E3HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> st = new HashSet<String>(); // Does not allow duplicates

		st.add("A");
		st.add("B");
		Boolean r1 = st.add("C");
		Boolean r2 = st.add("C"); // WIll return false on adding duplicate

		System.out.println(st);
		System.out.println(r1);
		System.out.println(r2);

		System.out.println("HashSet contains C or not: " + st.contains("C"));

		st.remove("C");
		System.out.println("HashSet after removing C: " + st);

		for (String s : st) {
			System.out.println(s);
		}

	}

}
