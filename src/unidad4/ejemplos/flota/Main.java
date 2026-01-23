package unidad4.ejemplos.flota;

public class Main {

	public static void main(String[] args) {
		
		Flota flota = new Flota();
		
	
		Vehiculo coche = new Coche(1, "4567-HJK", "Audi", "A3", 45000,5,200);
		Vehiculo coche2 = new Coche(7, "4567-HJK", "Audi", "A3", 45000,5,200);
		Vehiculo coche3 = new Coche(8, "4567-HJK", "Audi", "A3", 45000,5,200);
		Vehiculo coche4 = new Coche(9, "4567-HJK", "Audi", "A3", 45000,5,200);
		Vehiculo coche5 = new Coche(10, "4567-HJK", "Audi", "A3", 45000,5,200);
		Vehiculo moto = new Moto(2, "7889-FMN", "Yamaha", "Virago", 7000,180,2,4);
		Vehiculo moto2 = new Moto(5, "7889-FMN", "Yamaha", "Virago", 7000,180,2,4);
		Vehiculo moto3 = new Moto(6, "7889-FMN", "Yamaha", "Virago", 7000,180,2,4);
		Vehiculo furgoneta = new Furgoneta(3, "1128-GBC", "Mercedes", "Transit", 92000,3,2000);
		Vehiculo camion = new Camion(4,"3456-HHJ","IVECO","Pegaso",230000,5,12000);
		
		flota.darAltaVehiculo(coche);
		flota.darAltaVehiculo(moto);
		flota.darAltaVehiculo(furgoneta);
		flota.darAltaVehiculo(camion);
		flota.darAltaVehiculo(coche2);
		flota.darAltaVehiculo(coche3);
		flota.darAltaVehiculo(coche4);
		flota.darAltaVehiculo(coche5);
		flota.darAltaVehiculo(moto2);
		flota.darAltaVehiculo(moto3);
		
		flota.mostrarFlota();
		
		flota.resumenPorTipo();
	}

}














