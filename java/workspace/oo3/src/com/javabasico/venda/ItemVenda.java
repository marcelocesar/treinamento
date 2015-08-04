package com.javabasico.venda;

public class ItemVenda {

	private Produto produto;
	private Integer quantidade;

	public Double getValor() {
		return produto.getValorUnitario()*getQuantidade();
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
