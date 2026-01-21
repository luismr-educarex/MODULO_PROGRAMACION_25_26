package unidad4.ejercicios.hospital;

import java.time.LocalDate;

public class Receta {
	
	private int id;
	private LocalDate fecha;
	private Paciente paciente;
	private Medico medico;
	private Farmaco farmaco;
	
	
	
	public Receta(int id, LocalDate fecha, Paciente paciente, Medico medico, Farmaco farmaco) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.paciente = paciente;
		this.medico = medico;
		this.farmaco = farmaco;
	}



	public Receta(int id, LocalDate fecha) {
		super();
		this.id = id;
		this.fecha = fecha;
	}
	
	

	
}
