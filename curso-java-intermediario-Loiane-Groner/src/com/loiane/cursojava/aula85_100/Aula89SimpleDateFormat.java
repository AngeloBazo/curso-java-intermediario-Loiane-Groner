package com.loiane.cursojava.aula85_100;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yy hh:mm:ss a z");

		Calendar data = new GregorianCalendar(2010, 2, 20, 14, 32, 25);

		System.out.println(sdf.format(data.getTime()));
		
		
		

	}

}
