package com.javabasico.warcraft.raca;

public class Elfo extends Raca {

	public Elfo(){
		setNome("Elfo");
		setForca(100);
		setDestreza(160);
		setInteligencia(170);
		setSaude(100);
	}
	
	public Elfo(String nome, int st, int dx, int iq, int ht){
		setNome(nome);
		setForca(st);
		setDestreza(dx);
		setInteligencia(iq);
		setSaude(ht);
	}

}
