package unidad4.ejercicios.gestioncultivos;

public class Cultivo {
	
	//Atributos del objeto 
	private String tipo;
	private double superficieHa;
	private double produccionKg;
	private double precioKg;
	
	//Constructor
	public Cultivo(String tipo, double superficieHa, double produccionKg, double precioKg) {
		super();
		this.tipo = tipo;
		this.superficieHa = superficieHa;
		this.produccionKg = produccionKg;
		this.precioKg = precioKg;
	}
	
	public double calcularRendimientoKgHa() {
		return produccionKg/superficieHa;
	}
	
	public double calcularRendimientoToHa() {
		return calcularRendimientoKgHa()/1000;
	}
	
	public double calcularProduccionTotal() {
		return produccionKg*precioKg;
	}
	
	public double calcularProduccionPorHa() {
		return calcularProduccionTotal()/1000;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Cultivo [tipo=" + tipo + ", superficieHa=" + superficieHa + ", produccionKg=" + produccionKg
				+ ", precioKg=" + precioKg + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}










