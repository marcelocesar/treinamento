package com.javabasico.figura;

public class Main {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		c1.setRaio(30);
		
/*		System.out.printf("Circulo:\n");
		System.out.printf("Area: %.2f\n", c1.area());
		System.out.printf("Perimentro: %.2f\n", c1.perimetro());
		System.out.printf("\n\n");*/
		
		Retangulo r1 = new Retangulo();
		r1.setBase(3);
		r1.setAltura(2);
		
/*		System.out.printf("Retangulo:\n");
		System.out.printf("Area: %.2f\n", r1.area());
		System.out.printf("Perimentro: %.2f\n", r1.perimetro());
		System.out.printf("\n\n");*/
		
		
		Quadrado q1 = new Quadrado();
		q1.setLado(3);
		
		/*System.out.printf("Quadrado:\n");
		System.out.printf("Area: %.2f\n", q1.area());
		System.out.printf("Perimentro: %.2f\n", q1.perimetro());
		System.out.printf("\n\n");*/
		
		Triangulo t1 = new Triangulo();
		t1.setBase(3);
		t1.setAltura(2);
		
		/*System.out.printf("Triangulo:\n");
		System.out.printf("Area: %.2f\n", t1.area());
		System.out.printf("Perimentro: %.2f\n", t1.perimetro());
		System.out.printf("\n\n");*/
		
		
		Figura[] figuras = new Figura[4];
		
		figuras[0] = c1;
		figuras[1] = r1;
		figuras[2] = q1;
		figuras[3] = t1;
		
		for(Figura f: figuras){
			System.out.printf("Area: %.2f\n", f.area());
			System.out.printf("Perimentro: %.2f\n", f.perimetro());
			System.out.printf("\n\n");
		}
		
		
		
	}

}
