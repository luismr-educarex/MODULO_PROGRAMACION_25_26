package unidad5.ejemplos.estructuras.veterinaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		/*for (int i = 0; i < Datos.servicios.length; i++) {
			System.out.println(Datos.servicios[i]);
		}*/
		
		//Lista para almacenar las visitas
		List<Visita> visitasList = new ArrayList<Visita>();
		
		for(String linea: Datos.servicios) {
			String[] partes = linea.split(";");
			Visita visita = new Visita(Integer.parseInt(partes[0]),partes[1],partes[2],
									   Double.parseDouble(partes[3]));
			visitasList.add(visita);
		}
		
		obtenerTotalFacturacion(visitasList);
		
		
		System.out.println("LISTA DE VISITAS");
		for (Visita visita : visitasList) {
			System.out.println(visita);
		}
		
		//Uso de Set
		Set<String> clientesSet = new HashSet<>();
		for (Visita visita : visitasList) {
			clientesSet.add(visita.getCliente());
		}
		
		System.out.println("CLIENTES (Sin duplicados)");
		for (String cliente : clientesSet) {
			System.out.println(cliente);
		}
		
		//Uso de Map
		Map<String,List<Visita>> visitasPorCliente = new HashMap<>();
		for(Visita visita:visitasList) {
			
			if(!visitasPorCliente.containsKey(visita.getCliente())) {
				visitasPorCliente.put(visita.getCliente(), new ArrayList<Visita>());
			}
			visitasPorCliente.get(visita.getCliente()).add(visita);
		}
		
		System.out.println("VISITAS AGRUPADAS POR CLIENTE");
		double facturacionPorCliente =0;
		for(String cliente: visitasPorCliente.keySet()) {
			facturacionPorCliente=0;
			System.out.println("Cliente:"+cliente);
			for(Visita visita:visitasPorCliente.get(cliente)) {
				System.out.println(" - "+visita);
				facturacionPorCliente += visita.getPrecio();
			}
			
			System.out.println("Facturación:"+facturacionPorCliente+"€");
			
		}
		
		
		//Organizamos por SERVICIO
		Map<String,List<Visita>> visitasPorServicio = new HashMap<>();
		
		
	}

	private static void obtenerTotalFacturacion(List<Visita> visitasList) {
		
		double total = 0;
		for (Visita visita : visitasList) {
			total += visita.getPrecio();
		}
		
		System.out.println("$$$$$  TOTAL FACTURADO:"+total+"€");
		
	}

}
