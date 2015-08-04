package com.javabasico.warcraft.raca;

public abstract class Raca {
	
	private String nome;
	private int forca;
	private int inteligencia;
	private int destreza;
	private int saude;
	
	public Raca(){
		setNome("Humano");
		setForca(100);
		setDestreza(100);
		setInteligencia(100);
		setSaude(100);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getDestreza() {
		return destreza;
	}
	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}
	public int getSaude() {
		return saude;
	}
	public void setSaude(int saude) {
		this.saude = saude;
	}
	
}
