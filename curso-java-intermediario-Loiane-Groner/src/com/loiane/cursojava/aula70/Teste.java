package com.loiane.cursojava.aula70;

import com.loiane.cursojava.aula68.MinhaThread;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThread thread1 = new MinhaThread("#1", 500); 
		Thread t1 = new Thread(thread1);
		t1.start();
		
		MinhaThread thread2 = new MinhaThread("#2", 500);
		Thread t2 = new Thread(thread2);
		t2.start();
		
		MinhaThread thread3 = new MinhaThread("#3", 500);
		Thread t3 = new Thread(thread3);
		t3.start();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);
		
		
		
	}

}
