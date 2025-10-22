package unidad2.ejemplos.cadenas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ComparacionCadenas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		/*System.out.println("Dame el  nombre del módulo");
	 	String modulo =  entrada.next();
		String modulo2 = "Programación";
		
		boolean sonIguales = modulo2.equals(modulo);
		System.out.println("¿Son iguales?:"+sonIguales);
		*/
		int numero =12;
		String resultado = (numero>10)?"Es mayor":"Es menor o igual";
		System.out.println("Resultado:"+resultado);
		
		
		 String textoFecha = "15/10/2025";
	     DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     LocalDate fecha= LocalDate.parse(textoFecha, formato);
	     System.out.println("Fecha analizada: " + fecha);
		
		entrada.close();

	}

}





