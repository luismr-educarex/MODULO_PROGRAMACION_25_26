package unidad6.ejemplos.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFichero {

	public static void main(String[] args) {
		
		
			File fichero = new File("ventas.txt");
			FileReader fd;
			try {
				fd = new FileReader(fichero);
				BufferedReader br = new BufferedReader(fd);
				
				String linea;

				while((linea = br.readLine())!=null) {
					System.out.println(linea);
				}
						
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			 catch (IOException e) {
				e.printStackTrace();
			}
			 
			
			
	}	

}





