package unidad4.ejemplos.puntolimpio;

public class Entrega {
	
	private int id;
	private CodigoEntrega codigo;
	private boolean esEmpresa;
	private String nombre;
	private String cif;
	private String dni;
	private double cantidad;
	
	public Entrega(CodigoEntrega codigo, boolean esEmpresa, String nombre, String identificador, double cantidad) {
		super();
		this.codigo = codigo;
		this.esEmpresa = esEmpresa;
		this.nombre = nombre;
		this.cantidad = cantidad;
		if(esEmpresa) {
			this.cif = identificador;
		}else {
			this.dni = identificador;
		}
		
	}

	@Override
	public String toString() {
		
		String info = "Entrega [id=" + id + ", codigo=" + codigo + ",";
		
		info += "nombre=" + nombre;
		
		if(esEmpresa) {
			info += ",cif="+cif;
		}else {
			info += ",dni=" +dni;
		}

		info += ", cantidad=" + cantidad + "]";
		
		return info;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CodigoEntrega getCodigo() {
		return codigo;
	}

	public void setCodigo(CodigoEntrega codigo) {
		this.codigo = codigo;
	}

	public boolean isEsEmpresa() {
		return esEmpresa;
	}

	public void setEsEmpresa(boolean esEmpresa) {
		this.esEmpresa = esEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
	
	
	
	
	
	

}
