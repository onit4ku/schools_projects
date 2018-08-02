package figuras;


public class Figura {

  private int color;
  private boolean relleno;

  public Figura() {
    color=Color.ROJO;
    relleno=false;
  }

  public String toString()
  {
    return "Esto es una figura";
  }

  public void CambiaColor(int color)
  {
    this.color=color;
  }

  public int Color()
  {
    return color;
  }


}