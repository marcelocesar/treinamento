package com.javabasico.venda;

import com.javabasico.comum.Cliente;

public class Main {

	public static void main(String[] args) {
		Produto azeite = new Produto();
		azeite.setCodigo("123123");
		azeite.setDescricao("Azeite Italia");
		azeite.setValorUnitario(8.0);
		
		Produto chips = new Produto();
		chips.setCodigo("895623");
		chips.setDescricao("Elma Chips 500g");
		chips.setValorUnitario(10.0);
		
		Cliente gordo = new Cliente();
		gordo.setNome("Fulaninho");
		
		Venda venda = new Venda();
		venda.adicionarProduto(azeite, 2);
		venda.adicionarProduto(chips, 1);
		
		System.out.printf("Total Venda: %.2f\n", 
				venda.getTotal());
	}
}
