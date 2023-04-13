package com.loiane.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {

		Locale locale = Locale.getDefault();

		System.out.println(locale);

		System.out.println("------------------------------------------");

		Locale[] locales = Locale.getAvailableLocales();

		for (Locale loc : locales) {

			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Cód da lingua:  " + loc.getLanguage());
			System.out.println("Língua: " + loc.getDisplayLanguage());
			System.out.println("Cód país: " + loc.getCountry());
			System.out.println("País: " + loc.getDisplayCountry());

			System.out.println("------------------------------------------");
		}

		Locale br = new Locale("pt", "Brasil");

		System.out.println(br);

		Locale us = new Locale("us", "EUA");

		System.out.println(us);

		Locale.setDefault(us);

		System.out.println(Locale.getDefault());

		NumberFormat nf = NumberFormat.getCurrencyInstance();

		System.out.println(nf.format(500000000000d));

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.GERMAN);

		System.out.println(nf2.format(500000000000d));

		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.ITALY);

		System.out.println(nf3.format(500000000000d));
		
	}

}
