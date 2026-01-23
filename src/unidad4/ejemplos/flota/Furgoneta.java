package unidad4.ejemplos.flota;

public class Furgoneta extends Vehiculo{

	private int numAsientos;
	private double capacidadCarga;
	
	public Furgoneta(int id, String matricula, String marca, String modelo, double kms, int numAsientos,
			double capacidadCarga) {
		super(id,matricula,marca,modelo,kms);
		this.numAsientos = numAsientos;
		this.capacidadCarga = capacidadCarga;
		
	}
	public int getNumAsientos() {
		return numAsientos;
	}
	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}
	public double getCapacidadCarga() {
		return capacidadCarga;
	}
	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}
	@Override
	public String toString() {
		return "Furgoneta [numAsientos=" + numAsientos + ", capacidadCarga=" + capacidadCarga + "]";
	}
	
	
	
	
}
