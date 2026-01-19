package unidad4.ejercicios.parkingv2;

public class Vehiculo {
	private String matricula;

	public Vehiculo(String matricula) {
		super();
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + "]";
	}
	
	

}
