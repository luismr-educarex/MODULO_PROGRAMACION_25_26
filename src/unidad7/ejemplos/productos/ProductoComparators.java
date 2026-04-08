package unidad7.ejemplos.productos;

import java.util.Comparator;

public class ProductoComparators {
	
	public static Comparator<Producto> porPrecioYNombre(){
		
		return Comparator.comparingDouble(Producto::getPrecio).thenComparing(Producto::getNombre);
	}

}
