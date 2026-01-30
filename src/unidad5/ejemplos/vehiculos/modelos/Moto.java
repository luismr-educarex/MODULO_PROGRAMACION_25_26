package unidad5.ejemplos.vehiculos.modelos;

public class Moto extends Vehiculo {

	

	private int cilindrada;
	
	public Moto(int id, String matricula, String marca, String modelo,int cilindrada) {
		super(id, matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public double calcularImpuesto() {
		double impuesto=90;
		if(cilindrada<500) {
			impuesto=60;
		}
		
		return impuesto;
	}
	
	@Override
	public String getTipo() {
		return "MOTO";
	}
}
