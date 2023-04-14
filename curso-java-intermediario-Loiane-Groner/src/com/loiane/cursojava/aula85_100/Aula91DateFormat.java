package com.loiane.cursojava.aula85_100;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

	public static void main(String[] args) {

		Date hoje = new Date();

		System.out.println(hoje);

		String hojeFormatado = DateFormat.getInstance().format(hoje);

		System.out.println(hojeFormatado);

		//Locale.setDefault(new Locale("en", "ES"));

		String hojeFormatado2 = DateFormat.getInstance().format(hoje);

		System.out.println(hojeFormatado2);

		hojeFormatado = DateFormat.getTimeInstance().format(hoje);

		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getDateInstance().format(hoje);

		System.out.println(hojeFormatado);

	
	}

}
