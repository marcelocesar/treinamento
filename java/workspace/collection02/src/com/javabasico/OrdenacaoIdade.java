package com.javabasico;

import java.util.Comparator;

public class OrdenacaoIdade implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		int ret =  p1.getIdade()-p2.getIdade();
		if(ret == 0){
			return p1.compareTo(p2);
		}
		
		return ret;
	}
}
