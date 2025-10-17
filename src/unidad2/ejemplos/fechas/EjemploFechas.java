package unidad2.ejemplos.fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class EjemploFechas {

	public static void main(String[] args) {
		
		LocalDate fechaActual = LocalDate.now();
		System.out.println("Fecha actual:"+fechaActual);
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yy");
		System.out.println("Fecha formateada:"+fechaActual.format(formato));
		
		LocalDate fechaEspecifica = LocalDate.of(2025,10,30);
		System.out.println("Fecha especifica:"+fechaEspecifica);
		System.out.println("Fecha formateada:"+fechaEspecifica.format(formato));
		
		LocalTime horaActual = LocalTime.now();
		System.out.println("Hora actual:"+horaActual);
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println("Hora actual formateada:"+horaActual.format(formatoHora));
		
		LocalDateTime fechaHoraActual = LocalDateTime.now();
		System.out.println("Fecha y hora:"+fechaHoraActual);
		
		DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
		System.out.println("Fecha y hora formateada:"+fechaHoraActual.format(formatoFechaHora));
		
		int aleatorioEntreRango = (int) (Math.random()*(7-3+1))+3;
		
		LocalDate fechaFutura = fechaActual.plusDays(aleatorioEntreRango);
		System.out.println("Fecha del examen de programación:"+fechaFutura.format(formato));
		
		
		
	}

}










