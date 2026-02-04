package unidad5.ejemplos.materiales;

public enum Material {

	ARENA(2800),
	GRAVA(3200),
	CEMENTO(4600);
	
	private final int tiempoDescarga;
	
	Material(int tiempoDescarga){
		this.tiempoDescarga=tiempoDescarga;
	}
	
	public int getTiempoDescarga() {
		return tiempoDescarga;
	}
	
	
	
	
}
