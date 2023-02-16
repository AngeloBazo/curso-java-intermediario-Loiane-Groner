package com.loiane.cursojava.aula68;

public class TesteThread68 {

	public static void main(String[] args) {
	
		
		MinhaThread thread1 = new MinhaThread("#1", 900);
		Thread t1 = new Thread(thread1);
		t1.start();

		
		MinhaThread thread2 = new MinhaThread("#2", 300);
		Thread t2 = new Thread(thread2);
		t2.start();

		
	}

}
