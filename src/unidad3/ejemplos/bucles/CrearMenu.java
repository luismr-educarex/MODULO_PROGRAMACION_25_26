package unidad3.ejemplos.bucles;

import java.util.Scanner;

public class CrearMenu {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int intentos=1;
		int opcion=0;
		do {
			System.out.println("===== Menú ======");
			System.out.println("1.Sumar");
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("5.Salir");
			
			opcion = teclado.nextInt();
			System.out.println("Seleccionada la opción:"+opcion);
			
			if(opcion==1) {
				System.out.println("Sumamos");
			}else if(opcion==2) {
				System.out.println("Restando...");
			}else if(opcion==3) {
				System.out.println("Multiplicando");
			}else if(opcion==4) {
				System.out.println("Dividiendo");
			}else if(opcion==5) {
				System.out.println("Muchas gracias...");
			}else {
				System.out.println("Opción no válida");
			    System.out.println("Intentos:"+intentos);
				intentos++;
			}
			
			/*
			switch (opcion) {
			case 1: 
				System.out.println("Sumamos");
			break;
			case 2: 
				System.out.println("Restamos");
			break;
			case 3: 
				System.out.println("Multiplicamos");
			break;
			case 4: 
				System.out.println("Dividimos");
			break;
			case 5: 
				System.out.println("Hasta luego...");
			break;
			default:
				System.out.println("Opción no válida...");
			}
			*/
			
			
		} while (opcion!=5 && intentos<4);

	}

}











