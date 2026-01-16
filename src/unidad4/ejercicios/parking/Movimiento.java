package unidad4.ejercicios.parking;

import java.time.LocalDateTime;

public class Movimiento {
	
	private TMovimiento tipo;
	private Vehiculo vehiculo;
	private LocalDateTime instante;
	
	public Movimiento(TMovimiento tipo, Vehiculo vehiculo) {
		super();
		this.tipo = tipo;
		this.vehiculo = vehiculo;
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

	@Override
	public String toString() {
		return "Movimiento [tipo=" + tipo + ", vehiculo=" + vehiculo + ", instante=" + instante + "]";
	}
	
	

	
	
}
