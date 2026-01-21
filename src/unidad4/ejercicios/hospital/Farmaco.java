package unidad4.ejercicios.hospital;

import java.time.LocalDate;

public class Farmaco {
	
	private int codigo;
	private String nombre;
	private double dosisRecomendada;
	private LocalDate fechaCaducidad;
	private double precio;
	private Laboratorio laboratorio;
	
	
	
	public Farmaco(int codigo, String nombre, double dosisRecomendada, LocalDate fechaCaducidad, double precio,
			Laboratorio laboratorio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.dosisRecomendada = dosisRecomendada;
		this.fechaCaducidad = fechaCaducidad;
		this.precio = precio;
		this.laboratorio = laboratorio;
	}

	public Farmaco(int codigo, String nombre, double dosisRecomendada, LocalDate fechaCaducidad, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.dosisRecomendada = dosisRecomendada;
		this.fechaCaducidad = fechaCaducidad;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	
	

}
