package com.javabasico.figura;

public class Circulo extends Figura {
	
	private float raio;

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	@Override
	public float area() {
		return (float) Math.PI*getRaio()*getRaio();
	}

	@Override
	public float perimetro() {
		return (float) (2*Math.PI*getRaio());
	}
}
