package figuras;


public class Punto {
  private int x;
  private int y;

  // constructor 1
  public Punto() {
    x=0;
    y=0;
  }

  // constructor 2
  public Punto(int x,int y) {
    this.x=x;
    this.y=y;
  }

  public String toString()
  {
      return "x: "+x+" y: "+y;
  }
}