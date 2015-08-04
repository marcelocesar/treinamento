package com.javabasico;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int num = r.nextInt(20)+1;
		
		long resultado = fat(num);
		
		System.out.printf("Fatorial de %d = %d", num, resultado);
	}

	private static long fat(int num) {

		long ret = 1;
		
		for(int i = num; i > 1; i--){
			ret = ret * i;
		}
		
		/*int i = num;
		while(i>1){
			ret = ret * i;
			i--;
		}*/
		
		return ret;
	}
	

}
