package unidad3.ejemplos;

import java.util.Scanner;

public class LeerDatos {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("¿Cuántos números quiere sumar?(0=salir)");
			int numeros = teclado.nextInt();
			if(numeros==0) {
				System.out.println("Fin del programa");
				break;
			}
			
			int suma = 0;
			for(int i=0;i<numeros;i++) {
				int valor = teclado.nextInt();
				suma +=valor;
			}
			
			System.out.println("La suma es:"+suma);
			
		}

	}

}















