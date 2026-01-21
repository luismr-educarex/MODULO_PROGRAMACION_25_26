package unidad4.ejercicios.hospital;

import java.time.LocalDate;

public class Ingreso {
	
	private int id;
	private LocalDate fechaIngreso;
	private String motivo;
	private Paciente paciente;
	
	
	
	
	public Ingreso(int id, LocalDate fechaIngreso, String motivo, Paciente paciente) {
		super();
		this.id = id;
		this.fechaIngreso = fechaIngreso;
		this.motivo = motivo;
		this.paciente = paciente;
	}




	public Ingreso(int id, LocalDate fechaIngreso, String motivo) {
		super();
		this.id = id;
		this.fechaIngreso = fechaIngreso;
		this.motivo = motivo;
	}
	
	

}
