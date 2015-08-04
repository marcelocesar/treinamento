package curso.javabasico.figura;

public class Main4 {

	public static void main(String[] args) {
		Ponto p1 = new Ponto();
		p1.setX(1);
		p1.setY(2);
		
		/*Ponto p2 = new Ponto();
		p2.setX(p1.getX());
		p2.setY(p1.getY());*/
		
		Ponto p2 = p1.clone();
		
		System.out.println(p2);
		
		Circulo c1 = new Circulo();
		c1.setPonto(p2);
		c1.setRaio(10);
		
		System.out.println(c1);
		
		Circulo c2 = c1.clone();
		c2.setRaio(12);
		System.out.println(c2);
		
		c2.getPonto().setX(10);
		System.out.println(c1);
	}
}
