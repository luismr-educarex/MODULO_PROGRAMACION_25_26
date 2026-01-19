package unidad4.ejercicios.parkingv2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TicketSalida {
	
	private static final double PRECIO_MINUTO = 0.10;  
	private Vehiculo vehiculo;
	private LocalDateTime entrada;
	private LocalDateTime salida;
	private long minutos;
	private double importe;
	private DateTimeFormatter formatoFechaHora;
	
	public TicketSalida(Vehiculo vehiculo, LocalDateTime entrada,LocalDateTime salida) {
		super();
		this.vehiculo = vehiculo;
		this.entrada = entrada;
		this.salida = salida;
		this.minutos = Duration.between(entrada, salida).toMinutes();
		this.importe = minutos * PRECIO_MINUTO;
		formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	}
	
	public void mostrar() {
		System.out.println("------ TICKET PARKING ------");
		System.out.println("Vehículo:"+vehiculo.getMatricula());
		System.out.println("Fecha/Hora ENTRADA:"+entrada.format(formatoFechaHora));
		System.out.println("Fecha/Hora SALIDA:"+salida.format(formatoFechaHora));
		System.out.println("Tiempo:"+minutos+" minutos");
		System.out.println("Importe:"+importe+"€");
	}

}






