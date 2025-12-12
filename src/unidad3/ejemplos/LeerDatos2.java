package unidad3.ejemplos;

import java.util.Scanner;

public class LeerDatos2 {

	public static void main(String[] args) {
		
		System.out.println("Dame los números sepados por |");
		Scanner teclado = new Scanner(System.in);
		
		String numerosEntrada = teclado.next();	
		String[] numeros = numerosEntrada.replace("|", ";").split(";");
		
		int suma=0;
		for(int i=0;i<numeros.length;i++) {
			
				int numero =  Integer.parseInt(numeros[i]);
				suma +=numero;
			
			
		}
		
		System.out.println("La suma es:"+suma);

	}

}







