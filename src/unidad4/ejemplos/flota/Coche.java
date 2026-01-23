package unidad4.ejemplos.flota;

public class Coche extends Vehiculo{
	
	
	private int numPuertas;
	private double capacidadMaletero;
	
	public Coche(int id, String matricula, String marca, String modelo, double kms,int numPuertas,double capaciadadMaletero) {
		super(id, matricula, marca, modelo, kms);
		this.numPuertas=numPuertas;
		this.capacidadMaletero=capaciadadMaletero;
	}
	
	

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public double getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(double capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}

	@Override
	public String toString() {
		
		return "Coche"+super.toString()+"[numPuertas=" + numPuertas + ", capacidadMaletero=" + capacidadMaletero + "]";
	}
	
	
	
	
	
	
	
	

}
