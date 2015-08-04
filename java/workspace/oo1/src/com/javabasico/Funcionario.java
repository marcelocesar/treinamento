package com.javabasico;

public class Funcionario extends Pessoa {

	private String matricula;
	private Double salarioBase;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public Double calcSalarioLiquido(Double percImposto) {
		return getSalarioBase()*(1-percImposto/100);
	}
	
	
	
	
}
