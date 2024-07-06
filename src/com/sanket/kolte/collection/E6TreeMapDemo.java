package com.sanket.kolte.collection;

import java.util.TreeMap;

public class E6TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> obj = new TreeMap<>(); //Key Value Representation, Sets in order of Keys
		obj.put("A", 1);
		obj.put("B", 2);
		obj.put("D", 5);
		obj.put("C", 3);
		obj.put("C", 4); // Value will be replaced

		System.out.println(obj);

	}

}
