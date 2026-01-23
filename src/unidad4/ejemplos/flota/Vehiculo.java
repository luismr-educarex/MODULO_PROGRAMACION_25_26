package unidad4.ejemplos.flota;

public class Vehiculo  {

	private int id;
	private String matricula;
	private String marca;
	private String modelo;
	private double kms;

	
	public Vehiculo(int id, String matricula, String marca, String modelo, double kms) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.kms = kms;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getKms() {
		return kms;
	}

	public void setKms(double kms) {
		this.kms = kms;
	}

	
	@Override
	public String toString() {
		return "id=" + id + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", kms="
				+ kms;
	}
	
	
	
	
	
	
	
}
