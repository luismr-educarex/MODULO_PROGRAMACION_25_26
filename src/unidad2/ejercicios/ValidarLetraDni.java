package unidad2.ejercicios;

public class ValidarLetraDni {

	public static void main(String[] args) {
		
		String dniUsuario = "93938277";
		
		int tam = dniUsuario.length();
		
		char ultimoCaracter = dniUsuario.charAt(tam-1);
		
		System.out.println("Es letra:"+Character.isLetter(ultimoCaracter));

	}

}
