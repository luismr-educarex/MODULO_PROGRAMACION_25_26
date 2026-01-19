package unidad4.ejercicios.parkingv2;

public class Plaza {
	
	private int fila;
	private int columna;
	private TPlaza tipo;
	
	
	public Plaza(int fila, int columna, TPlaza tipo) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.tipo = tipo;
	}


	public int getFila() {
		return fila;
	}


	public int getColumna() {
		return columna;
	}


	public TPlaza getTipo() {
		return tipo;
	}
	
	
	

}
