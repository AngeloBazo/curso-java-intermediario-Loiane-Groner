package com.loiane.cursojava.aula85_100;

import java.text.DecimalFormat;

public class Aula97DecimalFormat {

	public static void main(String[] args) {

		String padrao = "###,###.##";

		DecimalFormat df = new DecimalFormat(padrao);

		// df.applyPattern(padrao);

		System.out.println(df.format(1234567890.123));

	}

}
