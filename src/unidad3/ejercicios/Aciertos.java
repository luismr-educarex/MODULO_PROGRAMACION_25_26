package unidad3.ejercicios;

import java.util.Scanner;

public class Aciertos {

	static final int LIMITE = 20;
	static final int TOTAL_NUMEROS = 3;
	
	public static void main(String[] args) {
		
		int aleatorio1;
		int aleatorio2;
		int aleatorio3;
		int numero1;
		int numero2;
		int numero3;
		int contadorAciertos=0;
		double tasa;
		
		//Generar 3 números aleatorios entre el 1 y 20
		 aleatorio1 = generarDato();
		 aleatorio2 = generarDato();
		 aleatorio3 = generarDato();
 
		//Pedir,leer de consola y almacenar  
		//3 números entre el 1 y el 20 al usuario
		
	    numero1 = pedirNumero();
		numero2 = pedirNumero();
		numero3 = pedirNumero();
		
		//Saber si ha acertado el usuario
		// aleatorio1 ¿=? numeroUsuario1
		// aleatorio2 ¿=? numeroUsuario2
		// aleatorio3 ¿=? numeroUsuario3
		comprobarHayAciertos(aleatorio1, aleatorio2, aleatorio3, numero1, numero2, numero3);

		contadorAciertos = contarNumeroAciertos(aleatorio1, aleatorio2, aleatorio3, numero1, numero2, numero3);
		
		tasa = calcularTasa(contadorAciertos);
		
		System.out.printf("Tasa de aciertos:%.2f %% ",(tasa*100));
		
		
		//Añadir menú del juego
		// 1.Jugar
		// 2.Salir
	

	}
	
	private static double calcularTasa(int contadorAciertos) {
		
		return (double)contadorAciertos/TOTAL_NUMEROS;
		
	}

	private static int contarNumeroAciertos(int aleatorio1,
			int aleatorio2,
			int aleatorio3,
			int numero1,
			int numero2,
			int numero3) {
		
		
		//Obtener la tasa de aciertos (si hay aciertos)
				int contadorAciertos=0;
				if(aleatorio1==numero1) {
					contadorAciertos++;
				}
				if(aleatorio2==numero2) {
					contadorAciertos++;
				}
				if(aleatorio3==numero3) {
					contadorAciertos++;
				}
				
			return contadorAciertos;
	}
	
	private static void comprobarHayAciertos(int aleatorio1,
			int aleatorio2,
			int aleatorio3,
			int numero1,
			int numero2,
			int numero3) {
		
		if((aleatorio1==numero1)||(aleatorio2==numero2)
				||(aleatorio3==numero3)) {

		System.out.println("Has acertado");
		}else {
		System.out.println("No has acertado");
		}
		
		
	}
	
	private static int generarDato() {
		
		return (int) ((Math.random()*LIMITE)+1);
	}
	
    private static int pedirNumero() {
		
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("Dame número:");
    	
    	return teclado.nextInt();

	}

}










