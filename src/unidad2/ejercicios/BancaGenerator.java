package unidad2.ejercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

public class BancaGenerator {

	public static void main(String[] args) {
		
		String email;
		String nombre;
		String apellido1;
		String apellido2;
		int dia;
		int mes;
		int anio;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el email:");
		email = entrada.next();
		entrada.nextLine();
		
		System.out.println("Introduzca su nombre:");
		nombre = entrada.nextLine();
		System.out.println("Introduzca su primer apellido:");
		apellido1 = entrada.nextLine();
		System.out.println("Introduzca su segundo apellido:");
		apellido2 = entrada.nextLine();
		
		System.out.println("Introduzca su día:");
		dia = entrada.nextInt();
		System.out.println("Introduzca su mes:");
		mes = entrada.nextInt();
		System.out.println("Introduzca su año:");
		anio = entrada.nextInt();
		
		comprobarCorreo(email);
		comprobarMayorEdad(dia,mes,anio);
		crearNombreUsuario(nombre, apellido1, apellido2);
		crearPin();
		
		
	}
	
	private static boolean miEndsWith(String cadena,String patron) {
		
		int longitudPatron = patron.length();
		int longitudCadena = cadena.length();
		int indice = longitudCadena-longitudPatron;
		String sufijo = cadena.substring(indice);
		boolean sonIguales =  patron.equals(sufijo);
		
		return sonIguales;
		
	}
	
	private static void comprobarCorreo(String email) {
		
		//Comprobar que el correo tiene dominio @educarex.es
		boolean esCorreoValido = email.endsWith("@educarex.es");
		System.out.println("¿Correo válido?:"+esCorreoValido);
		System.out.println("Son iguales usando mi método:"+miEndsWith(email, "@educarex.es"));
	}
	
	private static void comprobarMayorEdad(int dia,int mes,int anio) {
		LocalDate fecha = LocalDate.of(anio, mes,dia);
		LocalDate fechaHoy = LocalDate.now();
		long diferenciaAnios = ChronoUnit.YEARS.between(fecha, fechaHoy);
		boolean esMayorEdad = (diferenciaAnios>=18);
		System.out.println("Es mayor de edad:"+esMayorEdad);
	}
	
	private static void crearNombreUsuario(String nombre,String apellido1,String apellido2) {
		//Crear el nombre del usuario
				String nombreUsuario =  (nombre+apellido1.charAt(0)+apellido2.charAt(0)).toLowerCase();
				String nombreUusario2 = ((nombre.concat(apellido1.substring(0,1))).concat(apellido2.substring(0, 1))).toLowerCase();
				System.out.println("Su nombre de usuario es:"+nombreUsuario);
				System.out.println("Su nombre de usuario es:"+nombreUusario2);
	}

	private static void crearPin() {
		int pin = (int)(Math.random()*10000);
		String pinFinal = String.format("%04d", pin);
		System.out.printf("Pin:"+pinFinal);
		System.out.println();
		
		Random random = new Random();
		int pin2 =  random.nextInt(10000); // genera entre 0 y el 9999	
		String pinFinal2 = String.format("%04d", pin2);
		System.out.println("Pin2:"+pinFinal2);
	}
}







