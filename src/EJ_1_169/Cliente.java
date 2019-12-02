package EJ_1_169;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Salieri ex = new Salieri();
		String host = "localhost";
		int puerto = 4449;
		Socket cliente = new Socket(host,puerto);
		
		DataOutputStream fs = new DataOutputStream(cliente.getOutputStream());
		DataInputStream in = new DataInputStream(cliente.getInputStream());
		String cadena ;
		do {
			cadena = ex.controlaString();
			fs.writeUTF(cadena);
			System.out.println(in.readUTF());
		}while(cadena.equalsIgnoreCase("*")==false);
		System.out.println("Finalizando...");
		fs.close();
		in.close();
		cliente.close();
	}

}
