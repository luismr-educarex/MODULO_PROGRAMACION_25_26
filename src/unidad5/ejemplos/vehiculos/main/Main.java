package unidad5.ejemplos.vehiculos.main;

import java.util.ArrayList;

import unidad5.ejemplos.vehiculos.datos.Datos;
import unidad5.ejemplos.vehiculos.modelos.Camion;
import unidad5.ejemplos.vehiculos.modelos.Coche;
import unidad5.ejemplos.vehiculos.modelos.Electrico;
import unidad5.ejemplos.vehiculos.modelos.Moto;
import unidad5.ejemplos.vehiculos.modelos.Vehiculo;
import unidad5.ejemplos.vehiculos.services.VehiculoService;
import unidad5.ejemplos.vehiculos.ui.Menu;

public class Main {

	static final String SEPARADOR = ";";
	
	public static void main(String[] args) {
		
		ArrayList<Vehiculo> flota = cargarVehiculos();
		
		VehiculoService service = new VehiculoService(flota);
		
		Menu menu = new Menu(service);
		
		menu.mostrar();
		
	}

	private static ArrayList<Vehiculo> cargarVehiculos() {
		
		ArrayList<Vehiculo> flota = new ArrayList<Vehiculo>();
		
		for(String linea: Datos.datosVehiculos) {
			
			String[] datos =linea.split(SEPARADOR);
			
			int id = Integer.parseInt(datos[0]);
			String tipo = datos[1];
			String matricula = datos[2];
			String marca = datos[3];
			String modelo = datos[4];
			int datoExtra = Integer.parseInt(datos[5]);
			
			Vehiculo v= null;
			switch(tipo) {
				case "COCHE":
					v = new Coche(id,matricula,marca,modelo,datoExtra); 
				break;
				case "MOTO":
					v = new Moto(id,matricula,marca,modelo,datoExtra); 
				break;
				case "CAMION":
					v = new Camion(id,matricula,marca,modelo,datoExtra); 
				break;
				case "ELECTRICO":
					v = new Electrico(id,matricula,marca,modelo,datoExtra); 
				break;
				
			}
			
			flota.add(v);
			
			
		}
		
		return flota;
	}

}



















