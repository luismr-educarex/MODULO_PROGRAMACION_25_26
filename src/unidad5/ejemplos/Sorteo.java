package unidad5.ejemplos;

import java.util.Scanner;

public class Sorteo {

	static final int NUM_NUMEROS = 100;
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		int numero1 = teclado.nextInt();
		System.out.println("Introduzca un número");
		int numero2 = teclado.nextInt();
		System.out.println("Introduzca un número");
		int numero3 = teclado.nextInt();

		int[] numeros = new int[NUM_NUMEROS];
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Introduzca un número");
			numeros[i]=teclado.nextInt();
		}
		
		
		
		
		
		
	}

}










