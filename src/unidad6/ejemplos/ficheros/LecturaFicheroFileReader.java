package unidad6.ejemplos.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFicheroFileReader {

	public static void main(String[] args) {
		
		
			File fichero = new File("ventas.txt");
			//Nos garantizamos que existe el fichero. Si no hacemos esto debemos usar la Excepción 
			//FileNotFoundException para manejar el caso de error cuando cuando no exista el fichero.
			if(fichero.exists()){
				try {
					
					BufferedReader br = new BufferedReader(new FileReader(fichero));
					String linea;

					while((linea = br.readLine())!=null) {
						System.out.println(linea);
					}
					
					br.close();
				} 
				 catch (IOException e) {
					e.printStackTrace();
				}	
			}else {
				System.out.println("El fichero no existe");
			}
		
	}	

}





