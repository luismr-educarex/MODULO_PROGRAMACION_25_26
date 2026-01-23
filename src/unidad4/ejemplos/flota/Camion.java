package unidad4.ejemplos.flota;

public class Camion extends Vehiculo {
	
	private int numEjes;
	private int PMA;
	

	public Camion(int id,String marca, String modelo, String matricula, int kms,int numEjes,int PMA) {
		super(id,marca, modelo, matricula, kms);
		this.numEjes=numEjes;
		this.PMA=PMA;
	}

	

	@Override
	public String toString() {
		return "Camion [numEjes=" + numEjes + ", PMA=" + PMA + "]";
	}

	public int getNumEjes() {
		return numEjes;
	}

	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}

	public int getPMA() {
		return PMA;
	}

	public void setPMA(int pMA) {
		PMA = pMA;
	}

	
	
	

}
