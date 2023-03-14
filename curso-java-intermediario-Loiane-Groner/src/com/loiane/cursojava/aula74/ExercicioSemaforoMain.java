package com.loiane.cursojava.aula74;

import com.loiane.cursojava.aula68.MinhaThread;

public class ExercicioSemaforoMain {

	public static void main(String[] args) {

		for (int i=0; i<2; i++) {
		
		System.out.println(">>> Início do ciclo:");
		System.out.println();
			
		ExercicioSemaforoClasse thread1 = new ExercicioSemaforoClasse("*** VERDE ***", 5000);
		Thread t1 = new Thread(thread1);

		ExercicioSemaforoClasse thread2 = new ExercicioSemaforoClasse("*** Amarelo ***", 1000);
		Thread t2 = new Thread(thread2);

		ExercicioSemaforoClasse thread3 = new ExercicioSemaforoClasse("*** VERMELHO ***", 5000);
		Thread t3 = new Thread(thread3);

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("//---- Fim do ciclo ----\\");
		System.out.println();
		
		}
	
		System.out.println("FIM DO MAIN!!!");
	
	}

}
