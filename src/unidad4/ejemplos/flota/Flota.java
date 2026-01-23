package unidad4.ejemplos.flota;

import java.util.ArrayList;

public class Flota {
	
	private ArrayList<Vehiculo> vehiculos;


	public Flota() {
		super();
		this.vehiculos = new ArrayList<Vehiculo>();
	}

	public void darAltaVehiculo(Vehiculo vehiculo) {
		
		if(vehiculo!=null) { //Existe el vehiculo
			vehiculos.add(vehiculo);
		}

	}

	public void mostrarFlota() {
		
		if(vehiculos.isEmpty()) {
			System.out.println("La flota está vacía");
		}else {
			for(Vehiculo vehiculo:vehiculos) {
				System.out.println(vehiculo);
			}
		}

	}
	
	public void resumenPorTipo() {
		
		int coches=0,motos=0,furgonetas=0,camiones=0;
		
		for(Vehiculo vehiculo:vehiculos) {
			if(vehiculo instanceof Coche) {
				coches++;
			}
			else if(vehiculo instanceof Moto) {
				motos++;
			}else if(vehiculo instanceof Furgoneta) {
				furgonetas++;
			}else if(vehiculo instanceof Camion) {
				camiones++;
			}
		}
		
		System.out.println("Resumen de la flota");
		System.out.println("Coches:"+coches);
		System.out.println("Motos:"+motos);
		System.out.println("Furgonetas:"+furgonetas);
		System.out.println("Camiones:"+camiones);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}









