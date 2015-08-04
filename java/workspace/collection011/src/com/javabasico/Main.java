package com.javabasico;

public class Main {

	public static void main(String[] args) {
		Collection coll = new LinkedListColl();
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Xuxa");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Pele");
		
		Pessoa p3 = new Pessoa();
		p3.setNome("Zico");
		
		coll.add(p1);
		coll.add(p2);
		coll.add(p3);
		
		/*coll.remove(p1);
		coll.remove(p2);
		coll.remove(p3);*/
		
		if (!coll.isEmpty()) {
			System.out.printf("Tamanho: %d\n", coll.size());
		}
		
		Iterator it = coll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
