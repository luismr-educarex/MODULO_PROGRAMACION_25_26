package unidad7.ejemplos.empresa;

public class ConsultorExterno extends ATrabajador implements ITrabajador{
	
	private double tarifa;
	
	public ConsultorExterno(String nombre, double tarifa) {
		super(nombre);
		this.tarifa = tarifa;
	}

	public double getTarifa() {
		return tarifa;
	}

	@Override
	public void establecerBonus(double gratificacion) {
		
		if(gratificacion>0) {
			tarifa+=gratificacion;
			
		}else {
			System.out.println("La gratificación debe se porsitiva");
		}
		
	}


	@Override
	public String toString() {
		return "ConsultorExterno [nombre=" + nombre + ", tarifa=" + tarifa + "]";
	}

	@Override
	public void calcularIRPF() {
		// TODO Auto-generated method stub
		
	}
	
	

	
}






