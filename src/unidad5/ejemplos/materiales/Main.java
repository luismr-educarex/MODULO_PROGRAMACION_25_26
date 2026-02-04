package unidad5.ejemplos.materiales;

public class Main {

	public static void main(String[] args) {
		
			for(Material m:Material.values()) {
				System.out.println("Material:"+m+"|Tiempo de descarga:"+m.getTiempoDescarga());
			}
			
			Material material = Material.CEMENTO;
			System.out.println("Material del camión:"+material);
			System.out.println("Tiempo de descarga:"+material.getTiempoDescarga());
			
			Descargador descargador = new Descargador();
			
			try {
				descargador.descargar(material);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}

}












