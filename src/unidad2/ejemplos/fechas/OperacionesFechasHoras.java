package unidad2.ejemplos.fechas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class OperacionesFechasHoras {

	public static void main(String[] args) {
		
		LocalDate fechaActual = LocalDate.now();
		LocalDate fecha = LocalDate.of(2025, 2, 29);
		System.out.println(fecha);
		
		//Sumar días, semanas, años...
		//Restar días, semanas...
		LocalDate fechaMasDias =  fecha.plusDays(5);
		LocalDate fechaMasSemanas =  fecha.plusWeeks(2);
		LocalDate fechaMasAnios =  fecha.plusYears(3);
		LocalDate fechaMenosMes =  fecha.minusMonths(3);
		
		System.out.println("+5 días:"+fechaMasDias);
		System.out.println("+2 semanas:"+fechaMasSemanas);
		System.out.println("+3 años:"+fechaMasAnios);
		System.out.println("-3 mes:"+fechaMenosMes);
		
		LocalDate fechaInicio = LocalDate.of(2025,10,20);
		LocalDate fechaFinal = LocalDate.of(2024,12,20);
		
		Period periodo =  Period.between(fechaInicio, fechaFinal);
		
		System.out.println("Diferecia en días:"+periodo.getDays());
		
		long diasEntreFechas =  ChronoUnit.DAYS.between(fechaInicio, fechaFinal);
		System.out.println("Diferencia entre días:"+diasEntreFechas);
		
		long mesesEntreFechas = ChronoUnit.MONTHS.between(fechaInicio, fechaFinal);
		System.out.println("Diferencia entre meses:"+mesesEntreFechas);
		
		boolean esAnterior = fechaActual.isBefore(fechaFinal);
		System.out.println("¿La fecha es anterior a hoy?:"+esAnterior);
		boolean esPosterior = fechaActual.isAfter(fechaFinal);
		System.out.println("¿La fecha es postarior a hoy?:"+esPosterior);
		
		
		/* _____________________ HORAS _____________________*/
		
		LocalTime horaActual =  LocalTime.now();
		LocalTime hora =  LocalTime.of(8,59);
		
		LocalTime horaMashoras = hora.plusHours(2);
		LocalTime horaMasMinutos = hora.plusMinutes(25);
		LocalTime horaMasSegundos = hora.plusSeconds(130);
		LocalTime horaMasNanos = hora.plusNanos(1300);
		
		System.out.println("+2 horas:"+horaMashoras);
		System.out.println("+25 minutos:"+horaMasMinutos);
		System.out.println("+130 segundos:"+horaMasSegundos);
		System.out.println("+1300 nanosegundos:"+horaMasNanos);
		
		LocalTime horaInicio = LocalTime.of(10, 15);
		LocalTime horaFinal = LocalTime.of(12, 31);
		
		Duration duracion = Duration.between(horaInicio, horaFinal);
		
		System.out.println("Diferencia en horas:"+duracion.toHours());
		System.out.println("Diferencia en minutos:"+duracion.toMinutes());
		System.out.println("Diferencia en segundos:"+duracion.toSeconds());
		System.out.println("Diferencia en milisegundos:"+duracion.toMillis());
		
		long horasDiferencia = ChronoUnit.HOURS.between(horaInicio, horaFinal);
		System.out.println("Diferencia en horas:"+horasDiferencia);

	}

}






















