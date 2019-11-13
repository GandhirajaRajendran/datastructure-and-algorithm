package com.myfirst.trialproj;

import java.util.Arrays;

public class App {
	
	public static void main(String[] args) {
		int array[] = { 1, 10, 11, 15, 2, -3 };

		int value = 12;

		System.out.println("native" + nativemethod(array, value));
		nativemethodmultipleans(array, value);
		sortmethod(array, value);

	}

	// GIVES ONLY ONE RESULT SO NOT SUITABLE IF THERE ARE MANY ANSWERS //BRUTE FORCE
	private static String nativemethod(int[] array, int value) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] + array[j] == value) {
					// System.out.println(array[i] +" " + array[j]);
					return "i = " + array[i] + " and j =" + array[j];

				}
			}
		}

		return "NO PAIRS FOUND";
	}

	// SUITABLE FOR MANY ANSWERS //BRUTE FORCE
	private static void nativemethodmultipleans(int[] array, int value) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] + array[j] == value) {
					System.out.println(array[i] + "   " + array[j]);

				}
			}
		}

	}

	// SORT THE ARRAY - ADD FIRST AND LAST ELEMENT

	private static void sortmethod(int[] array, int value) {
		int i = 0;
		int j = array.length - 1;

		Arrays.sort(array);

		while (i < j) {

			if (array[i] + array[j] > value) {
				j--;

			}
			if (array[i] + array[j] < value) {

				i++;
			}

			if (array[i] + array[j] == value) {

				System.out.println(array[i] + "   " + array[j]);
				j--;
				i++;
			}
		}

	}
}
