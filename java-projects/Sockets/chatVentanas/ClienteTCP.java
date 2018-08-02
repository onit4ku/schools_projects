package chatVentanas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;

public class ClienteTCP {
	private DataOutputStream flujoS;
	private DataInputStream flujoE;

	public ClienteTCP(String NombreMaquina, int puerto) throws IOException {
		Socket sc = null;
		boolean buscando = true;
		while (buscando) {
			try {
				sc = new Socket(InetAddress.getByName(NombreMaquina), puerto);

				buscando = false;
				flujoS = new DataOutputStream(sc.getOutputStream());
				flujoE = new DataInputStream(sc.getInputStream());

			} catch (ConnectException e) {
				System.out.println("Buscando servidor.....");
			}
		}
	}

	void Dato(byte dato) throws IOException {
		flujoS.writeByte(dato);
	}

	byte Dato() throws IOException {
		return flujoE.readByte();
	}

	String RecibirString() throws IOException {
		return flujoE.readUTF();
	}

	void EnviarString(String dato) throws IOException {
		flujoS.writeUTF(dato);
	}

	boolean Hay_Dato() throws IOException {
		boolean fin = false;
		if (flujoE.available() != 0)
			fin = true;
		return fin;
	}
}