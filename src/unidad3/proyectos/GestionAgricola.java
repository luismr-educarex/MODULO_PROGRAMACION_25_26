package unidad3.proyectos;

import java.util.Scanner;

public class GestionAgricola {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		double superficie;
		double produccion;
		double temperatura;
		double rendimiento=0;

		
		superficie = leerDato("Dame la superficie(Ha):",300);
		produccion = leerDato("Dame la produccion(Kg):",10000);
		temperatura = leerDato("Dame la temperatura(ºC)", 50);
		
		rendimiento = produccion/superficie *(temperatura/39);
		System.out.println("Rendimiento:"+rendimiento+" kg/Ha");

	}
	
	private static double leerDato(String mensaje,int limite) {
		
		double dato;
		do {
			System.out.println(mensaje);
			dato = teclado.nextDouble();
			if(dato<0 && dato<limite) {
				System.out.println("Dato incorrecto");
			}
		}while(dato<0);
		
		return dato;
	}
	



	
	
	
}









