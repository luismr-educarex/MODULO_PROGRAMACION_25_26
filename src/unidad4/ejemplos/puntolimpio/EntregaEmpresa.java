package unidad4.ejemplos.puntolimpio;

public class EntregaEmpresa extends Entrega{
	private String cif;
	

	public EntregaEmpresa(CodigoEntrega codigo, String nombre, double cantidad,String cif) {
		super(codigo, nombre, cantidad);
		
		this.cif = cif;
	}

	
	
	
	

}
