package examenSockets;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	static DataInputStream flujoE;
	static DataOutputStream flujoS;

	public static int num1;
	public static int num2;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Socket sc;

		try {
			sc = new Socket(InetAddress.getByName("localhost"), 5006);
			flujoE = new DataInputStream(sc.getInputStream());
			flujoS = new DataOutputStream(sc.getOutputStream());

			System.out.println("Introduce primer numero a sumar: ");
			num1 = scanner.nextInt();
			System.out.println("Introduce segundo numero a sumar: ");
			num2 = scanner.nextInt();

			int nums[] = { num1, num2 };

			flujoS.writeInt(nums.length);

			for (int i = 0; i < nums.length; i++) {
				flujoS.writeInt(nums[i]);
			}

			System.out.println("El resultado de la suma del servidor es: "+flujoE.readInt());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}