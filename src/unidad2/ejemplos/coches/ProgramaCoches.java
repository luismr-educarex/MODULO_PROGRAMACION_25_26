package unidad2.ejemplos.coches;

public class ProgramaCoches {

	public static void main(String[] args) {
		
		Coche bmw = new Coche();

		bmw.arrancar();
		bmw.acelerar();
		bmw.acelerar();
		bmw.acelerar();
		bmw.acelerar();
		bmw.acelerar();
		bmw.acelerar();
		System.out.println("Velocidad:"+bmw.velocidad);
		bmw.frenar();
		System.out.println("Velocidad:"+bmw.velocidad);
		bmw.acelerar();
		bmw.acelerar();
		bmw.acelerar();
		System.out.println("Velocidad:"+bmw.velocidad);
		bmw.frenar_fuerte();
		System.out.println("Velocidad:"+bmw.velocidad);
		bmw.parar();
		System.out.println("Velocidad:"+bmw.velocidad);
		
		
	}

}
