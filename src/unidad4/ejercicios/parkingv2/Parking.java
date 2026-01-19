package unidad4.ejercicios.parkingv2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Parking {

	private static final int FILAS = 10;
	private static final int COLUMNAS = 10;
	private ArrayList<Plaza> plazas;
	private ArrayList<Movimiento> historial;
	
	public Parking() {
		inicializarPlazas();
		historial = new ArrayList<Movimiento>();
	}
	
	private void inicializarPlazas() {
		plazas = new ArrayList<Plaza>();
		
		for(int i=0;i<FILAS;i++) {
			for(int j=0;j<COLUMNAS;j++){
				TPlaza tipoPlaza = TPlaza.NORMAL;
				
				if(i==0) {
					tipoPlaza = TPlaza.MINUSVALIDO;
				}else if(i==1) {
					tipoPlaza = TPlaza.FAMILIA;
				}
				else if(i==2) {
					tipoPlaza = TPlaza.MOTO;
				}
				else if(i==3) {
					tipoPlaza = TPlaza.CARGA_ELECTRICA;
				}
				else if(i==4) {
					tipoPlaza = TPlaza.EMERGENCIAS;
				}
				
				plazas.add(new Plaza(i,j,tipoPlaza));
			}
		}
		
	}

	public Parking(int filas,int columnas) {
		inicializarPlazas();
		historial = new ArrayList<Movimiento>();
	}
	
	public Ticket entradaVehiculo(Vehiculo vehiculo,int fila,int columna) {

		Plaza plaza = obtenerPlaza(fila, columna);
		Ticket ticket = null;
		
		if(plaza ==null) {
			System.out.println("Plaza no existe");
		}
		if(plazaOcupada(fila,columna)) {
			System.out.println("Plaza ocupada");
		}else {
			historial.add(new Movimiento(TMovimiento.ENTRADA, vehiculo, fila, columna));
			  System.out.println("Entrada en plaza ("+fila+","+columna+")");
			  
			  ticket =new Ticket(vehiculo, LocalDateTime.now());
		}
		
		return ticket;
		
	}
	
	public TicketSalida salidaVehiculo(Vehiculo vehiculo,int fila,int columna) {
		
		TicketSalida ticket = null;
		
		Movimiento ultimaEntrada = buscarUltimaEntrada(vehiculo);
		Movimiento salida = registrarSalida(vehiculo,ultimaEntrada);
		
		ticket = new TicketSalida(vehiculo, ultimaEntrada.getInstante(), salida.getInstante());

		return ticket;
		  
	}
	
	private Movimiento registrarSalida(Vehiculo vehiculo, Movimiento ultimaEntrada) {
		
		
		Movimiento salida = new Movimiento(TMovimiento.SALIDA, vehiculo, ultimaEntrada.getFila(), ultimaEntrada.getColumna());
		historial.add(salida);
		
		return salida;
	}

	private Movimiento buscarUltimaEntrada(Vehiculo vehiculo) {
		
		Movimiento movimiento=null;
		
		for(Movimiento m:historial) {
			if(m.getVehiculo().getMatricula().equals(vehiculo.getMatricula())) {
				int fila = m.getFila();
				int columna = m.getColumna();
				if(plazaOcupada(fila, columna)) {
					movimiento = m;
				}
			}
		}
		
		return movimiento;
	}

	public void mostrarEstadoParking() {
		
		System.out.println("ESTADO DEL PARKING");
		
		for(int i=0;i<FILAS;i++) {
			for(int j=0;j<COLUMNAS;j++) {
				
				Plaza plaza = obtenerPlaza(i,j);
				boolean ocupada = plazaOcupada(i,j);
				
				if(ocupada) {
					System.out.print("\u001B[31m[🚗]\u001B[0m");
				}else {
					
					switch(plaza.getTipo()) {
					  case MINUSVALIDO -> System.out.print("\u001B[34m[D]\u001B[0m");
					  case FAMILIA -> System.out.print("\u001B[33m[F]\u001B[0m");
					  case MOTO -> System.out.print("[M]");
					  case CARGA_ELECTRICA -> System.out.print("\u001B[32m[E]\u001B[0m");
					  case EMERGENCIAS -> System.out.print("\u001B[35m[M]\u001B[0m");
					  default -> System.out.print("[ ]");
					} 

				}
				System.out.print("");
			} // "Se termina una fila"
			System.out.println();
		}
		
	}
	
	private boolean plazaOcupada(int fila, int columna) {
		
		TMovimiento ultimo = null;
		
		for(Movimiento m:historial) {
			if(m.getFila()==fila & m.getColumna()==columna) {
				ultimo = m.getTipo();
			}
		}
		
		return ultimo==TMovimiento.ENTRADA;
	}

	private Plaza obtenerPlaza(int fila, int columna) {
		Plaza plaza = null;
		
		for(Plaza p: plazas) {
			if(p.getFila()==fila && p.getColumna()==columna) {
				plaza = p;	
			}
		}
		
		return plaza;
		
	}

	public void mostrarInfoParking() {
		
	}
	
	public void mostrarHistorial() {
		System.out.println("\nHistorial de movimientos");
		for(Movimiento movimiento:historial) {
			System.out.println(movimiento);
		}
		
	}
	
}

















