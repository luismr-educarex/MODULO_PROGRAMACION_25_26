package unidad4.ejercicios.parkingv2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ticket {

	private Vehiculo vehiculo;
	private LocalDateTime entrada;
	private DateTimeFormatter formatoFechaHora;
	
	public Ticket(Vehiculo vehiculo, LocalDateTime entrada) {
		super();
		this.vehiculo = vehiculo;
		this.entrada = entrada;
		formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	}
	
	public void mostrar() {
		System.out.println("------ TICKET PARKING ------");
		System.out.println("Vehículo:"+vehiculo.getMatricula());
		System.out.println("Fecha/Hora:"+entrada.format(formatoFechaHora));
	}
	
	
	
	
	
	
}
