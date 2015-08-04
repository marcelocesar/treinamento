package com.javabasico;

public class Gerente extends Funcionario {

	private Double bonificacao;

	public Double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Double bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	@Override
	public Double calcSalarioLiquido(Double percImposto) {
		return super.calcSalarioLiquido(percImposto)+getBonificacao();
	}
}
