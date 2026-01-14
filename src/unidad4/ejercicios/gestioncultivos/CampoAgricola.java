package unidad4.ejercicios.gestioncultivos;

public class CampoAgricola {
	
	private Cultivo cultivo1;
	private Cultivo cultivo2;
	
	public void registrarCultivos(Cultivo c1,Cultivo c2) {
		this.cultivo1=c1;
		this.cultivo2=c2;
	}
	
	public Cultivo obtenerMasRentablePorHa() {
		
		if(cultivo1.calcularProduccionPorHa()>=cultivo2.calcularProduccionPorHa()) {
			return cultivo1;
		}else {
			return cultivo2;
		}
	}

}








