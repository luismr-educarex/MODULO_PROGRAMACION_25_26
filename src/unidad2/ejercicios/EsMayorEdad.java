package unidad2.ejercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EsMayorEdad {

	public static void main(String[] args) {
		
		int dia;
		int mes;
		int anio;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el día:");
		dia = teclado.nextInt();
		System.out.println("Dame el mes:");
		mes = teclado.nextInt();
		System.out.println("Dame el anio:");
		anio = teclado.nextInt();
		
		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaUsuario = LocalDate.of(anio,mes,dia);
		
		long diferenciaAnios = ChronoUnit.YEARS.between(fechaUsuario,fechaActual);
		
		boolean esMayor = diferenciaAnios >=18;
		
		System.out.println("¿Es mayor de edad?:"+esMayor);
		
	}

}




