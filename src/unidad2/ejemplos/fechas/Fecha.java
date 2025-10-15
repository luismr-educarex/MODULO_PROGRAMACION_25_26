package unidad2.ejemplos.fechas;

import java.util.Scanner;

public class Fecha {
	
	private int dia=0;
	private String mes;
	private int anio=0;
	
	public int obtenerDia() {
		
		return dia;
	}
	
	public void crearFecha(int dia,String mes,int anio) {
		
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public void leerDatos() {
		
		int dia;
		String mes;
		int anio;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el día:");
		dia = teclado.nextInt();
		System.out.println("Introduzca el mes:");
		mes = teclado.next();
		System.out.println("Introduzca el año");
		anio = teclado.nextInt();
		
		crearFecha(dia, mes, anio);
		
		teclado.close();
	}
	
	public void imprimir() {
		
		System.out.println("Fecha:"+dia+" de "+mes+" de "+anio);
	}

}











