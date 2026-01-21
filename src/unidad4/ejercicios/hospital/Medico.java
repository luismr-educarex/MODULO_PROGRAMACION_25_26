package unidad4.ejercicios.hospital;

public class Medico {
	
	private int id;
	private String nombre;
	private String especialidad;
	private String telefono;
	private String direccion;
	private Centro centro;
	

	public Medico(int id, String nombre, String especialidad, String telefono, String direccion, Centro centro) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.centro = centro;
	}

	public Medico(int id, String nombre, String especialidad, String telefono, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}
	
	


	
}
