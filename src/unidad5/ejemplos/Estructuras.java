package unidad5.ejemplos;

import java.util.ArrayList;

/**
 * Array  -> Estática
 * ArrayList -> Dinámica
 */
public class Estructuras {

	public static void main(String[] args) {
		
		//Creación 
		int[] arrayEdades = new int[5];
		ArrayList<Integer> listaEdades = new ArrayList<Integer>();

		//Inicialización
		int[] arrayEdadesInicial = {18,20,22,45,33};
		
		arrayEdades[0]=18;
		arrayEdades[1]=20;
		arrayEdades[2]=22;
		arrayEdades[3]=45;
		arrayEdades[4]=33;
	
		listaEdades.add(18);
		listaEdades.add(20);
		listaEdades.add(22);
		listaEdades.add(45);
		listaEdades.add(33);
		
		//Acceso a la información
		System.out.println("Edad de la primera persona:"+arrayEdades[0]);
		System.out.println("Edad de la primera persona:"+listaEdades.get(0));
		
		//Actualizar la información
		arrayEdades[1]=23;
		listaEdades.add(1, 23); //Desplazamiento
		listaEdades.set(1, 23); // Sustitución

		//Eliminar
		arrayEdades[2] = -1;
		arrayEdades[2] = 0;
		listaEdades.remove(2);
		
		//Recorrido
		System.out.println("\nContenido array");
		for(int i=arrayEdades.length-1;i>=0;i--) {
			System.out.print(arrayEdades[i]+" ");
			
		}
		System.out.println("\nContenido arrayList");
		for(int i=0;i<listaEdades.size();i++) {
			System.out.print(listaEdades.get(i)+" ");
		}
		System.out.println("\nContenido arrayList");
		for(Integer elemento:listaEdades) {
			System.out.print(elemento+" ");
		}
		
		
		
	}

}















