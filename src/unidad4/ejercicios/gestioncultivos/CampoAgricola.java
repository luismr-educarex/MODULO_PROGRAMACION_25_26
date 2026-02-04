package unidad4.ejercicios.gestioncultivos;

import java.util.ArrayList;

public class CampoAgricola {
	
	private ArrayList<Cultivo> cultivos;
	
	public CampoAgricola() {
		cultivos= new ArrayList<Cultivo>();
	}
	
	public void registrarCultivo(Cultivo cultivo) {
		cultivos.add(cultivo);
	}
	
	public Cultivo obtenerMasRentablePorHa() {
		
		Cultivo cultivoMasRentable=null;
		
		return cultivoMasRentable;
	}

}








