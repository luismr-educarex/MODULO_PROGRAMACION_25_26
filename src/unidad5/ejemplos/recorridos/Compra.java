package unidad5.ejemplos.recorridos;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	public static void main(String[] args) {
		
		
		Cesta cesta = new Cesta();
		
		Producto leche = new Producto("Leche",1);
		Producto tomate = new Producto("Tomate",1.4);
		Producto macarrones = new Producto("Macarrones",2);
		Producto lubina = new Producto("Lubina",6);
		Producto salmon = new Producto("Salmón",8);
		Producto esparragos = new Producto("Espárragos",3.4);
		
		
		cesta.addProducto(leche);
		cesta.addProducto(tomate);
		cesta.addProducto(macarrones);
		cesta.addProducto(lubina);
		cesta.addProducto(salmon);
		cesta.addProducto(esparragos);
		
		//OPCION 1 ----> NO
		double precioCesta = calcularPrecio(cesta);
		double mediaCesta = calcularMedia(cesta);
		
		//OPCION 2 ----> Sí
		precioCesta = cesta.calcularPrecio();
		mediaCesta = cesta.calcularMedia();
		
		//OPCION 3 ----> Sí
		Calculadora calculadora = new Calculadora();
		precioCesta = calculadora.calcularPrecio(cesta);
		mediaCesta = calculadora.calcularMedia(cesta);
		
		
		
		
		
	}

	private static double calcularMedia(Cesta cesta) {
		
		return 0;
	}

	private static double calcularPrecio(Cesta cesta) {
		
		
		return 0;
	}

}
