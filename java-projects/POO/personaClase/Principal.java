//package personaClase;
//
//import java.util.Scanner;
//import java.util.Vector;
//
//public class Principal {
//
//	public static void main(String[] args) {
//
////		Scanner sc = new Scanner(System.in);
////		System.out.print("Introduce numero de personas: ");
////		int num = sc.nextInt();
////		sc.nextLine();
//		
////		int Edad =0;
////		boolean repetir = false;
////		Persona[] vPersona = new Persona[num];
////
////		for (int i = 0; i < vPersona.length; i++) {
////			System.out.print("Introduce el Nombre: ");
////			String Nombre = sc.nextLine();
////
////			System.out.print("Introduce el Apellido: ");
////			String Apellido = sc.nextLine();
////
////			System.out.print("Introduce el 2º Apellido: ");
////			String Apellido2 = sc.nextLine();
////			System.out.print("Introduce la Edad: ");
////			try {
////				Edad = sc.nextInt();
////
////			} catch (Exception e) {
////				repetir = true;
////			}
////
////			while (repetir == true) {
////				System.out.print("Introduce de nuevo la Edad: ");
////				 Edad = sc.nextInt();
////			}
////			sc.nextLine();
////			vPersona[i] = new Persona(Nombre, Apellido, Apellido2, Edad);
////
////			System.out.println();
////		}
//
//		// Impresion del vector
//
////		for (int n = 0; n < vPersona.length; n++) {
////			System.out.println(vPersona[n]);
////		}
//
//		Fecha lfecha= new Fecha();
//		lfecha.CambiarFecha(23,9,1973);
//		System.out.println(lfecha);
//		
////		Vectores de objetos
////	Vector v=new Vector();		
////		
////		Fecha f2=new Fecha();
////		f2.cambiarfecha(23, 9, 1973);
////		
////		for (int i=0; i < 5; i++){
////			Fecha f1=new Fecha();
////			v.addElement(f1);
////		}
////		((Fecha)v.elementAt(3)).cambiardia(20);
////		
////		System.out.println(v);	
////		
//		int num=7;
//		ArrayFecha kk=new ArrayFecha(num);
//		
//		for (int i=0; i < kk.lenght; i++){
//			Fecha f1=new Fecha();
//			f1.CambiarFecha(23, 9, 1973);
//			kk.inserta(f1);
//			System.out.println(kk.DarFecha(i));
//		}
//	}
//}
