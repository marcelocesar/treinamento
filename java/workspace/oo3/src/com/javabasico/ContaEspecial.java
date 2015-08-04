package com.javabasico;

public class ContaEspecial extends Conta {
	
	private Double limite;

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean retirar(Double valor) {
		// TODO Auto-generated method stub
		return super.retirar(valor);
	}
	
	@Override
	public boolean transferir(Conta destino, Double valor) {
		// TODO Auto-generated method stub
		return super.transferir(destino, valor);
	}

}
