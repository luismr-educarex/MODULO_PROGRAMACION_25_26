package unidad5.ejercicios.expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainEjemplosER {

	public static void main(String[] args) {
		
		
		
		String texto = "Hoy es 06/02/2026 y mañana será "
				+ "07/02/2026";
		
		
		// La regex define 3 grupos entre paréntesis:
		// Grupo 1: (\d{2}) -> El día
		// Grupo 2: (\d{2}) -> El mes
		// Grupo 3: (\d{4}) -> El año
		String patron = "(\\d{2})/(\\d{2})/(\\d{4})";
		
		Pattern patternFechas = Pattern.compile(patron);
		
		Matcher matcherFechas = patternFechas.matcher(texto);
		
		//Concepto clave: find() actúa como un iterador. 
		//Cada vez que se llama, salta a la siguiente coincidencia encontrada en el texto
		
		while (matcherFechas.find()) {
			// group(0) siempre es la coincidencia TOTAL (ej: 06/02/2026)
			System.out.println("Fecha completa:"+matcherFechas.group(0));
			
			// Los grupos se numeran por el orden de apertura del paréntesis
			System.out.println("Dia:"+matcherFechas.group(1));
			System.out.println("Mes:"+matcherFechas.group(2));
			System.out.println("Año"+matcherFechas.group(3));
			System.out.println("-------------------");
		}
		
		
		
		// Caso A: Separar DNI de la letra
		String dni = "45678932-J";
		
		// Regex: [A-Z]|-
		// Significa: "Corta cuando encuentres una letra mayúscula O un guion"
		String []datosDni = dni.toUpperCase().split("[A-Z]|-");

		
		for (String dato : datosDni) {
			System.out.println("Dato DNI: " + dato);
			// Nota: La parte derecha del corte (vacía) se suele descartar por defecto en split.
		}
		
		// Caso B: Separar por múltiples delimitadores
		String cadena = "12-7/2012";
		
		// Regex: [/-]
		// Significa: "Corta si ves una barra O un guion"
		String []datos = cadena.split("[/-]");
		
		for (String dato : datos) {
		    System.out.println("Fragmento fecha: " + dato);
		    // Imprime: "12", "7", "2012"
		}
		
		
		cadena = "12-7/2012"; // El texto es largo
		Pattern pattern = Pattern.compile("[159]"); // Busca UN solo dígito (1, 5 o 9)
		Matcher matcher = pattern.matcher(cadena);

		// ⚠️ IMPORTANTE:
		// matches() intenta encajar el patrón con TODO el String.
		// ¿"12-7/2012" es igual a un solo dígito "1"? NO.

		if(matcher.matches()) {
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado"); // <-- Entra aquí
		}
		
		//matches es muy exigente, quiere que todo el texto sea idéntico al patrón. 
		//Como el texto tiene más caracteres que un simple dígito, falla
		
		
		// Regex [951] es exactamente igual a [159]. El orden dentro de [] no importa.
		// Busca: "¿Hay algún 9, 5 o 1 por aquí?"
		String cadena2 = "1Cic5los9";
		Pattern pattern2 =  Pattern.compile("[951]");
		Matcher matcher2 = pattern2.matcher(cadena2);

		if(matcher2.find()) {
			// Encuentra el '1' al principio y se detiene (porque es un if, no un while)
			System.out.println("Encontrado");
		}else {
			System.out.println("No encontrado");
		}
		
		String cadena3 = "iooooooooo";
		// Regex ^io
		// Significa: "Debe EMPEZAR exactamente por 'io'"
		Pattern pattern3 =  Pattern.compile("^io");
		Matcher matcher3 = pattern3.matcher(cadena3);

		if(matcher3.find()) {
			System.out.println("Encontrado"); // <-- Entra aquí
		}else {
			System.out.println("No encontrado");
		}
		
		
		String cadena4 = "aa";
		// Regex: a{2,4}\d
		// Significa: "La letra 'a' entre 2 y 4 veces, SEGUIDA de un dígito"
		Pattern pattern4 =  Pattern.compile("a{2,4}\\d");
		Matcher matcher4 = pattern4.matcher(cadena4);

		if(matcher4.find()) {
			System.out.println("Encontrado");
		}else {
			// "aa" cumple la parte de las letras, pero FALTA el dígito final (\d).
			System.out.println("No encontrado"); // <-- Entra aquí
		}
		
		String cadena5 = "Hola   clase"; // Hay varios espacios en medio
		
		// Regex: \w\s+\w
		// \w   -> Un carácter de palabra (letra o número). Coincide con 'a' (de Hola)
		// \s+  -> Uno o más espacios. Coincide con "   "
		// \w   -> Un carácter de palabra. Coincide con 'c' (de clase)
		Pattern pattern5 =  Pattern.compile("\\w\\s+\\w");
		Matcher matcher5 = pattern5.matcher(cadena5);

		if(matcher5.find()) {
			System.out.println("Encontrado");
			// Realmente ha encontrado: "a   c" (el final de una palabra y el inicio de otra)
		}else {
			System.out.println("No encontrado");
		}
				

	}

}
