package com.myfirst.trialproj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App {
	
	public static void main(String[] args) {
		int array[] = { 1, 10, 11, 15, 2, -3 };

		int value = 12;

//		System.out.println("native" + nativemethod(array, value));
//		nativemethodmultipleans(array, value);
//		sortmethod(array, value);
//		usingSets(array,value);
		int[] a= givingPositionstoo(array,value);
		System.out.println("["+a[0] +", "+a[1]+"]");
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
	
	
	//BETTER WAY USING SETS

	private static void usingSets(int[] array, int value) {
		
		Set<Integer> s= new HashSet<Integer>();
		
		int count= 0;
		
		for(int i=0;i<array.length;i++) {
			int item=value-array[i];
			
			if(s.contains(item)) {
				System.out.println("i ="+ array[i] + " j="+(item ));
			}
			s.add(array[i]);
		}
		
	}
	
	//USING HASHMAP TO GIVE POSITION TOO
	

	private static int[] givingPositionstoo(int[] array, int value) {
	
		Map<Integer, Integer> mp=new HashMap<Integer,Integer>();
		
		for(int i=0;i<array.length;i++) {
			
			int item=value-array[i];
			
			if(mp.containsKey(item)) {
				return new int[] {mp.get(item),i} ;
			}
			
			mp.put(array[i], i);	
	
	}
		throw new IllegalArgumentException("No two sum solution");
}
}
