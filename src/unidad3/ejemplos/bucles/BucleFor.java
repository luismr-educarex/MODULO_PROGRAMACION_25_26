package unidad3.ejemplos.bucles;

public class BucleFor {

	public static void main(String[] args) {
		
		//inicialización;condición;actualización

		int numero;
		int contador;
		int posicion=1;
		for(int i=1;i<100;i++) {
			
			numero = i+1;
			contador=0;
			
			for(int j=2;j<numero;j++) {
				if(numero%j==0) {
					contador++;
				}	
			}
			if(contador==0) {
				System.out.println(posicion+":"+numero);
				posicion++;
			}
			
			
			
			
			
			
		}

	}

}
