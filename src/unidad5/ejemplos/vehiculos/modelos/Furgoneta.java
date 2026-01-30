package unidad5.ejemplos.vehiculos.modelos;

public class Furgoneta extends Vehiculo{
	
	private int numPlazas;
	
	public Furgoneta(int id, String matricula, String marca, String modelo,int numPlazas) {
		super(id, matricula, marca, modelo);
		this.numPlazas = numPlazas;
	}

	@Override
	public double calcularImpuesto() {
		
		return 120+(numPlazas*20);
	}
	
	@Override
	public String getTipo() {
		
		return "FURGONETA";
	}
	

}
