package com.javabasico.warcraft;

import com.javabasico.warcraft.personagem.Personagem;

public class Mapa {
	
	private Personagem[] personagens;
	
	private int quantidadePersonagem;
	
	public void adicionar(Personagem personagem){
		personagens[quantidadePersonagem++] = personagem;
	}
	
	public int getQuantidadePersonagens(){
		return quantidadePersonagem;
	}
	
}
