package unidad7.ejemplos.productos;

import java.util.Comparator;

public class ProductoPorPrecioComparator implements Comparator<Producto>{

	@Override
	public int compare(Producto p1, Producto p2) {
		
		int resultado = Double.compare(p1.getPrecio(), p2.getPrecio());
		
		return resultado;
	}
}
