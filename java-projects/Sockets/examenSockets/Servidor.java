package examenSockets;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		DataOutputStream flujoS;
		DataInputStream flujoE;
		ServerSocket ss;

		int suma = 0;

		try {
			ss = new ServerSocket(5006);
			Socket sc = ss.accept();

			flujoS = new DataOutputStream(sc.getOutputStream());
			flujoE = new DataInputStream(sc.getInputStream());

			int tam = flujoE.readInt();
			for (int i = 0; i < tam; i++) {
				suma += flujoE.readInt();
			}
			
		flujoS.writeInt(suma);

		} catch (IOException e) {
			System.out.println("Buscando servidor.....");
		}
	}
}