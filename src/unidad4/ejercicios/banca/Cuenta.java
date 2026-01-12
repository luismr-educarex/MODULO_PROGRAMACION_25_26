package unidad4.ejercicios.banca;

public class Cuenta {

	private String idCuenta;
	private double balance;
	private TipoCuenta tipo;
	
	
	public Cuenta(String idCuenta, double balance) {
		super();
		this.idCuenta = idCuenta;
		this.balance = balance;
		
	}
	
	public void depositar(double cantidad) {
		if(cantidad>=0) {
			this.balance +=cantidad;
		}
		
	}
	
	public void retirar(double cantidad) {
		
		if(cantidad>0 && cantidad<balance) {
			balance -=cantidad;
		}
	}

	@Override
	public String toString() {
		return "Cuenta [idCuenta=" + idCuenta + ", balance=" + balance + ", tipo=" + tipo + "]";
	}


	
	
	
}










