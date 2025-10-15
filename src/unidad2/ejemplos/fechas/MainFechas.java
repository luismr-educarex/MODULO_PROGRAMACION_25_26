package unidad2.ejemplos.fechas;

import java.util.Scanner;

public class MainFechas {

	public static void main(String[] args) {
		
		int dia;
		String mes;
		int anio;
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el día:");
		dia = teclado.nextInt();
		System.out.println("Introduzca el mes:");
		mes = teclado.next();
		System.out.println("Introduzca el anio:");
		anio = teclado.nextInt();

		System.out.println("Hoy es "+dia+" de "+mes+" de "+anio);
		
		teclado.close();

	}

}
