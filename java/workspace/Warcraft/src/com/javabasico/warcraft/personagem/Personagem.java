package com.javabasico.warcraft.personagem;

import com.javabasico.warcraft.Ponto;
import com.javabasico.warcraft.Reino;
import com.javabasico.warcraft.classe.Classe;
import com.javabasico.warcraft.raca.Raca;

public abstract class Personagem {
	
	private String nome;
	private float altura;
	private float peso;
	private int pontosVida;
	private int percepcao;
	Raca raca;
	Reino reino;
	Ponto ponto;
	//Classe classe;
	
	public Personagem(Reino reino, Raca raca) {
		setPontosVida(raca.getSaude());
		this.reino = reino;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public Raca getRaca() {
		return raca;
	}
	
	public void setRaca(Raca raca) {
		this.raca = raca;
	}
	
	public Reino getReino() {
		return reino;
	}
	
	public void setReino(Reino reino) {
		this.reino = reino;
	}
	
/*	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}*/
	
	public Ponto getPonto() {
		return ponto;
	}

	public void setPonto(Ponto ponto) {
		this.ponto = ponto;
	}

	public int getPontosVida() {
		return pontosVida;
	}

	public void setPontosVida(int pontosVida) {
		this.pontosVida = pontosVida;
	}

	public int getPercepcao() {
		return percepcao;
	}

	public void setPercepcao(int percepcao) {
		this.percepcao = percepcao;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + "\n" +
				"Altura: " + getAltura() + "\n" +
				"Peso: " + getPeso() + "\n" +
				"Raca: " + raca.getNome() + "\n" + 
				"Reino: " + reino.getNome() + "\n" + 
				/*"Classe: " + classe.getNome() + "\n" + */
				"Forca: " + raca.getForca() +  "\n" +
				"Destreza: " + raca.getDestreza() + "\n" +
				"Inteligencia: " + raca.getInteligencia() +  "\n" +
				"Saude: " + raca.getSaude();
	}
	
}
