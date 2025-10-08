package unidad1.ejercicios;

import java.util.Scanner;

public class CajaRuralNavalmoral {
	
	static final String MONEDA = "€";

	public static void main(String[] args) {
		
		 Scanner lector  = new Scanner(System.in);
		 double tipoInteres = 0;
		 double saldoInicial = 0;
		 double saldoAcumulado_1Anio = 0;
		 double saldoAcumulado_2Anio = 0;
		 double saldoAcumulado_3Anio = 0;
		 
		 System.out.println("Tipo de interés(%):");
		 tipoInteres=lector.nextDouble();
		 System.out.println("Saldo inicial:");
		 saldoInicial=lector.nextDouble();
		 
		 saldoAcumulado_1Anio = saldoInicial * (1+tipoInteres/100);
		 saldoAcumulado_2Anio = saldoAcumulado_1Anio * (1+tipoInteres/100);
		 saldoAcumulado_3Anio = saldoAcumulado_2Anio * (1+tipoInteres/100);
		 
		 
		 System.out.println("Saldo inicial:"+saldoInicial+MONEDA);
		 System.out.printf("Saldo acumulado 1º año:%.2f"+MONEDA+"\n",saldoAcumulado_1Anio);
		 System.out.printf("Saldo acumulado 2º año:%.2f"+MONEDA+"\n",saldoAcumulado_2Anio);
		 System.out.printf("Saldo acumulado 3º año:%.2f"+MONEDA+"\n",saldoAcumulado_3Anio);
		 
		 lector.close();
		 

	}

}
