package EJ_3_106;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Hilo extends Thread{
	
	
	
	public int ContarCaracteres(FileReader f) throws IOException {
		BufferedReader b = new BufferedReader(f);
		String cadena;
		int carac=0;
		 while((cadena = b.readLine())!=null) {
	         carac=cadena.length();
	      }
		return carac;
	}
}
