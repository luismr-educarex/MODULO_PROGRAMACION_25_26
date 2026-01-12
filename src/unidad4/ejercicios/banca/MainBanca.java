package unidad4.ejercicios.banca;

public class MainBanca {

	public static void main(String[] args) {

		
		Banco bancoNavalmoral = new Banco("1", "Banco Navalmoral", "Navalmoral");
				
		System.out.println(bancoNavalmoral);
		
		Cliente cliente1 = new Cliente("1", "Mario", "mario@gmail.com");
		Cliente cliente2 = new Cliente("2", "Susana", "susana@gmail.com");	
		Cliente cliente3 = new Cliente("3", "Antonio", "antonio@gmail.com");
		
		bancoNavalmoral.registrarCliente(cliente1);
		bancoNavalmoral.registrarCliente(cliente2);
		bancoNavalmoral.registrarCliente(cliente3);
		
		bancoNavalmoral.mostrarClientes();

		Cuenta cuenta1 = new Cuenta("1", 0);
		cliente1.abrirCuenta(cuenta1);
		
		Cuenta cuenta2 = new Cuenta("2", 0);
		cliente2.abrirCuenta(cuenta2);
		
		Cuenta cuenta3 = new Cuenta("3", 0);
		cliente3.abrirCuenta(cuenta3);
		
		
		  

	}

}








