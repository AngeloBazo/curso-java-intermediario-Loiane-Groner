package com.loiane.cursojava.aula75_84;

public class Aula76 {

	public static void main(String[] args) {

		String curso = "Curso";
		String java = "Java";

		String cursoJava = curso + java;

		System.out.println(cursoJava);

		String resultado2Com2 = "Resultado 2 + 2 = " + (2 + 2);

		System.out.println(resultado2Com2);

		String resultado2Com2SemParentese = "Resultado 2 + 2 = " + 2 + 2;

		System.out.println(resultado2Com2SemParentese);

		String um = String.valueOf(1);

		System.out.println(um);

		System.out.println(um + 2);

		String concatenacao = "A nossa solu��o se trata de um aplicativo para cadastramento"
				+ " e contrata��o de cuidadores de idosos. Assim, o idoso que necessita de cuidados "
				+ "espec�ficos ou o familiar dele se cadastra no aplicativo, onde ele ir� "
				+ "encontrar com mais facilidade e comodidade os servi�os de cuidadores pelo qual"
				+ " este idoso necessita, de modo que, facilidade e comodidade s�o alguns dos "
				+ " diferencias de mercado que n�s, desenvolvedores desta solu��o visamos disponibilizar.";

		System.out.println(concatenacao);

		String concatenacao2 = "A nossa solu��o se trata de um aplicativo para cadastramento";
		concatenacao2 += " e contrata��o de cuidadores de idosos. Assim, o idoso que necessita de cuidados ";
		concatenacao2 += "espec�ficos ou o familiar dele se cadastra no aplicativo, onde ele ir� ";
		concatenacao2 += "encontrar com mais facilidade e comodidade os servi�os de cuidadores pelo qual";
		concatenacao2 += " este idoso necessita, de modo que, facilidade e comodidade s�o alguns dos ";
		concatenacao2 += " diferencias de mercado que n�s, desenvolvedores desta solu��o visamos disponibilizar.";

		System.out.println(concatenacao2);
	}

}
