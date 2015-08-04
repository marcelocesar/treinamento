package com.javabasico;

import com.javabasico.util.Teclado;

public class Exercicio1 {

	public static void main(String[] args) {

		Teclado t = new Teclado();
		
		t.inicializar();
		
		int nota1 = t.lerInt("Nota 1");
		int nota2 = t.lerInt("Nota 2");
		int nota3 = t.lerInt("Nota 3");
		
		float media = (nota1+nota2+nota3*3)/5;
		
		System.out.printf("Media: %.2f", media);
		
		t.terminar();
	}

}
