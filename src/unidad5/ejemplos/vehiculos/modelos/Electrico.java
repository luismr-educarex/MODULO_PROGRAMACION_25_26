package unidad5.ejemplos.vehiculos.modelos;

public class Electrico extends Vehiculo{

	private int autonomia;
	
	public Electrico(int id, String matricula, String marca, String modelo,int autonomia) {
		super(id, matricula, marca, modelo);
		this.autonomia=autonomia;
	}
	
	@Override
	public double calcularImpuesto() {
		
		return 50;
	}
	
	@Override
	public String getTipo() {
		return "ELECTRICO";
	}

	
	
	
}
