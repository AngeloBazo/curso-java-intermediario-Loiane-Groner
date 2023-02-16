package com.loiane.cursojava.aula54;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemana dia1 = DiaSemana.SEGUNDA;
		
		DiaSemana dia2 = DiaSemana.TERCA;
		
		DiaSemana dia11 = DiaSemana.SEGUNDA;
	

		System.out.println(dia1.toString() + " - " + dia1.getValor());
		
		
		System.out.println(dia1 == dia2);
		System.out.println(dia1 == dia11);
		
		System.out.println(dia1.compareTo(dia1));
		System.out.println(dia1.compareTo(dia2));
		
		System.out.println(dia1.equals(dia11));
		System.out.println(dia1.equals(dia2));


	} 

}
