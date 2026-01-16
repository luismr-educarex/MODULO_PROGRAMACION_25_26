package unidad4.ejercicios.parking;

import java.time.chrono.ThaiBuddhistChronology;
import java.util.ArrayList;

public class Parking {

	private Plazas plazas;
	private ArrayList<Movimiento> historial;
	
	public Parking() {
		plazas = new Plazas();
		historial = new ArrayList<Movimiento>();
	}
	
	public Parking(int filas,int columnas) {
		plazas = new Plazas(filas,columnas);
		historial = new ArrayList<Movimiento>();
	}
	
	public void entradaVehiculo(Vehiculo vehiculo,int fila,int columna) {

		if(plazas.ocuparPlaza(fila, columna, vehiculo)){
			historial.add(new Movimiento(TMovimiento.ENTRADA,vehiculo));
			System.out.println("Entrada registrada"+vehiculo);
		}else {
			System.err.println("Plaza ocupada");
		}
	}
	
	public void salidaVehiculo(Vehiculo vehiculo,int fila,int columna) {
		if(plazas.liberarPlaza(fila, columna)) {
			historial.add(new Movimiento(TMovimiento.SALIDA,vehiculo));
			System.out.println("Salida registrada:"+vehiculo);
		}else {
			System.out.println("Plaza ya vacía");
		}
	}
	
	public void mostrarEstadoParking() {
		plazas.mostrarParking();
	}
	
	public void mostrarInfoParking() {
		plazas.mostrarInfoParking();
	}
	
	public void mostrarHistorial() {
		System.out.println("\nHistorial de movimientos");
		for(Movimiento movimiento:historial) {
			System.out.println(movimiento);
		}
		
	}
	
}

















