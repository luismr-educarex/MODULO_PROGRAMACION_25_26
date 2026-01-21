package unidad4.ejercicios.hospital;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Laboratorio pfizer = new Laboratorio(1, "Pfizer", "Madrid", "912342345");
		
		Farmaco ibuprofeno = new Farmaco(1, "Ibuprofeno", 600, LocalDate.of(2026, 12, 26),2.5);
		
		Medico medico = new Medico(1, "Dra. García Palomares", "Traumatología", "654321123", "Hospital Campo Arañuelo");
		
		Paciente paciente = new Paciente(1, "Lucas Torres", LocalDate.of(2000, 4, 14));
		
		Receta receta = new Receta(1, LocalDate.now());
		
		Ingreso ingreso = new Ingreso(1, LocalDate.now(), "Lesión en ligamento cruzado");
		
		
	}

}
