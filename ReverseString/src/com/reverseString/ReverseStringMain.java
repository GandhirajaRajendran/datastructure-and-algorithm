package com.reverseString;

public class ReverseStringMain {

	public static void main(String[] args) {

		String str = "this is a string";

		System.out.println(reverseString(str));

	}
//Using StringBuilder
	private static StringBuilder reverseString(String str) {

		char[] strarray = str.toCharArray();

		StringBuilder strnew = new StringBuilder();

		for (int i = strarray.length - 1; i >= 0; i--) {

			System.out.println(strarray[i]);

			strnew.append(strarray[i]);

		}

		return strnew;

	}

}
