package unidad3.proyectos;

import java.util.Scanner;

public class CajaRuralNavalmoral {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double saldoInicial = leerSaldoInicial();
		double interes = leerInteres();
		int anios = leerAnios();
		
		double saldoFinal = simularCuenta(saldoInicial,interes,anios);
		
		System.out.println("El saldo final es:"+ saldoFinal);
		

	}

	private static int leerAnios() {
		
		int anios=0;
		
		do {
			System.out.println("Introduzca el número de años:");
			anios = teclado.nextInt();
			if(anios<0) {
				System.out.println("Error: el números de años no puede ser negativo");
			}
			
		}while(anios<0);
		
		return anios;
	}

	private static double leerInteres() {
		
		double interes=0;
		
		do {
			System.out.println("Introduzca el tipo de interés:");
			interes = teclado.nextDouble();
			if(interes<0) {
				System.out.println("Error: el interés no puede ser negativo");
			}
			
		}while(interes<0);
		
		return interes;
	}

	private static double leerSaldoInicial() {
		
		double saldo=0;
		
		do {
			System.out.println("Introduzca el saldo inicial:");
			saldo = teclado.nextDouble();
			if(saldo<0) {
				System.out.println("Error: el saldo no puede ser negativo");
			}
			
		}while(saldo<0);
		
		return saldo;
	}

	private static double simularCuenta(double saldoInicial, double interes, int anios) {
	
		System.out.println("---- SIMULACIÓN DEPÓSITO -----");
		System.out.println("Saldo inicial:"+saldoInicial);
		System.out.println("Interés:"+interes);
		System.out.println("Años:"+anios);
		
		for(int i=1;i<=anios;i++) {	
			saldoInicial =  calcularSaldo(saldoInicial,interes);
			System.out.printf("El saldo en el año %d es %f \n",i,saldoInicial);
			
			saldoInicial = pedirNuevoIngreso(saldoInicial);
			
		}
		return saldoInicial;
	}

	private static double pedirNuevoIngreso(double saldo) {
		
		System.out.println("¿Quieres hacer un nuevo ingreso?s/n");
		String respuesta = teclado.next();
		
		if(respuesta.equalsIgnoreCase("s")) {
			
			double ingreso = pedirNuevoIngreso();
			saldo +=ingreso;
		}
		
		return saldo;
	}

	private static double pedirNuevoIngreso() {
		
		double nuevoIngreso=0;
		
		do {
			System.out.println("Introduzca el nuevo ingreso:");
			nuevoIngreso = teclado.nextDouble();
			if(nuevoIngreso<0) {
				System.out.println("Error: el ingreso no puede ser negativo");
			}
			
		}while(nuevoIngreso<0);
		
		return nuevoIngreso;
	}

	private static double calcularSaldo(double saldoInicial, double interes) {
		
		double saldoCalculado = saldoInicial * (1+interes/100);
		return saldoCalculado;
	}

}











