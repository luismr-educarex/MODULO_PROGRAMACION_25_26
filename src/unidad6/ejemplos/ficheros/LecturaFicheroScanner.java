package unidad6.ejemplos.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaFicheroScanner {

	public static void main(String[] args) {
		
			try {
				Scanner entrada = new Scanner(new File("ventas.text"));
				
				while(entrada.hasNextLine()) {
					String linea = entrada.nextLine();
					System.out.println(linea);
				}
				
				entrada.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		
	}

}
