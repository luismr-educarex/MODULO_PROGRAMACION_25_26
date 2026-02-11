package unidad5.ejercicios.expresionesregulares;

import java.util.Scanner;

public class DemoExpresionRegular {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame un nombre");
		
		String nombre = entrada.nextLine();
		
	    //String expresionRegular = "([A-Z][a-z]*){1,5}";
		// . = Cualquier caracter.
		// ? = coincide con 0 o 1 repetición
		// * = coincide con 0 o más repeticones
		// + = coincide con 1 o más repeticiones
		// \\d
		// \\s
		// {n} \\d{4}
		// {n,m} mínimo n y máximo m ocurrencias.
		// ^ inicio
		// $ final
		

	    String expresionRegular = "^[A-Z][a-z]{1,5}$";
	  
	    Boolean resultado = nombre.matches(expresionRegular);
	    
	    if(resultado) {
	    	System.out.println("Nombre válido");
	    }else {
	    	System.out.println("Nombre no válido");
	    }

	}

}









