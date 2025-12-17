package unidad4.ejemplos.puntolimpio;

public class EntregaParticular extends Entrega{

	private String dni;
	

	public EntregaParticular(CodigoEntrega codigo, String nombre, double cantidad,String dni) {
		super(codigo, nombre, cantidad);
		
		this.dni = dni;
	}
}
