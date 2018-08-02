package envioSockets;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataOutputStream flujoS;
		DataInputStream flujoE;
		ServerSocket ss;
		char v[] = { 'h', 'o', 'l', 'a' };
		try {
			ss = new ServerSocket(5006);
			Socket sc = ss.accept();
			flujoS = new DataOutputStream(sc.getOutputStream());
			flujoE = new DataInputStream(sc.getInputStream());
			flujoS.writeInt(v.length);

			for (int i = 0; i < v.length; i++) {
				flujoS.writeChar(v[i]);
			}
			
			

		} catch (IOException e) {
			System.out.println("Buscando servidor.....");

		}

	}

}
