package unidad5.ejemplos.vehiculos.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import unidad5.ejemplos.vehiculos.modelos.Vehiculo;

public class VehiculoService {
	
	private ArrayList<Vehiculo> flota;
	private Map<String,ArrayList<Vehiculo>> mapa = new HashMap<>();

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
	
	public void agruparVehiculoPorTipo() {
		
		for(Vehiculo vehiculo:flota) {
			String tipo = vehiculo.getTipo();
			
			if(!mapa.containsKey(tipo)) {
				mapa.put(tipo, new ArrayList<Vehiculo>());
			}
			
			mapa.get(tipo).add(vehiculo);
		}
	}

	public void mostrarVehiculosPorTipo() {
		
		agruparVehiculoPorTipo();
		
		System.out.println("Vehiculos agrupados por tipo");
		
		for(String tipo: mapa.keySet()) {
			System.out.println(tipo+":");
			for(Vehiculo vehiculo: mapa.get(tipo)) {
				System.out.println(vehiculo);
			}
		}
		
	}
	
	
	

}










