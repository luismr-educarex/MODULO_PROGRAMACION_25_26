package unidad7.ejemplos.empresa;

public class Empleado extends ATrabajador implements ITrabajador{
	
	private double sueldo;
	
	public Empleado(String nombre,double sueldo) {
		super(nombre);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	@Override
	public void establecerBonus(double gratificacion) {
		
		if(gratificacion>0) {
			this.sueldo+=gratificacion;
		}else {
			System.out.println("La gratificación debe ser positiva");
		}
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

	@Override
	public void calcularIRPF() {
		
		
	}
	
	

}










