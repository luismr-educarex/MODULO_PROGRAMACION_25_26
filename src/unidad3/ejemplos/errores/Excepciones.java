package unidad3.ejemplos.errores;

public class Excepciones {

	public static void main(String[] args) {
		
		
		int a;
		int b;
		
		a=18;
		b=0;
		String cadena = "Aprendiendo errores en Java";
		
		try {
				System.out.println("Resultado:"+(a/b));
				System.out.println("Longitud de la cadena:"+cadena.length());
				

		}catch(ArithmeticException e) {
			System.err.println("Usted está dividiendo entre 0");
		}catch (NullPointerException e) {
			System.err.println("No existe la cadena");
		}catch (Exception e) {
			System.err.println("Se ha producido un error");
		}finally {
			System.out.println("¡Muchas gracias!");
		}
		
		
	}

}









