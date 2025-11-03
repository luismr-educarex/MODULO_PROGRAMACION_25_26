package unidad3.ejemplos.bucles;

public class BucleWhile {

	public static void main(String[] args) {
		
		System.out.println("Bucle for");
		//Inicialización;Condición;Actualización
		for(int i=0;i<10;i++) {
			System.out.println("Número:"+i);
		}
		
		System.out.println("Bucle while");
		int i=0; //Inicialización
		while(i<10) { //Condición
			
			System.out.println("Número:"+i);
			i++; //Actualización
		}

	}

}
