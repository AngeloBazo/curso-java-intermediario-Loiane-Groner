package com.loiane.cursojava.aula85_100;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {

	public static void main(String[] args) {
		
		Calendar hoje1 = Calendar.getInstance();
		
		GregorianCalendar hoje = new GregorianCalendar();
		
		System.out.println(hoje1);
		System.out.println(hoje);
		
		
		System.out.println("2023 é ano bissexto? - Resp: " + hoje.isLeapYear(2023));
		
		System.out.println("2020 foi ano bissexto? - Resp: " + hoje.isLeapYear(2020));

		System.out.println("2024 será ano bissexto? - Resp: " + hoje.isLeapYear(2024));
	}

}
