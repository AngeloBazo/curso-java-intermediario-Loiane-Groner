package com.loiane.cursojava.aula56;

public class ExercicioEnumMain {

	public static void main(String[] args) {

		EnumOpMat[] arrayEnum = EnumOpMat.values();

		for (int i = 0; i < arrayEnum.length; i++) {

			System.out.print(arrayEnum[i] + ", ");

		}

		System.out.println("\n-------------------------");

		System.out.println("Valor de x = 100 e y = 5");
		
		System.out.println("-------------------------");

		MetodosEnum obj01 = new MetodosEnum("SOMAR");

		System.out.println(obj01.toString());

		obj01.executarOperacao(100, 5);

		System.out.println("-------------------------");

		MetodosEnum obj02 = new MetodosEnum("SUBTRAIR");

		System.out.println(obj02.toString());

		obj02.executarOperacao(100, 5);

		System.out.println("-------------------------");

		MetodosEnum obj03 = new MetodosEnum("MULTIPLICAR");

		System.out.println(obj03.toString());

		obj03.executarOperacao(100, 5);

		System.out.println("-------------------------");

		MetodosEnum obj04 = new MetodosEnum("DIVIDIR");

		System.out.println(obj04.toString());

		obj04.executarOperacao(100, 5);

		System.out.println("-------------------------");

	}

}
