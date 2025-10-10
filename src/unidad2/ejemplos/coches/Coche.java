package unidad2.ejemplos.coches;

public class Coche {
	
	//atributos de la clase = PARTE ESTÁTICA
	public String marca;
	public String modelo;
	public String color;
	public int velocidad=0;
	public double longitud;
	private char combustible;
	
	//métodos de la calse = PARTE DINÁMICA O COMPORTAMIENTO
	public void arrancar() {
		System.out.println("Arrancando...");
	}
	
	public void parar() {
		
		velocidad=0;
	}
	
	public void acelerar(){
		
		velocidad = velocidad+10;
	}
	
	public void frenar() {
		
		velocidad = velocidad-5;
	}
	
    public void frenar_fuerte() {
		
		velocidad = velocidad-9;
	}
	

}
