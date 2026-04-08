package unidad7.ejemplos;

public class Vehiculo2 {
	
	protected String marca;
	protected int anio;
	protected Double velocidadActual;
	
	public Vehiculo2(String marca, int anio) {
		super();
		this.marca = marca;
		this.anio = anio;
		this.velocidadActual = 0.0;
	}
	
	public void frenar() {
		this.velocidadActual=0.0;
		System.out.println("Frenado");
	}
	
	public void acelerar(double incremento) {
		
	}

}









