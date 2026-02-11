package unidad6.ejemplos.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFichero {

	public static void main(String[] args) {
		
			  try {
					//obtener el buffer a partir del lector
					BufferedReader br = new BufferedReader(new FileReader("ventas.txt"));
					String linea;
					//mientras no llevamos a una línea que sea null. 
					while((linea = br.readLine())!=null) {
						System.out.println(linea);
					}
					
					br.close(); 
				} 
				catch(FileNotFoundException e){
					System.out.println("Fichero no existe");
				}
				catch (IOException e) {
					System.out.println("Error en la lectura del fichero");
				}	
			
		
	}	

}





