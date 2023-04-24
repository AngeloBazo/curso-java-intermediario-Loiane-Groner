package com.loiane.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aula94DiferencasEntreDatas {

	public static void main(String[] args) {

		try {
			diferencaDataAteJava7();
		} catch (ParseException e) {

			e.printStackTrace();
		}
		
		
		System.out.println("--------------------------------");
		
		diferencaDataJava8();

	}

	public static void diferencaDataAteJava7() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date primeiraDt = sdf.parse("01/01/2019");
		Date segundaDt = sdf.parse("01/02/2019");

		long diffEmMil = Math.abs(segundaDt.getTime() - primeiraDt.getTime());

		long diff = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);

		int dias = (int) (diffEmMil / (1000 * 60 * 60 * 24));

		System.out.println(diff);

		System.out.println(dias);

		primeiraDt.getTime();

	}

	public static void diferencaDataJava8() {
		
		LocalDate data1 = LocalDate.of(2019, 01, 01);
		LocalDate data2 = LocalDate.of(2019, 02, 01);
		
		Period periodo = Period.between(data1, data2);
		
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		
		System.out.println("Dias: " + dias);
		System.out.println("Meses: " + meses);
	}
	
	
	
}
