package com.javabasico;

public class LinkedListIterator implements Iterator {

	private Info atual;
	
	public LinkedListIterator(Info first) {
		this.atual = first;
	}
	
	@Override
	public boolean hasNext() {
		return atual != null;
	}

	@Override
	public Object next() {
		Object ret = atual.getObj();
		atual = atual.getNext();
		
		return ret;
	}

}
