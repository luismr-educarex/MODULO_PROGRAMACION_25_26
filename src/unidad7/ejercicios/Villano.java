package unidad7.ejercicios;

public class Villano {
	
	protected String nombre;
	protected int poder;

	public Villano(String nombre, int poder) {
		super();
		this.nombre = nombre;
		this.poder = poder;
	}
	
	public int golpear() {	
		return poder;
	}

	
}
