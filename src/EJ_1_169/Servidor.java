package EJ_1_169;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {
		int puerto = 4449;
		ServerSocket server = new ServerSocket(puerto);
		System.out.println("Escuchando en puerto: "+server.getLocalPort()+" ...");
		Socket cliente1= server.accept();
		char aux;
		String cadena ;
		int caracteres;
		do {
		//Entrada del cliente
		InputStream ent = null;
		ent = cliente1.getInputStream();
		DataInputStream dis = new DataInputStream(ent);
		cadena = dis.readUTF();
		
		caracteres=0;
		
			//Leemos los caracteres
		for (int i = 0; i < cadena.length(); i++) {
			 aux = cadena.charAt(i);
			if(aux=='*') {
				System.out.println("Asterisco recibido, Saliendo...");
				break;
			}else {
				caracteres++;
			}
			
		}
		//Mensaje al cliente
		OutputStream sal= cliente1.getOutputStream();
		DataOutputStream fs = new DataOutputStream(sal);
		fs.writeUTF("Numero de caracteres recibido:"+caracteres);
		}while(cadena.equalsIgnoreCase("*")==false);
	}

}
