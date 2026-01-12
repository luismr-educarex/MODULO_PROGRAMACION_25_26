package unidad4.ejercicios.banca;

import java.util.ArrayList;

public class Cliente {

	private String idCliente;
	private String nombre;
	private String email;
	private ArrayList<Cuenta> cuentas;

	
	
	public Cliente(String idCliente, String nombre, String email) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.email = email;
		cuentas=new ArrayList<Cuenta>();
		
	}
	
	public void abrirCuenta(Cuenta cuenta) {
		cuentas.add(cuenta);
	}
	
	


	public String getIdCliente() {
		return idCliente;
	}




	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", email=" + email 
				+ "]";
	}
	
	
	
	
	
}
