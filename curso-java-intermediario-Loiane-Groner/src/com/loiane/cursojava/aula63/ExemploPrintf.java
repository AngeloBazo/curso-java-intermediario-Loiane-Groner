package com.loiane.cursojava.aula63;

import java.util.Arrays;

public class ExemploPrintf {

	public static void main(String[] args) {

		System.out.printf("Hello %s", "Olá mundo");

		System.out.println();

		System.out.printf("Hello %S", "Olá mundo");

		System.out.println();

		System.out.printf("%c", 'c');
		System.out.printf("%C", 'c');

		System.out.printf("%n"); // pular linha

		int valor = 123456789;

		System.out.printf("%d", valor);

		System.out.printf("%n"); // pular linha

		double pFlutuante = 3.1234567;

		System.out.printf("%f", pFlutuante);

		System.out.println();

		String olaMundo = "Olá mundo";

		System.out.printf("%20s", olaMundo);

		System.out.println();

		System.out.printf("%-20s", olaMundo);

		System.out.println();

		System.out.printf("%+d", valor); // + imprime se o nº é positivo ou negativo

		System.out.println();

		System.out.printf("%015d", valor);

		System.out.println();

		System.out.printf("%,d", valor);

		int valor2 = -123456789;

		System.out.println();

		System.out.printf("% d", valor2);

		System.out.println();

		System.out.printf("%.3f", pFlutuante);

		System.out.println();

		System.out.printf("R$%10.2f", pFlutuante);

		System.out.println();

		System.out.println("-------------------------------------");

		testeMaisCompleto();

	}

	private static void testeMaisCompleto() {

		double[] precos = { 10000, 123.54, 7843.567, 1, 4.56789 };

		Arrays.sort(precos);

		for (double p : precos) {

			System.out.println(p);
		}
		
		System.out.println("-------------------------------------");

		for (int i = 0; i < precos.length; i++) {

			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
		}
		
		// na vida real utilizamos classe Java.util.Formater

	}
}
