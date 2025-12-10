package unidad4.ejemplos;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		Vehiculo vehiculo1 = new Vehiculo();
		
		
		String matricula = "GDC-9090";
		if(validarMatricula(matricula)) {
			vehiculo1.setMarca("Renault");
			vehiculo1.setModelo("CLIO");
			vehiculo1.setMatricula(matricula);
			vehiculo1.setAnioFabricacion(2006);
		}
		
		
		
		
		
		Vehiculo vehiculo2 = new Vehiculo("Ford","Modeo","FSS-3454",2014);
		
		System.out.println(vehiculo1);

		vehiculo2.mostrarInformacion();

		
		
		

	}

	private static boolean validarMatricula(String matricula) {
		
		return false;
	}

}














