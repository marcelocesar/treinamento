package curso.javabasico.figura;

public abstract class FiguraAbstrata 
	implements Figura {

	protected Ponto ponto;

	public Ponto getPonto() {
		return ponto;
	}

	public void setPonto(Ponto ponto) {
		this.ponto = ponto;
	}
}
