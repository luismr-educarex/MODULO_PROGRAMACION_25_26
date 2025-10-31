package unidad3.ejemplos.condiciones;

public class Condiciones {

	static final int EDAD_MAYORIA = 18;
	public static void main(String[] args) {
		
		int anioUsuario = 23;
		
		if(anioUsuario>=EDAD_MAYORIA) {
			System.out.println("Es mayor de edad");
		}else{
			System.out.println("Es menor de edad");
		}
		
		int notaProgramacion = 5;
		
		if(notaProgramacion<5) {
			System.out.println("Has obtenido un insuficente");
		}
		if(notaProgramacion==5) {
			System.out.println("Has obtenido un suficiente");
		}
		if(notaProgramacion==6) {
			System.out.println("Has obtenido un bien");
		}
		if(notaProgramacion==7) {
			System.out.println("Has obtenido un notable");
		}
		if(notaProgramacion==8) {
			System.out.println("Has obtenido un notable");
		}
		if(notaProgramacion==9) {
			System.out.println("Has obtenido un sobresaliente");
		}
		if(notaProgramacion==10) {
			System.out.println("Has obtenido un sobresaliente");
		}
		
		if(notaProgramacion<5) {
			System.out.println("Suspenso");
		}else if(notaProgramacion==5) {
			System.out.println("Aprobado");
		}else if(notaProgramacion==6) {
			System.out.println("Bien");
		}else if(notaProgramacion==7 || notaProgramacion==8) {
			System.out.println("Notable");
		}else if(notaProgramacion==9 || notaProgramacion==10) {
			System.out.println("Sobresaliente");
		}else {
			System.out.println("Valor de la nota no válida");
		}
		
		
			
		

	}

}








