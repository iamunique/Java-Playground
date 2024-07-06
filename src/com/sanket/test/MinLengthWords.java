package com.sanket.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinLengthWords {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Please, enter any words separated by space: ");
			String userInput = sc.nextLine();
			System.out.print("Please, enter minimum word length to filter words: ");
			int minLength = sc.nextInt();

			String[] words = userInput.split("\\s+");
			String[] filteredWords = filterWordsByLength(minLength, words);
			System.out.println(Arrays.toString(filteredWords));
		}
	}

	public static String[] filterWordsByLength(int minLength, String[] words) {
		List<String> filteredList = new ArrayList<>();
		for (String word : words) {
			if (word.length() >= minLength) {
				filteredList.add(word);
			}
		}
		return filteredList.toArray(new String[0]);
	}
}
