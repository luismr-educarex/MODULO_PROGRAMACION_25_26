package unidad3.ejemplos.condiciones;

public class MainSeleccion {

	public static void main(String[] args) {
		
		int numeroMes;
		
		numeroMes=6;
		
		switch(numeroMes) {
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 días");
				System.out.println("Llamada a la función");
			break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 días");
			break;
			case 2:
				System.out.println("28/29 días");
			break;
			default:
				System.out.println("Valor no válido");
		}
		
		
		
		
		
	
		
	}

}
