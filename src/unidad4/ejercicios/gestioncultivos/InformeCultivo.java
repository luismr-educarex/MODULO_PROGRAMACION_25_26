package unidad4.ejercicios.gestioncultivos;

import java.util.ArrayList;

public class InformeCultivo {
	
   public void mostrarInfomes(ArrayList<Cultivo> cultivos) {
		
		for (Cultivo cultivo : cultivos) {
			mostrarInfome(cultivo);
		}
	}
	
	
	public void mostrarInfome(Cultivo cultivo) {
		
		System.out.println("Informe del cultivo:"+cultivo.getTipo());
		System.out.println("Rendimiento:"+cultivo.calcularProduccionPorHa() +"kg/ha");
		System.out.println("Rendimiento:"+cultivo.calcularRendimientoToHa()+"t/ha");
		System.out.println("Producción total:"+cultivo.calcularProduccionTotal()+"€");
		System.out.println("Producción total por héctarea:"+cultivo.calcularProduccionPorHa()+"€");
		System.out.println("-------------------------------------------------");
	}
	
	public void mostrarComparacion(Cultivo cultivo) {
		System.out.println("Comparación de cultivos");
		System.out.println("Más rentable por hectárea:"+cultivo.getTipo());
	}
	
	

}
