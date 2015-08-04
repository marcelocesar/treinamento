package com.javabasico;


public class Exercicio3 {

	public static void main(String[] args) {
		
		float x = 0;
		float denominador = 1;
		
		//x = 1/denominador + 1/(denominador*2) + 1/(denominador*4);
		
		for(int i = 0; i < 10; i++){
			x = x + 1/denominador;
			denominador = denominador * 2;
		}

		
		System.out.printf("X=1+1/2+1/4...=%.20f", x);
	}
}
