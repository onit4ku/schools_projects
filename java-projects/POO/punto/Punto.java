package punto;

public class Punto {

	private float x;
	private float y;

	public Punto() {
		x=0;
		y=0;
	}

	public Punto(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float f) {
		this.x = f;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
}