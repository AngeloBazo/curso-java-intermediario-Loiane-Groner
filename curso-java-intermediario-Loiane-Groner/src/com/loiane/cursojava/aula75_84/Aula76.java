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

		String concatenacao = "A nossa solução se trata de um aplicativo para cadastramento"
				+ " e contratação de cuidadores de idosos. Assim, o idoso que necessita de cuidados "
				+ "específicos ou o familiar dele se cadastra no aplicativo, onde ele irá "
				+ "encontrar com mais facilidade e comodidade os serviços de cuidadores pelo qual"
				+ " este idoso necessita, de modo que, facilidade e comodidade são alguns dos "
				+ " diferencias de mercado que nós, desenvolvedores desta solução visamos disponibilizar.";

		System.out.println(concatenacao);

		String concatenacao2 = "A nossa solução se trata de um aplicativo para cadastramento";
		concatenacao2 += " e contratação de cuidadores de idosos. Assim, o idoso que necessita de cuidados ";
		concatenacao2 += "específicos ou o familiar dele se cadastra no aplicativo, onde ele irá ";
		concatenacao2 += "encontrar com mais facilidade e comodidade os serviços de cuidadores pelo qual";
		concatenacao2 += " este idoso necessita, de modo que, facilidade e comodidade são alguns dos ";
		concatenacao2 += " diferencias de mercado que nós, desenvolvedores desta solução visamos disponibilizar.";

		System.out.println(concatenacao2);
	}

}
