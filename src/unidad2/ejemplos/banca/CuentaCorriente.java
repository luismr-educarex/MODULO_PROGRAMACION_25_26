package unidad2.ejemplos.banca;

public class CuentaCorriente {
	
	private String iban;
	private String titular;
	public double saldo = 0;
	
	public void ingresar(int cantidadIngresar) {
		
		System.out.println("INGRESO");
		if(cantidadIngresar>0) {
			saldo = saldo + cantidadIngresar;
		}else {
			System.out.println("No vayas de listo/a");
		}
		
	}
	
	public void retirar(int cantidadRetirar) {
		
		System.out.println("REINTEGRO");
		saldo = saldo - cantidadRetirar;
		
	}
	
	public void consultarSaldo() {
		
		System.out.println("Saldo actual:"+saldo+"€");
	}

}













