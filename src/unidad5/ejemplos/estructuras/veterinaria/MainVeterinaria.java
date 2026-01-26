package unidad5.ejemplos.estructuras.veterinaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainVeterinaria {

	public static void main(String[] args) {
		
		String[] datos = {
			    "1;Pedro López;CONSULTA;45.50",
			    "2;María García;CIRUGIA;350.00",
			    "3;Pedro López;TRATAMIENTO;78.90",
			    "4;Lucía Martín;CONSULTA;40.00",
			    "5;María García;CONSULTA;42.00"
			};
		
		
		/*¿Para qué la usamos?
			Mantener todas las visitas
			Respetar el orden de llegada
			Permitir clientes repetidos
			ArrayList es ideal cuando queremos recorrer datos, 
			mantener orden y no nos importa repetir información.
        */
		
		List<Visita> visitasList = new ArrayList<>();

		for (String linea : datos) {
		    String[] partes = linea.split(";");
		    visitasList.add(new Visita(
		        Integer.parseInt(partes[0]),
		        partes[1],
		        partes[2],
		        Double.parseDouble(partes[3])
		    ));
		}
		
		
		System.out.println("LISTA DE VISITAS:");
		for (Visita v : visitasList) {
		    System.out.println(v);
		}

		/*
		 * ¿Para qué la usamos?
			Obtener la lista única de clientes
			Eliminar duplicados automáticamente
			Set se usa cuando no queremos repeticiones y no nos importa el orden.
		 * 
		 */
		Set<String> clientesSet = new HashSet<>();

		for (Visita v : visitasList) {
		    clientesSet.add(v.getCliente());
		}
		
		
		System.out.println("\nCLIENTES SIN DUPLICADOS:");
		for (String cliente : clientesSet) {
		    System.out.println(cliente);
		}
		
		/*
		 * ¿Para qué la usamos?
			Acceder rápidamente a los datos por clave
			Relacionar un cliente con sus visitas
		 */
		
		Map<String, List<Visita>> visitasPorCliente = new HashMap<>();

		for (Visita v : visitasList) {
		    visitasPorCliente
		        .computeIfAbsent(v.getCliente(), k -> new ArrayList<>())
		        .add(v);
		}
		
		
		System.out.println("\nVISITAS AGRUPADAS POR CLIENTE:");
		for (String cliente : visitasPorCliente.keySet()) {
		    System.out.println(cliente + ":");
		    for (Visita v : visitasPorCliente.get(cliente)) {
		        System.out.println("  - " + v);
		    }
		}







	}

}
