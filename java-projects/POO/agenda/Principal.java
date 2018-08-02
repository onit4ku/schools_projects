package agenda;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		
	/*	Fecha f1=new Fecha();
		
		f1.CambiarFecha(10, 2, 2000);
		
		Fecha f2=f1;	
		f1.CambiarDia(23);
	*/
		
	/*	
		Fecha v[]=new Fecha[3];
		
		v[0]=new Fecha();
		v[2]=v[0];
		
		System.out.println(v[0]);	
	
		System.out.println(v[2]);	
		
		*/
		
		Vector v=new Vector();		
		
		Fecha f2=new Fecha();
		f2.CambiarFecha(23, 9, 1973);
		
		for (int i=0; i < 5; i++){
			Fecha f1=new Fecha();
			v.addElement(f1);
		}
		((Fecha)v.elementAt(3)).CambiarDia(20);
		
		System.out.println(v);	
		
		
	}

}
