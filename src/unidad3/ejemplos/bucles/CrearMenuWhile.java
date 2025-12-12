package unidad3.ejemplos.bucles;

import java.util.Scanner;

public class CrearMenuWhile {

	public static void main(String[] args) {
		
      Scanner teclado = new Scanner(System.in);
		
		int opcion=5;
		while (opcion!=5){
			System.out.println("===== Menú ======");
			System.out.println("1.Sumar");
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("5.Salir");
			
			opcion = teclado.nextInt();
			
			System.out.println("Seleccionada la opción:"+opcion);
			
		} 
	}
}
