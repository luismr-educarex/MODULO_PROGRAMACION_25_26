package unidad5.ejemplos.materiales;

public class Descargador {
	
	public static void descargar(Material material) throws InterruptedException {
		
		//OPCIÓN 1
		/*
		System.out.println("Iniciando descarga del camión de:"+material);
		if(material==Material.ARENA) {
			Thread.sleep(material.getTiempoDescarga());
		}else if(material==Material.GRAVA) {
			Thread.sleep(material.getTiempoDescarga());
		}else {
			Thread.sleep(material.getTiempoDescarga());
		}
		System.out.println("Descarga finalizada del camión de:"+material);
		*/
		
		//OPCIÓN 2
		System.out.println("Iniciando descarga del camión de:"+material);
			Thread.sleep(material.getTiempoDescarga());
		System.out.println("Descarga finalizada del camión de:"+material);
		
		
		
	}

}
