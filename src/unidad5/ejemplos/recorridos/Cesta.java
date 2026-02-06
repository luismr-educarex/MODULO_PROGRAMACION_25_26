package unidad5.ejemplos.recorridos;

import java.util.ArrayList;
import java.util.List;

public class Cesta {

	
	List<Producto> listaCompra = new ArrayList<>();
	
	public boolean addProducto(Producto producto) {
		
		return listaCompra.add(producto);
	}

	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double calcularMedia() {
		// TODO Auto-generated method stub
		return 0;
	}
}
