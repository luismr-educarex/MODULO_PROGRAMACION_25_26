package unidad7.ejemplos;

public class Coche extends Vehiculo{

	public Coche(String marca, int anio) {
		super(marca, anio);
		
	}

	@Override
	public void acelerar(double incremento) {
		
		if(incremento>0 && incremento<50) {
			this.velocidadActual+=incremento;
			System.out.println("Acelerando...");
		}else {
			System.out.println("Incremento no válido");
		}
		
	}

}







