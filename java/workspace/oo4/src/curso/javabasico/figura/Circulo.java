package curso.javabasico.figura;

public class Circulo 
	extends FiguraAbstrata  
	implements Cloneable {

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

	@Override
	public String toString() {
		return getPonto() + " - raio: " + getRaio();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circulo) {
			Circulo c = (Circulo) obj;
			
			return getPonto().equals(c.getPonto())
					&& getRaio() == c.getRaio();
		}
		
		return false;
	}
	
	@Override
	public Circulo clone() {
		try {
			Circulo clone = (Circulo) super.clone();
			Ponto pClone = getPonto().clone();
			clone.setPonto(pClone);
			
			return clone;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
