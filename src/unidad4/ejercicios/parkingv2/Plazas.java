package unidad4.ejercicios.parkingv2;

public class Plazas {
	
	private static final int FILAS=5;
	private static final int COLUMNAS=4;
	
	private Vehiculo[][] ocupaciones;

	public Plazas() {
		ocupaciones = new Vehiculo[FILAS][COLUMNAS];
	}
	public Plazas(int filas,int columnas) {
		ocupaciones = new Vehiculo[filas][columnas];
	}
	
	public boolean ocuparPlaza(int fila,int columna,Vehiculo vehiculo) {
		
		boolean seHaOcupado=false;
		if(ocupaciones[fila][columna]==null) { //LIBRE
			ocupaciones[fila][columna]=vehiculo;
			seHaOcupado =  true;
		}
		return seHaOcupado;
	}
	
	
	public boolean liberarPlaza(int fila,int columna) {
		
		boolean seHaLiberado = false;
		if(ocupaciones[fila][columna]!=null) { //OCUPADA
			ocupaciones[fila][columna] = null;
			seHaLiberado = true;
		}
		return seHaLiberado;
	}
	
	
	public Vehiculo getVehiculo(int fila,int columna) {
	
		return ocupaciones[fila][columna];
				
	}
	
	public void mostrarParking() {
		
		System.out.println("Estado del parking");
		for(int i=0;i<ocupaciones.length;i++) { //recorremos cada fila
			for(int j=0;j<ocupaciones[i].length;j++) { //recorremos cada columna
				if(ocupaciones[i][j]==null) {
					System.out.print("[  ]  ");
				}else {
					System.out.print("[🚗]  ");
				}		
			}
			System.out.println();
			
		}
		/*
		System.out.println("OCUPACIONES");
		for(int i=0;i<FILAS;i++) { //recorremos cada fila
			for(int j=0;j<COLUMNAS;j++) { //recorremos cada columna
				
				if(ocupaciones[i][j]==null) {
					System.out.print("[ ]");
				}else {
					System.out.print("[🚗]");
				}		
			}
			System.out.println();
			
		}*/
		
	}
	
	public void mostrarInfoParking() {
		

		System.out.println("VEHICULOS");
		for (Vehiculo[] vehiculos : ocupaciones) {
			for (Vehiculo vehiculo : vehiculos) {
				if(vehiculo==null) {
					System.out.print("[ ]");
				}else {
					System.out.print("[🚗"+vehiculo.getMatricula()+"]");
				}			
			}
			System.out.println();
		}
		
		
		
	}
	
	
}
















