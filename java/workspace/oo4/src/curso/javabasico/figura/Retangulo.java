package curso.javabasico.figura;

public class Retangulo extends FiguraAbstrata {

	private float base;
	private float altura;
	
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public float area() {
		return getBase()*getAltura();
	}
	@Override
	public float perimetro() {
		return 2*(getBase()+getAltura());
	}
	
	@Override
	public String toString() {
		return getPonto() 
				+ " - base: " + getBase() 
				+ ", altura: " + getAltura();
	}
}
