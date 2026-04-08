package unidad7.ejemplos.productos;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Producto[] productos = new Producto[3];
		
		productos[0] = new Producto("Teclado", 25.50);
		productos[1] = new Producto("Monitor", 125.50);
		productos[2] = new Producto("Ratón", 15.50);
		
		Arrays.sort(productos);
	
		for (Producto producto : productos) {
			System.out.println(producto);
		}
	}

}






