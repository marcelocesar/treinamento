package com.javabasico;

public interface Collection {

	int size();
	
	boolean isEmpty();
	
	void add(Object obj);
	
	void remove(Object obj);
	
	Iterator iterator();
}
