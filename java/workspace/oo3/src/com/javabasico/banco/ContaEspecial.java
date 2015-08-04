package com.javabasico.banco;

public class ContaEspecial extends Conta {

	private Double limite;

	@Override
	public boolean retirar(Double valor) {
		Double valorDisponivel = getValorDisponivel();
		
		if (valor <= valorDisponivel) {
			setSaldo(valorDisponivel-valor);
			return true;
		} else {
			return false;
		}
	}
	
	public Double getValorDisponivel() {
		return getSaldo()+getLimite();
	}
	
	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	
}
