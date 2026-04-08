package unidad7.ejemplos.productos;

public class Producto implements Comparable<Producto>{
	
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

	@Override
	public int compareTo(Producto otroProducto) {

		if(this.precio>otroProducto.getPrecio()) {
			return 1;
		}else if(this.precio<otroProducto.getPrecio()) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	
	
	
	
	

}












