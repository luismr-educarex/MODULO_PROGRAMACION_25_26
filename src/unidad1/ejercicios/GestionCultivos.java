package unidad1.ejercicios;

import java.util.Scanner;

public class GestionCultivos {
	
	static final int KG_TONELADA = 1000;

	public static void main(String[] args) {
		
		String cultivo="";
		double cantidadTotal=0; //kg
		double hectareas=0;
		float precioCampoKG = 0.14f;
		

		Scanner lectorConsola = new Scanner(System.in);
		System.out.println("Introduzca el nombre del cultivo");
		cultivo = lectorConsola.nextLine();
		System.out.println("Introduzca la producción total (kg)");
		cantidadTotal = lectorConsola.nextDouble();
		System.out.println("Introduzca la superficie en hectáreas");
		hectareas = lectorConsola.nextDouble();
		System.out.println("Introduzca el dia");
		int dia = lectorConsola.nextInt();
		System.out.println("Introduzca el precio por kg"); //NUEVO
		float precioKg = lectorConsola.nextFloat();  //NUEVO
		System.out.println("Introduzca el % de producción  "); //NUEVO
		
		

		double produccionHa =cantidadTotal/hectareas;
		double produccionTHa = produccionHa/KG_TONELADA;
		double beneficio = cantidadTotal*precioKg; //NUEVO
		
		System.out.print("------Estudio de producción-----\n");
		System.out.println("Cultivo:"+cultivo);
		System.out.println("Cantidad producto:"+cantidadTotal+" kg");
		System.out.println("Hectáreas:"+hectareas);
		System.out.printf("Producción de hoy %d de %s:%.2f(kg/Ha)\n",dia,cultivo,produccionHa);
		System.out.printf("Producción por THa:%.2f\n",produccionTHa);
		System.out.printf("Beneficio:%.2f\n\n",beneficio); //NUEVO
		
		System.out.println("---------------------------------");
		
		lectorConsola.close();
		
		
	}

}
