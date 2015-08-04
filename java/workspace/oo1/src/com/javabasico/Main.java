package com.javabasico;

public class Main {

	public static void main(String[] args) {
		/*Pessoa neymar = new Pessoa();
		neymar.setNome("Neymar Jr");
		neymar.setIdade(22);
		neymar.acordar();
		
		Pessoa pele = new Pessoa();
		pele.setNome("Edson Arantes Nascimento");
		pele.setIdade(-1);
		pele.acordar();
		
		System.out.println(pele.getIdade());
		System.out.println(pele.isAcordada());
		
		if (neymar == pele) {
			System.out.println("Nunca ocorrera");
		} else {
			System.out.println("Diferentes");
		}*/
		
		Funcionario jose = new Funcionario();
		jose.setNome("Jose da Silva");
		jose.setIdade(30);
		jose.setSalarioBase(15000d);
		jose.setEstadoCivil(EstadoCivil.CASADO);
		
		
		System.out.printf("Salario Liquido: %f\n", 
				jose.calcSalarioLiquido(27.5d));
		
		Gerente joao = new Gerente();
		joao.setNome("Joao de Souza");
		joao.setIdade(40);
		joao.setSalarioBase(15000d);
		joao.setBonificacao(2000d);
		joao.setEstadoCivil(EstadoCivil.DIVORCIADO);
		
		
		System.out.printf("Salario Liquido: %f\n", 
				joao.calcSalarioLiquido(27.5d));
		
		Funcionario eu = new Gerente();
		eu.setNome("Fulano Estagiario");
		eu.setIdade(20);
		eu.setSalarioBase(1000d);
		
		System.out.printf("Salario Liquido: %f", 
				eu.calcSalarioLiquido(12.5d));
		
		
	}

}
