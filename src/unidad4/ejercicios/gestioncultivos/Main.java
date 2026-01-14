package unidad4.ejercicios.gestioncultivos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
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
		
		Cultivo cultivo1 = new Cultivo(nombre1, superficie1, produccion1, precio1);
		
		
	   //Entrada de datos del cultivo 2
		System.out.println("Introduce datos del segundo cultivo");
		System.out.println("Tipo");
		String nombre2 = teclado.nextLine();
		System.out.println("Superficie(ha):");
		double superficie2=teclado.nextDouble();
		System.out.println("Producción(kg):");
		double produccion2=teclado.nextDouble();
		System.out.println("Precio por Kg(€):");
		double precio2=teclado.nextDouble();
		
		teclado.nextLine(); //limpiar buffer
		
		Cultivo cultivo2 = new Cultivo(nombre2, superficie2, produccion2, precio2);
		
		
		// Comunicación entre objetos
		CampoAgricola campo = new CampoAgricola();
		campo.registrarCultivos(cultivo1, cultivo2);
		
		InformeCultivo informe = new InformeCultivo();
		informe.mostrarInfome(cultivo1);
		informe.mostrarInfome(cultivo2);
		
		Cultivo mejorCultivo = campo.obtenerMasRentablePorHa();
		
		informe.mostrarComparacion(mejorCultivo);

	}

}








