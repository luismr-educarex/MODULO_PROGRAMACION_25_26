package unidad7.ejemplos.empresa;

public abstract class ATrabajador {
	
	public static final double IRPF = 14;
	protected String nombre;
	
	public ATrabajador(String nombre) {
		super();
		this.nombre = nombre;
	}


	public abstract void calcularIRPF();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static double getIrpf() {
		return IRPF;
	}
	
		
		
	

}
