package unidad4.ejemplos.puntolimpio;

public class CodigoEntrega {
	
	private String codigo;
	private String tipo;
	
	public CodigoEntrega(String codigo) {
		this.codigo = codigo.trim();
		//validar
		this.tipo = obtenerTipo();
	}

	private String obtenerTipo() {
		
		String sufijo = codigo.substring(4);
		
		if(sufijo.equalsIgnoreCase("PL")) {
			tipo = "PL";
		}
		else if(sufijo.equalsIgnoreCase("PA")) {
			tipo = "PA";
		}
		else if(sufijo.equalsIgnoreCase("VI")) {
			tipo = "VI";
		}
		else {
			tipo = "XX";
		}
		return tipo;
	}
	
	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "CodigoEntrega [codigo=" + codigo + ", tipo=" + tipo + "]";
	}
	
	
	
	
	
	
	
	

}
