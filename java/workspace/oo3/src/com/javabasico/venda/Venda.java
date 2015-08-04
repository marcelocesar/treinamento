package com.javabasico.venda;

import com.javabasico.comum.Cliente;

public class Venda {

	private Cliente cliente;
	private ItemVenda[] itens;
	private int quantidade;
	
	public Venda() {
		itens = new ItemVenda[1000];
		quantidade = 0;
	}
	
	public Double getTotal() {
		Double total = 0.0;
		
		for (int i = 0; i < quantidade; i++) {
			total += itens[i].getValor();
		}
		
		return total;
	}
	
	public void adicionarProduto(
			Produto produto, 
			Integer quantidade) {
		ItemVenda item = new ItemVenda();
		item.setProduto(produto);
		item.setQuantidade(quantidade);
		
		itens[this.quantidade++] = item;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ItemVenda[] getItens() {
		return itens;
	}
	public void setItens(ItemVenda[] itens) {
		this.itens = itens;
	}
}
