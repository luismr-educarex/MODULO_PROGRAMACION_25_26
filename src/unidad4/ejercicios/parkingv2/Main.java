package unidad4.ejercicios.parkingv2;

public class Main {

	public static void main(String[] args) {
		
		Parking parking1 = new Parking(); //5 filas y 4 columnas

		Vehiculo vehiculo = new Vehiculo("1234DCB");
		
		parking1.entradaVehiculo(vehiculo, 2, 3);
		parking1.mostrarEstadoParking();

		
		
		
		

		
	}

}










