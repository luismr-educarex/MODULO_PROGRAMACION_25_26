package unidad7.ejercicios;

public class Leonardo extends TortugaNinja {


	public Leonardo() {
		this.nombre="Leonardo";
		this.velocidad=0;
		this.poder=50;
		this.arma="Katanas";
		
	}
	
	
	
	@Override
	public void correr() {
		velocidad+=30;
		
	}
}
