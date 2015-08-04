package com.javabasico.warcraft;

import com.javabasico.warcraft.classe.Classe;
import com.javabasico.warcraft.personagem.Personagem;
import com.javabasico.warcraft.raca.Elfo;
import com.javabasico.warcraft.raca.Orc;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Elfo elfo = new Elfo();
		Orc orc = new Orc();
		Orc orcBoss = new Orc("Ogro", 22, 14, 9, 15);
		Reino floresta = new Reino("Elfos da Floresta");
		Reino montanha = new Reino("Orcs das Montanhas do sul");
		Classe barbaro = new Classe();
		
		
		Mapa mapa = new Mapa();
		mapa.adicionar(new Operario());
		
		
/*		Personagem p1 = new Personagem();
		p1.setNome("Legolas");
		p1.setAltura(170);
		p1.setPeso(80);
		p1.setRaca(elfo);
		p1.setReino(floresta);
		p1.setClasse(barbaro);
		
		Personagem p2 = new Personagem();
		p2.setNome("Sanguinus");
		p2.setAltura(190);
		p2.setPeso(120);
		p2.setRaca(orc);
		p2.setReino(montanha);
		p2.setClasse(barbaro);
		
		Personagem ogro = new Personagem();
		ogro.setNome("FulBolg");
		ogro.setAltura(204);
		ogro.setPeso(153);
		ogro.setRaca(orcBoss);
		ogro.setReino(montanha);
		ogro.setClasse(barbaro);*/
		
		System.out.println(p1 + "\n");
		System.out.println(p2 + "\n");
		System.out.println(ogro);
		
	}

}
