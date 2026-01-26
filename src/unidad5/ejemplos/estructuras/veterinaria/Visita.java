package unidad5.ejemplos.estructuras.veterinaria;

public class Visita {
	
	private int id;
	private String cliente;
	private String servicio;
	private double precio;
	
	public Visita(int id, String cliente, String servicio, double precio) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.servicio = servicio;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public String getCliente() {
		return cliente;
	}

	public String getServicio() {
		return servicio;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Visita [id=" + id + ", cliente=" + cliente + ", servicio=" + servicio + ", precio=" + precio + "]";
	}
	
	
	
	

}
