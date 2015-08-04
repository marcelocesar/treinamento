package com.javabasico.util;

import java.util.Scanner;

public class Teclado {

	Scanner s;
	
	public void inicializar(){
		s = new Scanner(System.in);
	}
	
	public String ler(String text) {
		System.out.print(text + ": ");
		String input = s.nextLine();
		
		return input;
	}
	
	public int lerInt(String text) {
		System.out.print(text + ": ");
		int input = s.nextInt();
		
		return input;
	}
	
	public void terminar(){
		s.close();
	}
}
