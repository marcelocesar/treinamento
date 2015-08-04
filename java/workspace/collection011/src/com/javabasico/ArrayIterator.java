package com.javabasico;

public class ArrayIterator implements Iterator {

	private Object[] array;
	private int atual;
	private int quantidadeElementos;
	
	public ArrayIterator(
			Object[] array, 
			int quantidadeElementos) {
		this.array = array;
		this.quantidadeElementos = quantidadeElementos;
	}
	
	@Override
	public boolean hasNext() {
		return atual < quantidadeElementos;
	}

	@Override
	public Object next() {
		return array[atual++];
	}
}
