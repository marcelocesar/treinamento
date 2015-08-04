package com.javabasico;

public class Conta {
	
	private String numero;
	private Cliente cliente;
	private Agencia agencia;
	private Double saldo;
	
	
	public void depositar(Double valor){
		setSaldo(getSaldo() + valor);
	}
	
	public boolean retirar(Double valor){
		if(valor <= saldo){
			setSaldo(saldo - valor);
			return true;
		} else{
			return false;
		}
	}
	
	public boolean transferir(Conta destino, Double valor){
		if(retirar(valor)){
			destino.depositar(valor);
			return true;
		} else{
			return false;
		}
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
