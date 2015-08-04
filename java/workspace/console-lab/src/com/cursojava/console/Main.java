package com.cursojava.console;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ideConsole();
	}
	
	public static void ideConsole(){
		Scanner console = new Scanner(System.in);
		
		System.out.print("Usuário: ");
		String inputNome = console.next();
		System.out.print("senha: ");
		int inputSenha = console.nextInt();
		System.out.printf("Bem-vindo: %s, %d", inputNome, inputSenha);
	}

}
