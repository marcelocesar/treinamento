package com.cursojava;

public class Time {

	private String codigo;
	private String nome;
	
	public Time(String codigo, String nome) {
		setCodigo(codigo);
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Time){
			Time outro = (Time) obj;
			
			return getCodigo().equals(outro.getCodigo());
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		if(getCodigo() != null){
			return getCodigo().hashCode();
		}
		
		return super.hashCode();
	}
}