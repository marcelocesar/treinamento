package com.cursojava;

import java.util.HashSet;
import java.util.Set;

public class TabelaCampeonato {
	
	private Set<Item> itens;
	
	public TabelaCampeonato() {
		itens = new HashSet<Item>();
		itens.add(new Item(new Time("FLA", "Flamengo")));
		itens.add(new Item(new Time("GRE", "Gremio")));
		itens.add(new Item(new Time("INT", "Internacional")));
		itens.add(new Item(new Time("COR", "Corinthias")));
		itens.add(new Item(new Time("CRI", "Criciuma")));
		
		itens.add(new Item(new Time("SAN", "Santos")));
		itens.add(new Item(new Time("FIG", "Figueirense")));
		itens.add(new Item(new Time("ATP", "Atletico Paranaense")));
		itens.add(new Item(new Time("ATM", "Atletico Mineiro")));
		itens.add(new Item(new Time("CRU", "Cruzeiro")));
		
		itens.add(new Item(new Time("SPA", "Sao Paulo")));
		itens.add(new Item(new Time("FLU", "Fluminense")));
		itens.add(new Item(new Time("BOT", "Botafogo")));
		itens.add(new Item(new Time("CRB", "Coritiba")));
		itens.add(new Item(new Time("SPO", "Sport")));
		
		itens.add(new Item(new Time("GOI", "Gois")));
		itens.add(new Item(new Time("PAL", "Palmeiras")));
		itens.add(new Item(new Time("VIT", "Vitoria")));
		itens.add(new Item(new Time("BAH", "Bahia")));
		itens.add(new Item(new Time("CHA", "Chapecoense")));
	}
	

	public void adicionarJogo(Jogo jogo) {
		
	}
	
	public void exibirTabela() {
		System.out.println("Time\t\t\t\tP\tV\tE\tD\tGP\tGC\tSC\n");
		
		for(Item item: itens){
			System.out.printf(
					"%s\t\t\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",
					item.getTime().getNome(),
					item.getPontuacao(),
					item.getVitorias(),
					item.getEmpates(),
					item.getDerrotas(),
					item.getGolsPro(),
					item.getGolsContra(),
					item.getSaldoGols()
			);
		}
	}
}
