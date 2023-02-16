package com.loiane.cursojava.aula56;

public class MetodosEnum {

	EnumOpMat operacoesMat;

	public MetodosEnum(String operacoesMat) {
		this.operacoesMat = EnumOpMat.valueOf(operacoesMat);
	}

	public void executarOperacao(double x, double y) {

		switch (operacoesMat) {
		case SOMAR:
			System.out.println(x + y);
			break;

		case SUBTRAIR:
			System.out.println(x - y);
			break;

		case MULTIPLICAR:
			System.out.println(x * y);
			break;

		case DIVIDIR:
			System.out.println(x / y);
			break;

		default:
			System.out.println("Opera��o inexistente");
			break;
		}

	}

	@Override
	public String toString() {
		return "Opera��o: " + operacoesMat;
	}

}
