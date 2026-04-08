package unidad7.ejercicios;

public class Donatelo extends TortugaNinja{

	
	public Donatelo(String nombre, int velocidad, int poder, String arma) {
		super(nombre, velocidad, poder, arma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void correr() {
		velocidad+=20;
		
	}

	

}
