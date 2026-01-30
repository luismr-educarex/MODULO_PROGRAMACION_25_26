package unidad5.ejemplos.vehiculos.modelos;

public class Coche extends Vehiculo{

	private int puertas;
	
	public Coche(int id, String matricula, String marca, String modelo,int puertas) {
		super(id,matricula, marca, modelo);
		this.puertas = puertas;
	}
	
	@Override
	public double calcularImpuesto() {
	
		return 120 + (puertas*10);
	}
	
	@Override
	public String getTipo() {
		return "COCHE";
	}
	
	@Override
	public String toString() {
		return super.toString()+"-Número puertas:"+puertas;
	}
	
	

}



















