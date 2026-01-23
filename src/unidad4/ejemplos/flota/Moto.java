package unidad4.ejemplos.flota;

public class Moto extends Vehiculo{


	private double peso;
	private int tiempos;
	private int cilindros;
	
	
	
	public Moto(int id, String matricula, String marca, String modelo, double kms, double peso, int tiempos,
			int cilindros) {
		super(id,matricula,marca,modelo,kms);
		this.peso=peso;
		this.tiempos = tiempos;
		this.cilindros = cilindros;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public int getTiempos() {
		return tiempos;
	}



	public void setTiempos(int tiempos) {
		this.tiempos = tiempos;
	}



	public int getCilindros() {
		return cilindros;
	}



	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}



	@Override
	public String toString() {
		return "Moto [peso=" + peso + ", tiempos=" + tiempos + ", cilindros=" + cilindros + "]";
	}
	
	
	
	
	
}
