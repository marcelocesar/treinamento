package com.cursojava;

public class Item {

	private Time time;
	private int vitorias;
	private int derrotas;
	private int empates;
	private int golsContra;
	private int golsPro;
	
	public int getPontuacao() {
		return getVitorias()*3+getEmpates();
	}
	public int getSaldoGols() {
		return getGolsPro()-getGolsContra();
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public int getGolsContra() {
		return golsContra;
	}
	public void setGolsContra(int golsContra) {
		this.golsContra = golsContra;
	}
	public int getGolsPro() {
		return golsPro;
	}
	public void setGolsPro(int golsPro) {
		this.golsPro = golsPro;
	}
}
