package chatFer;

import java.net.*;
import java.io.*;

class chat
{
	void runCliente () throws IOException
	{
        ServerSocket ss=new ServerSocket (5006);
		Socket s=ss.accept();
		DataInputStream flujoE=new DataInputStream (s.getInputStream());


		Socket sc=new Socket (InetAddress.getByName("LocalHost"),5005);
		System.out.println(InetAddress.getLocalHost().toString());
		DataOutputStream flujoS=new DataOutputStream(sc.getOutputStream());
		DataInputStream teclado=new DataInputStream(System.in);

		byte b,y;
		while (true)
		{
			b=teclado.readByte();
			flujoS.writeByte(b);


			y=flujoE.readByte();
			System.out.print((char)y);
		}
		//teclado.close();
		//flujoS.close();
	}
	public static void main (String args[]) throws IOException
	{
		chat c=new chat();
		c.runCliente();
	}
}