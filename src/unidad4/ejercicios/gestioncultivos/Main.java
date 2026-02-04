package unidad4.ejercicios.gestioncultivos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		// Comunicación entre objetos
		CampoAgricola campo = new CampoAgricola();
		
		int opcion=0;
		do {
			System.out.println("-----Gestión Agrícola ------");
			System.out.println("1.Registrar cultivo");
			System.out.println("2.Obtener informes");
			System.out.println("0.Salir");
			opcion = teclado.nextInt();
			
			switch (opcion) {
				case 1: 
					registrarCultivo();
				break;	
				case 2:
					obtenerInformes();
				break;
				case 0:
					salir();
				break;
				default:
				System.out.println("Opción no válida del menú");
			}
			
		}while(opcion!=0);
		
		
		//  Entrada de datos del cultivo 1
		System.out.println("Introduce datos del primer cultivo");
		System.out.println("Tipo");
		String nombre1 = teclado.nextLine();
		System.out.println("Superficie(ha):");
		double superficie1=teclado.nextDouble();
		System.out.println("Producción(kg):");
		double produccion1=teclado.nextDouble();
		System.out.println("Precio por Kg(€):");
		double precio1=teclado.nextDouble();
		teclado.nextLine(); //limpiar buffer	
		Cultivo cultivo = new Cultivo(nombre1, superficie1, produccion1, precio1);

		campo.registrarCultivo(cultivo);
		
		InformeCultivo informe = new InformeCultivo();
		informe.mostrarInfome(cultivo);
	
		
		Cultivo mejorCultivo = campo.obtenerMasRentablePorHa();
		
		informe.mostrarComparacion(mejorCultivo);

	}

}








