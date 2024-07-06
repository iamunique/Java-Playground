package com.sanket.kolte;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3 };
		int c[];

		c = new int[2];
		c[0] = 2;
		c[1] = 0;

		System.out.println(a);
		System.out.println(c);
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));

	}

}
