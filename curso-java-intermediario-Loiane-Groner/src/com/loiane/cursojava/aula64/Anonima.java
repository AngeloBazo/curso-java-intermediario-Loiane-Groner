package com.loiane.cursojava.aula64;

public class Anonima {

	public void imprimeTexto() {

		System.out.println("Qualquer texto");

	}

	public static void main(String[] args) {

		Anonima anonima = new Anonima() {

			public void imprimeTexto() {

				System.out.println("Qualquer texto sobrescrito");

			}

		};

		anonima.imprimeTexto();

		Texto texto = new Texto() {

			@Override
			public void imprimeTexto() {
				System.out.println("Qualquer texto - interface");
			}

		};

		texto.imprimeTexto();

	 }

}
