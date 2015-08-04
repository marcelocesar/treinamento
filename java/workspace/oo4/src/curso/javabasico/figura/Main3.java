package curso.javabasico.figura;

public class Main3 {

	public static void main(String[] args) {
		Ponto p1, p2;
		
		p1 = new Ponto();
		p1.setX(10);
		p1.setY(20);
		
		p2 = new Ponto();
		p2.setX(10);
		p2.setY(20);
		
		/*p2 = p1;
		
		p1.setX(0);
		p2.setX(2);
		
		System.out.println(p1.getX());*/
		
		if (p1 == p2) {
			System.out.println("Referencias Iguais");
		} else {
			System.out.println("Referencias Diferentes");
		}
		
		if (p1.equals(p2)) {
			System.out.println("Conceitualmente Iguais");
		} else {
			System.out.println("Conceitualmente Diferentes");
		}
	}

}
