package com.loiane.cursojava.aula57;

public class TesteWrappers {

	public static void main(String[] args) {

		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.55555;
		boolean flag = true;
		char a = 'a';

		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000l);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');

		Integer num13 = new Integer("10000");

		System.out.println(num7);
		System.out.println(num13);

		System.out.println(num13.byteValue());

		Double num14 = new Double("3.5");

		System.out.println(num14);
				
		System.out.println(num13.doubleValue());
		
		System.out.println("-------------------");
		
		String str1 = "1000";
		
		int num16 = Integer.parseInt(str1);
		
		System.out.println(num16);
		
				
		

	}

}
