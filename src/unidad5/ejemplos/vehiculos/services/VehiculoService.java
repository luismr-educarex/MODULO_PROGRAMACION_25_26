package unidad5.ejemplos.vehiculos.services;

import java.util.ArrayList;

import unidad5.ejemplos.vehiculos.modelos.Vehiculo;

public class VehiculoService {
	
	private ArrayList<Vehiculo> flota;

	public VehiculoService(ArrayList<Vehiculo> flota) {
		this.flota = flota;
	}
	
	public void mostrarVehiculos() {
		for(Vehiculo vehiculo:flota) {
			System.out.println(vehiculo);
		}
	}
	
	
	public void mostrarImpuestos() {
		
		//Se usan los métodos sobreescritos
		for(Vehiculo vehiculo: flota) {
			System.out.println("Impuesto:"+vehiculo.getTipo()+"-->"+vehiculo.calcularImpuesto());
		}
	}
	
	public void contarVehiculosPorTipo() {
		
	}
	
	public void sumarImpuestosPorTipo() {
		
		
	}
	
	
	

}










