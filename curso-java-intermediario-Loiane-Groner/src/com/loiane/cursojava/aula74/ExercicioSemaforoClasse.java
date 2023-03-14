package com.loiane.cursojava.aula74;

public class ExercicioSemaforoClasse implements Runnable {

	private String nome;
	private int tempo;

	public ExercicioSemaforoClasse(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}

	@Override
	public void run() {

		try {

			System.out.println(nome);
			Thread.sleep(tempo);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Terminou a execução da thread " + nome);
		System.out.println();
	}

}
