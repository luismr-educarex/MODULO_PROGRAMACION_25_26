package unidad7.ejemplos;

public abstract class Vehiculo {

	protected String marca;
	protected int anio;
	protected Double velocidadActual;
	
	public Vehiculo(String marca, int anio) {
		super();
		this.marca = marca;
		this.anio = anio;
		this.velocidadActual = 0.0;
	}
	
	public void frenar() {
		this.velocidadActual=0.0;
		System.out.println("Frenado");
	}
	
	public abstract void acelerar(double incremento);
	
	
}





