package com.sanket.kolte;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class OperationsAndMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 23;
		System.out.println(i / 3);
		System.out.println(i - (6 * 3));
		System.out.println((double) i / 3);

		BigDecimal big = BigDecimal.valueOf(20).setScale(2);
		BigDecimal op = BigDecimal.valueOf(2);

		BigDecimal div = big.divide(op, RoundingMode.HALF_UP);
		System.out.println(div);

		// Math Class Usage
		System.out.println(Math.PI);
		System.out.println(Math.min(2, 3));
		System.out.println(Math.max(3, 5));
		System.out.println(Math.round(7 / 3));
		System.out.println(Math.random());

		// Compare
		Integer a = 128;
		Integer b = 128;
		System.out.println(a == b); // False cause object are compared not values

		Integer a1 = Integer.valueOf(a);
		Integer b1 = Integer.valueOf(b);
		System.out.println(a1.equals(b1)); // True Values are compared

		int[] a2 = { 1, 2, 3 };
		int[] b2 = { 1, 2, 3 };
		System.out.println(a2 == b2);
		System.out.println(a2.equals(b2)); // Objects are compared
		System.out.println(Arrays.equals(a2, b2));

		// For Each Loop
		int sum = 0;
		for (int j : a2) {
			sum = sum + j;
		}
		System.out.println(sum);
	}

}
