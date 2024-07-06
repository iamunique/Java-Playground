package com.sanket.kolte.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class E5HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> obj = new HashMap<>(); // Key Value Representation

		obj.put("A", 1);
		obj.put("B", 2);
		obj.put("C", 3);
		obj.put("C", 4); // Value will be replaced
		obj.put("D", 5);
		System.out.println(obj);
//		System.out.println(obj.size());
//		System.out.println(obj.keySet());
//		System.out.println(obj.values());

		if (obj.containsKey("A")) {
			System.out.println(obj.get("A"));
		}

		for (String key : obj.keySet()) {
			System.out.println(obj.get(key));
		}

		for (Entry<String, Integer> entry : obj.entrySet()) {
			System.out.println("The Key is : " + entry.getKey() + " with Value :: " + entry.getValue());
		}

	}

}
