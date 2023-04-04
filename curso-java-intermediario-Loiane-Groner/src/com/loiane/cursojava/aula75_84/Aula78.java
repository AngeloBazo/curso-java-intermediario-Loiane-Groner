package com.loiane.cursojava.aula75_84;

public class Aula78 {

	public static void main(String[] args) {

		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";
		String ola4 = new String(ola);

		System.out.println("ola: " + ola);
		System.out.println("ola2 " + ola2);
		System.out.println("ola3: " + ola3);
		System.out.println("ola4: " + ola4);

		System.out.println("-------------------------------------");

		System.out.println("ola equals ola2 = " + ola.equals(ola2));
		System.out.println("ola equals ola3 = " + ola.equals(ola3));

		System.out.println("Ignore case: ola equals ola2 = " + ola.equalsIgnoreCase(ola2));

		System.out.println("ola == ola2 " + (ola == ola2));
		System.out.println("ola == ola3 " + (ola == ola3));

		System.out.println("ola == ola4 " + (ola == ola4));
		System.out.println("ola equals ola4 = " + ola.equals(ola3));

		System.out.println("------------------------------------");

		String banana = "banana";
		String ana = "ana";
		String ban = "ban";

		System.out.println(banana);
		System.out.println(ana);
		System.out.println(ban);

		System.out.println("------------------------------------");

		System.out.println(banana.regionMatches(1, ana, 0, 3));
		System.out.println(banana.regionMatches(2, ana, 1, 2));

		System.out.println("------------------------------------");

		System.out.println(banana.endsWith(ana));
		System.out.println(banana.startsWith(ban));

		System.out.println("------------------------------------");

		String a = "a";
		String b = "b";
		String aMaiusculo = "A";

		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareTo(aMaiusculo));

	}

}
