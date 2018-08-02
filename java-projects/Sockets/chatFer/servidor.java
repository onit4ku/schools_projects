package chatFer;

import java.net.*;
import java.io.*;

class servidor
{
	void runServidor () throws IOException
	{
        Socket sc=new Socket (InetAddress.getByName("LocalHost"),5006);
		System.out.println(InetAddress.getLocalHost().toString());
		DataOutputStream flujoS=new DataOutputStream(sc.getOutputStream());
		DataInputStream teclado=new DataInputStream(System.in);

		ServerSocket ss=new ServerSocket (5005);
		Socket s=ss.accept();
		DataInputStream flujoE=new DataInputStream (s.getInputStream());
		byte b,y;
		while (true)
		{

			b=teclado.readByte();
			flujoS.writeByte(b);




			y=flujoE.readByte();
			System.out.print((char)y);



		}
		//flujoE.close();
	}

	public static void main (String args[])throws IOException
	{
		servidor serv=new servidor();
		serv.runServidor();
	}
}