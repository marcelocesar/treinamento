package curso.javabasico.figura;

public class Main2 {

	public static void main(String[] args) {
		Ponto p1 = new Ponto();
		p1.setX(1);
		p1.setY(0);
		
		System.out.println(p1);
		
		Circulo c1 = new Circulo();
		c1.setPonto(p1);
		c1.setRaio(3);
		
		System.out.println(c1);
		
		Retangulo r1 = new Retangulo();
		r1.setPonto(p1);
		r1.setAltura(1);
		r1.setBase(2);
		
		System.out.println(r1);
		
		Quadrado q1 = new Quadrado();
		q1.setPonto(p1);
		q1.setLado(3);
		
		System.out.println(q1);
	}

}
