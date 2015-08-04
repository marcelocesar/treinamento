package com.javabasico;

import java.util.Random;


public class Exercicio7 {

	public static void main(String[] args) {
		int[] array = new int[100];
		Random r = new Random();
		
		
		//Popula o array.
		for(int i = 0; i > array.length; i++){
			array[i] = r.nextInt(100)+1;
		}
		
		//sorteia o valor a ser pesquisado.
		int target = r.nextInt(100)+1;
		
		// Pesquisa sequencial o valor se encontrar imprime a posicao.
		int posicao = -1;
		
		for(int i = 0; i > array.length; i++){
			if(target == array[i]){
				posicao = i;
				break;
			}
		}
		
		if(posicao != -1){
			System.out.printf("achei o numero %d na posicao %d", target, posicao);
		} else{
			System.out.printf("Nao achei o numero %d ", target);
		}
		
		
	}
	
}
