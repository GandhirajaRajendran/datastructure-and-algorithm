package com.mergeSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] a1 = { 1, 3, 5, 7, 9 };
		int[] a2 = { 2, 4, 6, 7, 8, 9, 10 };

		mergerSortArrayusingList(a1, a2);
		mergeSortedArrayconcatenating(a1, a2);
		mergeSortArrayBetter(a1, a2);
	}

	// NAIVE METHOD USING ARRAYLIST AND INBUILT FUNCTION
	private static void mergerSortArrayusingList(int[] a1, int[] a2) {

		ArrayList<Integer> ar = new ArrayList<Integer>();

		for (int arr1 : a1) {
			ar.add(arr1);

		}

		for (int arr1 : a2) {
			ar.add(arr1);
		}

		Collections.sort(ar);

		System.out.println(ar);
	}

	// using default sort inbuilt function

	private static void mergeSortedArrayconcatenating(int[] a1, int[] a2) {

		int l1 = a1.length;
		int l2 = a2.length;

		int[] a3 = new int[l1 + l2];

		int i = 0;
		for (int arr1 : a1) {
			a3[i] = arr1;
			i++;
		}

		for (int arr1 : a2) {
			a3[i] = arr1;
			i++;
		}

		Arrays.sort(a3);

		for (int a : a3) {
			System.out.print(a + " ");
		}
	}

	// using this as the array is already sorted.
	private static void mergeSortArrayBetter(int[] a1, int[] a2) {

		int l1 = a1.length;
		int l2 = a2.length;
		int i = 0;
		int j = 0;
		int k = 0;
		int[] a3 = new int[l1 + l2];

		while (i < l1 && j < l2) {
			if (a1[i] < a2[j]) {

				a3[k] = a1[i];
				k++;
				i++;
				// or a3[k++]=a1[i++]
			} else
			// (a1[i]>a2[j])
			{
				a3[k] = a2[j];
				k++;
				j++;
				// or a3[k++]=a2[j++]
			}
		}
		while (i < l1) {
			a3[k] = a1[i];
			k++;
			i++;
			// or a3[k++]=a1[i++]
		}
		while (j < l2) {
			a3[k] = a2[j];
			k++;
			j++;
			// or a3[k++]=a2[j++]
		}

		for (int a : a3) {
			System.out.print(a + " ");
		}

	}
}
