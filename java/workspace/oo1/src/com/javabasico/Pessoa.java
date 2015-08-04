package com.javabasico;

public abstract class Pessoa {

	//Atributos (caracteristicas)
	String nome;
	private int idade;
	private boolean acordada;
	private EstadoCivil estadoCivil;
	
	//Metodos (comportamentos)
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if (idade >= 0 && idade <= 150) {
			this.idade = idade;
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAcordada() {
		return acordada;
	}

	public void acordar() {
		acordada = true;
	}
	
	public void dormir() {
		acordada = false;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}
