package com.loiane.cursojava.aula65;

@interface InformacaoAula {

	String autor();

	int aulaNumero();

	String blog() default "http://globo.com";

	String site() default "http://globo.com";

}
