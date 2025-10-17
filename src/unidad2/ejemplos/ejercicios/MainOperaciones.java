package unidad2.ejemplos.ejercicios;

import java.util.Scanner;

public class MainOperaciones {

	public static void main(String[] args) {
		
		int numero1;
		int numero2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		numero1 = teclado.nextInt();
		System.out.println("Introduzca un número:");
		numero2 = teclado.nextInt();
		
		//Una manera de sumar
		Operaciones operaciones = new Operaciones();
		int suma = operaciones.sumar(numero1, numero2);
		//Otra manera de sumar
		int suma2 = Operaciones.sumar2(numero1, numero2);
		
		System.out.println("Suma:"+suma);
		System.out.println("Suma 2:"+suma2);
		
		int resta = operaciones.restar(numero1, numero2);
		System.out.println("Resta:"+resta);
		
		teclado.close();

	}

}







