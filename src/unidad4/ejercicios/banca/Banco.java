package unidad4.ejercicios.banca;

import java.util.ArrayList;

public class Banco {

	private String idBanco;
	private String nombre;
	private String localizacion;
	private ArrayList<Cliente> clientes;
	
	
	public Banco(String idBanco, String nombre, String localizacion) {
		super();
		this.idBanco = idBanco;
		this.nombre = nombre;
		this.localizacion = localizacion;
		this.clientes = new ArrayList<Cliente>();
	}

	
	public void registrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void mostrarClientes() {
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}
	
	public void mostrarCliente(String idCliente) {
		
		boolean encontrado = false;
		for(int i=0;i<clientes.size() && !encontrado;i++) {
			if(clientes.get(i).getIdCliente().equals(idCliente)) {
				System.out.println(clientes.get(i));
				encontrado=true;
			}
		}
	
	}
	

	@Override
	public String toString() {
		return "Banco [idBanco=" + idBanco + ", nombre=" + nombre + ", localizacion=" + localizacion + "]";
	}


	public String getIdBanco() {
		return idBanco;
	}


	public void setIdBanco(String idBanco) {
		this.idBanco = idBanco;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getLocalizacion() {
		return localizacion;
	}


	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}


	public ArrayList<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	
	
	
	
}










