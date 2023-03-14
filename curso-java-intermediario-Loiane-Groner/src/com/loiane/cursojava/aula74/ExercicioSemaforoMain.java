package com.loiane.cursojava.aula74;

import com.loiane.cursojava.aula68.MinhaThread;

public class ExercicioSemaforoMain {

	public static void main(String[] args) {

		ExercicioSemaforoClasse thread1 = new ExercicioSemaforoClasse("*** VERDE ***", 5000);
		Thread t1 = new Thread(thread1);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ExercicioSemaforoClasse thread2 = new ExercicioSemaforoClasse("*** Amarelo ***", 1000);
		Thread t2 = new Thread(thread2);
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ExercicioSemaforoClasse thread3 = new ExercicioSemaforoClasse("*** VERMELHO ***", 5000);
		Thread t3 = new Thread(thread3);
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
