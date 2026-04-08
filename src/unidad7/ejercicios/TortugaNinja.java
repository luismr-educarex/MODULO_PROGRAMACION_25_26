package unidad7.ejercicios;

public abstract class TortugaNinja {

	
	
	public TortugaNinja(String nombre, int velocidad, int poder, String arma) {
		super();
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.poder = poder;
		this.arma = arma;
	}


	protected String nombre;
	protected int velocidad;
	protected int poder;
	protected String arma;
	
	
	public abstract void correr();
	
	public int golpear() {	
		return poder;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	@Override
	public String toString() {
		return "TortugaNinja [nombre=" + nombre + ", velocidad=" + velocidad + ", poder=" + poder + ", arma=" + arma
				+ "]";
	}


	
	
	
	
	
}
