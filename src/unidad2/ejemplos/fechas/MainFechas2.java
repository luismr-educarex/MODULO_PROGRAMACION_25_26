package unidad2.ejemplos.fechas;

public class MainFechas2 {

	public static void main(String[] args) {
		
		Fecha fecha  = new Fecha();
		
		fecha.leerDatos();
		
		fecha.imprimir();
		
		Fecha fecha2 = new Fecha();
		
		fecha2.crearFecha(15, "octubre", 2025);
		
		fecha2.imprimir();
		
		System.out.println("Dia de la fecha 1:"+fecha.obtenerDia());
		
		System.out.println("Dia de la fecha 2:"+fecha2.obtenerDia());


	}

}
