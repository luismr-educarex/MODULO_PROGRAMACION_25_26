package unidad4.ejercicios.hospital;

import java.time.LocalDate;

public class Paciente {
	
	private int id;
	private String nombre;
	private LocalDate fechaNacimiento;
	private Medico medico;
	
	
	public Paciente(int id, String nombre, LocalDate fechaNacimiento, Medico medico) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.medico = medico;
	}


	public Paciente(int id, String nombre, LocalDate fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNombre() {
		return nombre;
	}
	
	
	

	

}
