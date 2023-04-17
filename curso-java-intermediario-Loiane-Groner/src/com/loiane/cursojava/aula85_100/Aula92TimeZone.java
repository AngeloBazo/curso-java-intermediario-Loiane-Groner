package com.loiane.cursojava.aula85_100;

import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();

		TimeZone tz = calendar.getTimeZone();

		System.out.println(tz);

		String[] fusos = TimeZone.getAvailableIDs();

		for (String fuso : fusos) {

			System.out.println(fuso);

		}

		TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
		System.out.println(tzSP.getDisplayName());
		System.out.println(tzSP.getID());

	}

}
