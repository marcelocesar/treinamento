package com.cursojava;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Passar os numeros para o calculo");
			System.exit(-1);
		}
		
		int total = 0;
		int somaPesos = 0;
		int valor;
				
		for (String arg: args) {
			
			valor = Integer.parseInt(arg);
			
			if( valor % 2 == 0){
				total += valor * 2;
				somaPesos += 2;
			} else{
				total += valor * 3;
				somaPesos += 3;
			}
			
		}
	
			
		float mediaPonderada = (float) total / somaPesos;
		
	
		
		System.out.printf("Soma: %d\n", total);
		System.out.printf("Media Ponderada: %.2f", mediaPonderada);
		
	}
	
/*	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Passar os numeros para o calculo");
			System.exit(-1);
		}
		
		int total = 0;
		for (String arg: args) {
			total = total + Integer.parseInt(arg);
		}
	
			
		float media = total / args.length;
		
		System.out.printf("Soma: %d\n", total);
		System.out.printf("Media: %.2f", media);
		
	}*/

}
