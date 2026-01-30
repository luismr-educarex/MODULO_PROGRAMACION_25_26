package unidad5.ejemplos.vehiculos.modelos;

public class Camion extends Vehiculo{

	private int cargaMaxima;
	
	public Camion(int id, String matricula, String marca, String modelo,int cargaMaxima) {
		super(id, matricula, marca, modelo);
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public double calcularImpuesto() {
	
		return 200+(cargaMaxima*0.02);
	}
	
	@Override
	public String getTipo() {
		return "CAMION";
	}

	
}
