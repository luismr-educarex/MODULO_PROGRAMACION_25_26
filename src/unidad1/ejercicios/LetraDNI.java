package unidad1.ejercicios;

public class LetraDNI {

	static final int FACTOR = 23;
	
	public static void main(String[] args) {
		
		
		int numeroDni = 9408901;
		
		int division = numeroDni/FACTOR;
		System.out.println(division);
		int multiplicacion = division*FACTOR;
		System.out.println(multiplicacion);
		int posicion = numeroDni-multiplicacion;
		
		System.out.println("Posición de la letra:"+posicion);
		
		

	}

}
