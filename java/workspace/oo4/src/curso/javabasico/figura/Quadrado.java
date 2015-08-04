package curso.javabasico.figura;

public class Quadrado extends Retangulo {

	public void setLado(float lado) {
		setBase(lado);
		setAltura(lado);
	}
	
	@Override
	public String toString() {
		return getPonto() + " - lado: " + getAltura();
	}
}
