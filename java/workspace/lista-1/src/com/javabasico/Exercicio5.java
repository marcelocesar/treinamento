package com.javabasico;


public class Exercicio5 {

	public static void main(String[] args) {
		
		double x = 0;
		double xAnterior = 0;
		float denominador = 1;
		float precisao = 0.000001f;
		double diferenca = 1;
		int count = 0;
		int sinal = 1;
		
		while(diferenca > precisao){
			
			xAnterior = x;
			
			x = x + (sinal * 1/denominador);
			denominador = denominador + 2;
			
			//Pega o valor absoluto ex: -0.03333 = 3.
			diferenca = Math.abs(x - xAnterior);
			
			sinal = -sinal;
			// sinal recebe -1
			
			count++;
		}
			
		x = x * 4;
		
		System.out.printf("PI=%.20f, count=%d", x, count);
	}
}
