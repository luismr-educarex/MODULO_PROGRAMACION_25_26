package unidad7.ejemplos;

public class Tostadora implements Arrancable{

	private String marca;
	private boolean rejillaEncendida;
	
	public Tostadora(String marca) {
		this.marca = marca;
	}
	
	@Override
	public void arrancar() {
		rejillaEncendida = true;
		System.out.println(marca+":Encendida");
		
	}

	@Override
	public void apagar() {
		rejillaEncendida = false;
		System.out.println(marca+":Apagada");
		
	}

}
