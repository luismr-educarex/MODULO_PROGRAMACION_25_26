package unidad3.ejemplos.condiciones;

import java.util.Scanner;

public class MainFechas {

    static final int DIA_1 = 1;
	
	public static void main(String[] args) {

		int dia;
		String mes;
		int anio;
		int numMes;
		boolean esDiaCorrecto = true;
		boolean esMesCorrecto = true;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el día:");
		dia = teclado.nextInt();
		System.out.println("Introduzca el mes:");
		mes = teclado.next();
		System.out.println("Introduzca el anio:");
		anio = teclado.nextInt();

		numMes = Integer.parseInt(mes);

		if (numMes >= 1 && numMes <= 12) { // Validación del mes
			if (esMesDe30Dias(numMes)) {
				esDiaCorrecto = esDiaEnRango(30, dia);
			} else if (esMesDe31Dias(numMes)) {
				esDiaCorrecto = esDiaEnRango(31, dia);
			} else {
				// Si es bisiesto
				if(esBisiesto(anio)) { //Año bisiesto
					esDiaCorrecto = esDiaEnRango(29, dia);
				}else { // Año no biesto
					esDiaCorrecto = esDiaEnRango(28, dia);
				}
			}
		} else {
			System.out.println("Mes incorrecto");
			esMesCorrecto = false;
		} // Fin validación del mes

		
		if(esDiaCorrecto && esMesCorrecto) {
			System.out.println("Hoy es " + dia + " de " + mes + " de " + anio);
		}else {
			System.out.println("No se ha podido generar la fecha. Uno de los datos es incorrecto");
		}
		
		
		teclado.close();

	}
	
	
   private static boolean esBisiesto(int anio) {
		
		
		boolean esBisiesto =false;
		
		if(((anio%4==0) && (anio%100!=0))||anio%400==0) {
			esBisiesto=true;
		}
		
		return esBisiesto;
	}
	
	private static boolean esMesDe30Dias(int mes) {
		
		
		boolean es30dias =false;
		
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			es30dias=true;
		}
		
		return es30dias;
	}
	
	private static boolean esMesDe31Dias(int mes) {
		
		
		boolean es31dias =false;
		
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10
				|| mes == 12) {
			es31dias=true;
		}
		
		return es31dias;
	}
	
	
	
	private static boolean esDiaEnRango(int diaSuperior,int dia) {
		
		boolean esCorrecto=true;
		
		if (dia >= DIA_1 && dia <= diaSuperior) {
			System.out.println("Día correcto");
		} else {
			System.out.println("Día incorrecto");
			esCorrecto=false;
		}
		
		return esCorrecto;
		
	}

}

















