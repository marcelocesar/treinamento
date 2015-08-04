package com.javabasico;

public class LinkedListColl implements Collection {

	private Info first;
	private Info last;
	private int quantidade; 
	
	@Override
	public int size() {
		return quantidade;
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public void add(Object obj) {
		Info info = new Info(obj);
		
		if (first == null) {
			first = info;
			last = info;
		} else {
			last.setNext(info);
			last = info;
		}
		
		info.setNext(null);
		
		quantidade++;
	}

	@Override
	public void remove(Object obj) {
		if (!isEmpty()) {
			Info anterior = null; 
			Info atual = first;
			
			while (atual != null) {
				if (atual.getObj().equals(obj)) {
					break;
				}
				anterior = atual;
				atual = atual.getNext();
			}
			
			if (atual == first) {
				first = atual.getNext();
			}
			if (anterior != null) {
				anterior.setNext(atual.getNext());
			}
			
			if (atual == last) {
				last = anterior;
			}
			quantidade--;
		}
	}

	@Override
	public Iterator iterator() {
		return new LinkedListIterator(first);
	}
}

class Info {
	
	private Object obj;
	private Info next;
	
	public Info(Object obj) {
		setObj(obj);
	}
	
	public Info(Object obj, Info next) {
		setObj(obj);
		setNext(next);
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Info getNext() {
		return next;
	}

	public void setNext(Info next) {
		this.next = next;
	}
}
