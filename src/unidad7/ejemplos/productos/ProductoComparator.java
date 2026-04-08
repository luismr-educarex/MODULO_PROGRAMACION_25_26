package unidad7.ejemplos.productos;

import java.util.Comparator;

public class ProductoComparator implements Comparator<Producto>{

	@Override
	public int compare(Producto p1, Producto p2) {
		
		//1. Comparar por precio
		int resultado = Double.compare(p1.getPrecio(), p2.getPrecio());
		
		//2. Si el precio es igual, comparar por nombre
		if(resultado==0) {
			return p1.getNombre().compareTo(p2.getNombre());
		}
		
		return resultado;
	}

}
