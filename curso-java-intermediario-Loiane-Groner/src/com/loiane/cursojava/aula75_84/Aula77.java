package com.loiane.cursojava.aula75_84;

import java.util.Arrays;

public class Aula77 {

	public static void main(String[] args) {

		String java = "java";

		for (int i = 0; i < java.length(); i++) {

			System.out.println(java.charAt(i));

		}

		char[] jav = new char[3];

		java.getChars(0, 3, jav, 0);

		System.out.println(jav);

		byte[] javaBytes = new byte[3];
		java.getBytes(0, 3, javaBytes, 0);

		System.out.println(javaBytes);
		System.out.println(Arrays.toString(javaBytes));

		char[] javaChars = java.toCharArray();
		System.out.println(javaChars);
	}

}
