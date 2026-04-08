package unidad7.ejemplos.productos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparator {

	public static void main(String[] args) {
		
		List<Producto> productos = new ArrayList<>();
		
		productos.add(new Producto("Teclado",25.50));
		productos.add(new Producto("Monitor",125.50));
		productos.add(new Producto("Ratón",15.50));
		productos.add(new Producto("Altavoz",25.50));
		
		//Collections.sort(productos, new ProductoComparator());
		
		productos.sort(ProductoComparators.porPrecioYNombre());
		
		for (Producto producto : productos) {
			System.out.println(producto);
		}

	}

}






