package curso.javabasico.figura;

public class Ponto implements Cloneable {

	private float x;
	private float y;

	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Ponto) {
			Ponto p = (Ponto) obj;
			
			return getX() == p.getX()
					&& getY() == p.getY();
		}
		
		return false;
	}
	
	@Override
	public Ponto clone() {
		try {
			return (Ponto) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
