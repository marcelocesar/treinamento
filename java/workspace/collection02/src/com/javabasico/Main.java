package com.javabasico;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		p1.setNome("Pele");
		p1.setIdade(70);
		System.out.printf("%d\n", p1.hashCode());
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Pele");
		p2.setIdade(70);
		System.out.printf("%d\n", p2.hashCode());
		
		Pessoa p3 = new Pessoa();
		p3.setNome("Zico");
		p3.setIdade(60);
		System.out.printf("%d\n", p3.hashCode());
		
		Pessoa p4 = new Pessoa();
		p4.setNome("Maradona");
		p4.setIdade(55);
		System.out.printf("%d\n", p4.hashCode());
		
		
		//Set<Pessoa> set = new HashSet<Pessoa>(); //N�o apresenta na ordem
		//Set<Pessoa> set = new LinkedHashSet<Pessoa>(); //apresenta na ordem
		Set<Pessoa> set = new TreeSet<Pessoa>(new OrdenacaoIdade()); //apresenta na ordem
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set.size());
		
		for(Pessoa p: set){
			System.out.println(p.nome);
		}
		
	}

}