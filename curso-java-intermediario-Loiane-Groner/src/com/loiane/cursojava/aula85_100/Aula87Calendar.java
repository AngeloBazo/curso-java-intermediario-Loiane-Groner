package com.loiane.cursojava.aula85_100;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {

		Calendar hoje = Calendar.getInstance(); // singleton (padrão de projeto)

		System.out.println(hoje);

		int ano = hoje.get(Calendar.YEAR);

		System.out.println("Ano : " + ano);

		int mes = hoje.get(Calendar.MONTH);

		System.out.println("Mês : " + mes); // no java, janeiro começa em 0

		int dia = hoje.get(Calendar.DAY_OF_MONTH);

		System.out.println("Dia : " + dia);

		int hora = hoje.get(Calendar.HOUR);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);
		int milisegundos = hoje.get(Calendar.MILLISECOND);

		System.out.println(hora + ":" + minutos + ":" + segundos + ":" + milisegundos);

		System.out.printf("Hoje é : %d/%02d/%d", dia, (mes + 1), ano);

		hoje.add(Calendar.DAY_OF_MONTH, 4);

		System.out.println();

		System.out.println("Hoje + 4 dias : " + hoje.get(Calendar.DAY_OF_MONTH));
		
		
		
		
		
		

		
		
	}

}
