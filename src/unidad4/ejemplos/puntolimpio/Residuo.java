package unidad4.ejemplos.puntolimpio;

public class Residuo {
	
	private String nombre;
	private double numKg;
	private int numEntregas;
	
	public Residuo(String nombre) {
		this.nombre=nombre;
		numKg=0;
		numEntregas=0;
	}

	public void registrarEntrega(double numkg) {
		this.numKg += numkg;
		numEntregas++;

	}
	
	public double obtenerMedia() {
		
		
		double media=0;
		if(numEntregas>0) {
			media = numKg/numEntregas;
		}
		
		return media;
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNumKg() {
		return numKg;
	}

	public void setNumKg(double numKg) {
		this.numKg = numKg;
	}

	public int getNumEntregas() {
		return numEntregas;
	}

	public void setNumEntregas(int numEntregas) {
		this.numEntregas = numEntregas;
	}



	@Override
	public String toString() {
		return "Residuo [nombre=" + nombre + ", numKg=" + numKg + ", numEntregas=" + numEntregas + "]";
	}
	
	
	
     
	

}











