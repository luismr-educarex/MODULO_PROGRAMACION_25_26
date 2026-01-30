package unidad5.ejemplos.vehiculos.ui;

import java.util.Scanner;

import unidad5.ejemplos.vehiculos.services.VehiculoService;

public class Menu {

	
	private Scanner teclado;
	private VehiculoService service;
	
	public Menu(VehiculoService service) {
		teclado = new Scanner(System.in);
		this.service = service;
	}
	
	public void mostrar() {
		
		int opcion = 0;
		do {
			
			System.out.println("----------- MENÚ VEHÍCULOS -------");
			System.out.println("1. Mostrar todos los vehiculos");
			System.out.println("2. Mostrar impuestos");
			System.out.println("3. Contar vehículos por tipo");
			System.out.println("4. Sumar impuestos por tipo");
			System.out.println("0. Salir");
			
			opcion = teclado.nextInt();
			
			ejecutar(opcion);
				
		}while(opcion!=0);
	}

	private void ejecutar(int opcion) {
		
		switch (opcion) {
		case 1: 
			service.mostrarVehiculos();
		break;
		case 2:
			service.mostrarImpuestos();
		break;
		case 3:
			service.contarVehiculosPorTipo();
		break;
		case 4:
			service.sumarImpuestosPorTipo();
		break;
		case 0:
			System.out.println("Saliendo...");
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
	}
		
	}

	
}









