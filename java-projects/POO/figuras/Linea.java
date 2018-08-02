package figuras;


public class Linea extends Figura {

  Punto P1;
  Punto P2;

  public Linea(Punto p1,Punto p2) {
    P1=p1;
    P2=p2;
  }

  public Linea(int x1,int y1,int x2,int y2)
  {
    P1=new Punto(x1,y1);
    P2=new Punto(x2,y2);
  }

  public String toString()
  {
      return "Esto es una linea: "+P1.toString()+" "+P2.toString();
  }

}