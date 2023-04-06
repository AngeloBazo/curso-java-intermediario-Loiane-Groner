package com.loiane.cursojava.aula75_84;

public class Aula82 {

	public static void main(String[] args) {

		String alfabeto = String.join(", ", "a", "b", "c", "d");

		System.out.println(alfabeto);

		String[] letras = alfabeto.split(", ");

		for (int i = 0; i < letras.length; i++) {

			System.out.println(letras[i]);

		}

	}

}
