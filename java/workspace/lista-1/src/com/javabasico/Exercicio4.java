package com.javabasico;


public class Exercicio4 {

	public static void main(String[] args) {
		
		double x = 0;
		double xAnterior = 0;
		float denominador = 1;
		float precisao = 0.000001f;
		double diferenca = 1;
		
		//x = 1/denominador + 1/(denominador*2) + 1/(denominador*4);
		
		/*for(int i = 0; i < 10; i++){
			x = x + 1/denominador;
			denominador = denominador * 2;
		}*/
		int count = 0;
		
		while(diferenca > precisao){
			
			xAnterior = x;
			
			x = x + 1/denominador;
			denominador = denominador * 2;
			
			diferenca = x - xAnterior;
			
			count++;
		}

		System.out.printf("X=1+1/2+1/4...=%.20f, count=%d", x, count);
	}
}
