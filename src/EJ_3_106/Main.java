package EJ_3_106;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File Fichero1 = new File("Prueba.txt");
		File Fichero2= new File("Fichero2.txt");
		FileReader f;
		Hilo hilo;
		int carac;
		String cadena;
		File texto[]= {Fichero1,Fichero2};
		long comienzo,fin,total;
		for(int i=0; i<texto.length; i++) {
			comienzo = System.currentTimeMillis();
			carac=0;
			f = new FileReader(texto[i]);
			//BufferedReader b = new BufferedReader(f);
			hilo = new Hilo();
			hilo.start();
			/* while((cadena = b.readLine())!=null) {
		         carac=cadena.length();
		      }*/
			 fin = System.currentTimeMillis();
			 System.out.println("Numero de caracteres: "+ hilo.ContarCaracteres(f));
			 total=fin-comienzo;
			 System.out.println("Este proceso ha tardado: "+total+" miliseg");
		}
	}

}
