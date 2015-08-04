package curso.javabasico.figura;

public class TrianguloRetangulo extends Retangulo {

	@Override
	public float area() {
		return super.area()/2;
	}
	
	@Override
	public float perimetro() {
		return getBase()+getAltura()+getHipotenusa();
	}

	private float getHipotenusa() {
		return (float) Math.sqrt(
				Math.pow(getBase(), 2)
				+ Math.pow(getAltura(), 2));
	}
}
