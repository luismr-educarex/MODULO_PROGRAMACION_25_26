package unidad4.ejercicios.parking;

public class Main {

	public static void main(String[] args) {
		
		Parking parking1 = new Parking(); //5 filas y 4 columnas
		Parking parking2 = new Parking(10,10);
		Parking parking3 = new Parking(20,30);
		
		Vehiculo vehiculo1 = new Vehiculo("4567-HKF");
		Vehiculo vehiculo2 = new Vehiculo("3377-NKJ");
		Vehiculo vehiculo3 = new Vehiculo("1109-FJH");
		
		parking1.mostrarEstadoParking();
		parking2.mostrarEstadoParking();
		parking3.mostrarEstadoParking();
		
		parking1.entradaVehiculo(vehiculo1, 1, 2);
		parking1.entradaVehiculo(vehiculo2, 0, 3);
		
		parking1.mostrarEstadoParking();
		//parking1.mostrarInfoParking();
		parking1.entradaVehiculo(vehiculo3, 1, 2);
		parking1.mostrarEstadoParking();
		
		parking1.entradaVehiculo(vehiculo3, 2, 2);
		parking1.mostrarEstadoParking();
		
		parking1.salidaVehiculo(vehiculo2, 0, 3);
		parking1.mostrarEstadoParking();
		
		
		parking1.entradaVehiculo(vehiculo2, 3, 3);
		parking1.mostrarEstadoParking();
		
		parking1.salidaVehiculo(vehiculo2, 3, 3);
		parking2.entradaVehiculo(vehiculo2, 1, 3);
		
		parking1.mostrarHistorial();

		
	}

}










