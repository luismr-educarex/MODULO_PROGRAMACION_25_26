package unidad2.ejemplos.banca;

public class MainBanca {

	public static void main(String[] args) {
		
		 CuentaCorriente cuentaCorriente =  new CuentaCorriente();
		 
		 cuentaCorriente.consultarSaldo();
		 cuentaCorriente.ingresar(1000);
		 cuentaCorriente.consultarSaldo();
		 cuentaCorriente.retirar(200);
		 cuentaCorriente.consultarSaldo();
		 cuentaCorriente.ingresar(-3000);
		 cuentaCorriente.consultarSaldo();
		 cuentaCorriente.saldo = -3000;
		 cuentaCorriente.consultarSaldo();

	}

}
