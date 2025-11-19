package unidad3.ejemplos.errores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeerDatos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		int numero=0;
		try{
				numero = teclado.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("No es un número entero");
		}catch (Exception e) {
			System.out.println("Se ha producido un error");
		}finally {
			teclado.close();
		}
		
		
		System.out.println("Número:"+numero);
		

	}

}
