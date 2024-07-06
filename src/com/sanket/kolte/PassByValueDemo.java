package com.sanket.kolte;

public class PassByValueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		changeIntValue(i);
		System.out.println(i); // Change by value (Pass by value)

		i = changeInt(i);
		System.out.println(i); // (Pass by refrence)

		System.out.println(sum(2, 3, 4, 5, 6, 7, 8, 9));

	}

	private static int sum(int... a) {
		int result = 0;
		for (int i : a) {
			result = result + i;
		}
		return result;
	}

	private static void changeIntValue(int a) {
		a++;
	}

	private static int changeInt(int a) {
		a++;
		return a;
	}

}
