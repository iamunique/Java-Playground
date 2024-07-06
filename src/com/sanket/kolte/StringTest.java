package com.sanket.kolte;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Sanket";
		System.out.println(a.length());
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.startsWith("S"));
		System.out.println(a.endsWith("t"));
		System.out.println(a.contains("an"));
		System.out.println(a.trim());
		System.out.println(a.strip());
		System.out.println(a.substring(0, 2));

		System.out.println(Arrays.toString(a.toCharArray()));
		System.out.println(Arrays.toString(a.split("e")));

		String b = "Sanket";
		System.out.println(a == b);

		String c = "Sanket";
		System.out.println(a == c);

		String d = new String("Sanket");
		System.out.println(a == d);
		System.out.println(a.equals(d));

		System.out.println(a.equals(b));

		Priority p = Priority.LOW;
		System.out.println(p);
	}

}
