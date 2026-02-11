package unidad5.ejercicios.expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainEjemplos2ER {

	public static void main(String[] args) {

		// Ejemplo 1: Validar un número entero positivo -----------------------------
		System.out.println("Validar un número entero positivo -----------------------------");

		String texto = "12345";

		Pattern patron = Pattern.compile("\\d+");
		Matcher matcher = patron.matcher(texto);

		if (matcher.matches()) {
			System.out.println("Es un número entero válido");
		} else {
			System.out.println("No es un número válido");
		}

		//Ejemplo 2: Buscar números dentro de un texto -----------------------------
		System.out.println("Buscar números dentro de un texto  -----------------------------");
		texto = "Hay 3 coches y 24 motos";

		patron = Pattern.compile("\\d+");
		matcher = patron.matcher(texto);

		while (matcher.find()) { // Para buscar usamos la función find del Matcher
			System.out.println("Número encontrado: " + matcher.group() +
					" en posición " + matcher.start());
		}

		//Ejemplo 3: Extraer palabras concretas (OR) -----------------------------
		System.out.println("Extraer palabras concretas (OR)  -----------------------------");
		texto = "Java y Python son lenguajes populares";

		patron = Pattern.compile("Java|Python");
		matcher = patron.matcher(texto);

		while (matcher.find()) {
			System.out.println("Lenguaje encontrado: " + matcher.group());
		}

		//Ejemplo 4: Validar un código postal español -----------------------------
		System.out.println("Validar un código postal español  -----------------------------");
		String codigoPostal = "10300";

		// 5 dígitos exactos
		patron = Pattern.compile("^\\d{5}$");
		matcher = patron.matcher(codigoPostal);

		System.out.println("¿CP válido? " + matcher.matches());

		//Ejemplo 5: Sustituir palabras con replaceAll() -----------------------------
		System.out.println("Sustituir palabras con replaceAll()  -----------------------------");
		texto = "Java es divertido. Java es potente.";

		patron = Pattern.compile("Java");
		matcher = patron.matcher(texto);

		String resultado = matcher.replaceAll("Python");

		System.out.println(resultado);

		//Ejemplo 6: Contar cuántas veces aparece un patrón --------------------------
		System.out.println("Contar cuántas veces aparece un patrón  -----------------------------");
		texto = "uno dos uno uno tres";

		patron = Pattern.compile("uno");
		matcher = patron.matcher(texto);

		int contador = 0;
		while (matcher.find()) {
			contador++;
		}

		System.out.println("Aparece 'uno' " + contador + " veces");

		//Ejemplo 7: Dividir cadenas con split() usando regex ----------------------------
		System.out.println("Dividir cadenas con split() usando regex  -----------------------------");
		String datos = "Juan,  Pedro ,Ana , Luis Miguel,     Manolo";

		// coma con espacios opcionales
		String[] nombres = datos.split("\\s*,\\s*");

		for (String n : nombres) {
			System.out.println(n);
		}

		//Ejemplo 8: Buscar URLs en un texto --------------------------
		System.out.println("Buscar URLs en un texto  -----------------------------");
		texto = "Visita https://www.google.com o http://ies-augustobriga.es";
		patron = Pattern.compile("https?://[\\w./-]+");
		matcher = patron.matcher(texto);
		while (matcher.find()) {
			System.out.println("URL encontrada: " + matcher.group());
		}

		//Ejemplo 9: Ignorar mayúsculas y minúsculas -----------------------
		System.out.println("Ignorar mayúsculas y minúsculas -----------------------");
		texto = "JaVa es genial";

		patron = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		matcher = patron.matcher(texto);

		System.out.println("¿Contiene 'java'? " + matcher.find());
		
		
		//Ejemplo 10:Queremos extraer tEodos los precios de un texto. Usamos find() para iterar.
		System.out.println("Extraer todos los precios de un texto -----------------------");
		 texto = "Lista: Pan 1.50€, Leche 0.99€, Café 5.00€, Galletas 8€";
		// Buscamos: dígitos + punto (opcional) + dígitos + símbolo €
		Pattern p = Pattern.compile("(\\d+\\.?\\d*)€"); 
		Matcher m = p.matcher(texto);

		while (m.find()) {
		    System.out.println("Precio encontrado: " + m.group(1));
		}


	}

}
