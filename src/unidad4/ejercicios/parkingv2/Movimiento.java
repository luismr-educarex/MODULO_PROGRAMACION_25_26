package unidad4.ejercicios.parkingv2;

import java.time.LocalDateTime;

public class Movimiento {
	
	private TMovimiento tipo;
	private Vehiculo vehiculo;
	private LocalDateTime instante;
	private int fila;
	private int columna;
	
	public Movimiento(TMovimiento tipo, Vehiculo vehiculo,int fila,int columna) {
		super();
		this.tipo = tipo;
		this.vehiculo = vehiculo;
		this.fila=fila;
		this.columna=columna;
		this.instante = LocalDateTime.now();
	}

	public TMovimiento getTipo() {
		return tipo;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public LocalDateTime getInstante() {
		return instante;
	}
	
	public int getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}

	@Override
	public String toString() {
		return "Movimiento [tipo=" + tipo + ", vehiculo=" + vehiculo + ", instante=" + instante + "]";
	}
	
	

	
	
}
