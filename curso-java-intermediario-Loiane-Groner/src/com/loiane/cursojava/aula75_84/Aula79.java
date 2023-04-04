package com.loiane.cursojava.aula75_84;

public class Aula79 {

	public static void main(String[] args) {
		
		String banana = "banana";
		String ana = "ana";
		String bananeira = "bananeira";

		System.out.println(banana);
		System.out.println(ana);
		System.out.println(bananeira);

		System.out.println("------------------------------------");
		
		System.out.println(banana.indexOf(ana));
		System.out.println(banana.indexOf("ch"));
		System.out.println(banana.indexOf("ana"));
		
		
		System.out.println(bananeira.indexOf("ra"));
		
		System.out.println(banana.lastIndexOf('a'));
		
		System.out.println(banana.contains(ana));
		System.out.println(banana.contains("ceu"));

	}

}
