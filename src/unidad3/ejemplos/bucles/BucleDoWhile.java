package unidad3.ejemplos.bucles;

public class BucleDoWhile {

	public static void main(String[] args) {
		System.out.println("Bucle while");
		int i=0; //Inicialización
		while(i<-1) { //Condición
			
			System.out.println("Número:"+i);
			i++; //Actualización
		}
		
		i=0;
		System.out.println("Bucle do-while");
		do {
			System.out.println("Número:"+i);
			i++;
		} while (i<-1);

	}

}
