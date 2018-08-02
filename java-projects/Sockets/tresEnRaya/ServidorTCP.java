package tresEnRaya;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {
	// private
	DataInputStream flujoE;
	// private
	DataOutputStream flujoS;

	public ServidorTCP(int puerto) throws IOException {
		ServerSocket ss = new ServerSocket(puerto);
		System.out.println("Esperando un cliente.....");
		Socket s = ss.accept();

		flujoE = new DataInputStream(s.getInputStream());
		flujoS = new DataOutputStream(s.getOutputStream());

	}

	byte Dato() // throws IOException
	{
		byte t = 0;
		try { /// compruebo si cae el cliente
			t = flujoE.readByte();
		} catch (IOException e) {
			System.out.println("el cliente cayo");
		}
		return t;
	}

	void Dato(byte dato) // throws IOException
	{
		try { /// compruebo si cae el cliente
			flujoS.writeByte(dato);
		} catch (IOException e) {
			System.out.println("el cliente cayo");
		}
	}

	boolean Hay_Dato() throws IOException {
		boolean fin = false;
		if (flujoE.available() != 0)
			fin = true;
		return fin;
	}
}