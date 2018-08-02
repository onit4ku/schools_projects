package envioSockets;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	static DataInputStream flujoE;
	static DataOutputStream flujoS;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socket sc;
		try {
			sc = new Socket(InetAddress.getByName("localhost"), 5006);
			flujoE = new DataInputStream(sc.getInputStream());
			flujoS = new DataOutputStream(sc.getOutputStream());
			int tam = flujoE.readInt();
			for (int i = 0; i < tam; i++) {
				char c = flujoE.readChar();
				System.out.println(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
