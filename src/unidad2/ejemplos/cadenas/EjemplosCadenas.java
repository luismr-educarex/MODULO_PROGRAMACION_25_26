package unidad2.ejemplos.cadenas;

public class EjemplosCadenas {

	public static void main(String[] args) {
		
		String ipv4 = "192.168.50.34";
		String texto = "Más vale pájaro en mano que ciento volando";
		String frase = new String(" Allí donde fueres,haz lo que vieres ");
		
		//Longitud de la cadena
		System.out.println("Longitud:"+texto.length());
		
		//Obtener un carácter en una posición específica
		System.out.println("Carácter en la posición 0:"+texto.charAt(0));

		//Obtener una subcadena
		System.out.println("Subcadena:"+texto.substring(9, 15));
		
		//Todo a mayúsculas
		System.out.println("Mayúsculas:"+texto.toUpperCase());
		//Todo a minúsculas
		System.out.println("Minúsculas:"+texto.toLowerCase());
		
		//Reemplazar texto
		System.out.println("Reemplazar:"+texto.replace("pájaro","golondrinas"));
		
		//Unir
		System.out.println(texto.concat(frase));
		
		//Quitar los espacios en blanco de inicio y final
		System.out.println("Sin espacio en inicio y final:"+texto.trim());
		
		//Quitar todos los espacios en blanco
		System.out.println("Sin espacios:"+texto.replaceAll(" ", ""));
		
		System.out.println("Sin espacios:"+texto.replaceAll(" ", "").replaceAll("a", "e").replaceAll("á","é"));
		
		//Comprobar si contiene una secuencia de carateres
		System.out.println("¿Contiene 'pájaro'?:"+texto.contains("pájaro"));
		
		//Buscar la posición de un carácter o subcadena
		System.out.println("Posición de 'mano':"+texto.indexOf("mano"));
		
		//Buscar la última aparición de carácter
		System.out.println("Última posición de 'e':"+texto.lastIndexOf('e'));
		
		//Compobar si empieza o termina con una palabra o secuencia
		System.out.println("¿Empieza por 'Más'?:"+texto.startsWith("Más"));
		System.out.println("¿Termina por 'volando'?:"+texto.endsWith("volando"));
		
		//Repetir la cadena varias veces
		System.out.println("Repetir 3 veces:"+texto.repeat(3));
		
		String[] palabras = ipv4.split("\\."); // Le indicamos el separador
		for(String palabra:palabras) {
			System.out.println(palabra);
		}
		
		
		
	}

}




















