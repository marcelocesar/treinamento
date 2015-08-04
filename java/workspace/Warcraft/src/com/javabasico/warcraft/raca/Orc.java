package com.javabasico.warcraft.raca;

public class Orc extends Raca {

	public Orc(){
		setNome("Orc");
		setForca(160);
		setDestreza(140);
		setInteligencia(100);
		setSaude(150);
	}
	
	public Orc(String nome, int st, int dx, int iq, int ht){
		setNome(nome);
		setForca(st);
		setDestreza(dx);
		setInteligencia(iq);
		setSaude(ht);
	}
	
}
