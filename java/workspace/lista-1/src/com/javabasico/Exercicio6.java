package com.javabasico;

import java.util.Random;


public class Exercicio6 {

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(9);
		long resultado = fat(num);
		System.out.printf("Fatorial de %d = %d", num, resultado);
	}
	
	private static long fat(int num) {
		if(num == 0 || num == 1){
			return 1;
		} else{
			return  num*fat(num-1);
		}
	}
}
