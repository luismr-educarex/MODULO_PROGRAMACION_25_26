package unidad5.ejemplos.vehiculos.modelos;

public class Vehiculo {
	
	private int id;
	private String matricula;
	private String marca;
	private String modelo;
	
	public Vehiculo(int id, String matricula, String marca, String modelo) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Vehiculo(int id, String matricula) {
		super();
		this.id = id;
		this.matricula = matricula;

	}
	
   public double calcularImpuesto(int tasa) {
		
		return 0;
	}
	
	public double calcularImpuesto() {
		
		return 0;
	}

	public String getTipo() {
		return "";
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", matricula=" + matricula + ", marca=" + marca + ", modelo="
				+ modelo + "]";
	}
	
	
	
	
	
	

}
