package com.javabasico;

public class ArrayColl implements Collection {

	private Object[] array;
	private int quantidade;
	
	public ArrayColl() {
		array = new Object[2];
	}
	
	@Override
	public int size() {
		return quantidade;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void add(Object obj) {
		if (quantidade == array.length) {
			reestruturarArrayInterno();
		}
		array[quantidade++] = obj;
	}

	private void reestruturarArrayInterno() {
		Object[] novoArray = new Object[array.length*2];
		for (int i = 0; i < quantidade; i++) {
			novoArray[i] = array[i];
		}
		
		array = novoArray;
	}

	@Override
	public void remove(Object obj) {
		for (int i = 0; i < quantidade; i++) {
			if (array[i].equals(obj)) {
				for (int j = i; j < (quantidade-1); j++) {
					array[j] = array[j+1];
				}
			}
		}
		quantidade--;
	}

	@Override
	public Iterator iterator() {
		return new ArrayIterator(array, quantidade);
	}
}
