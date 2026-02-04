package unidad5.ejemplos.materiales;

import java.util.EnumMap;

public class Main2 {

	public static void main(String[] args) {
		
			//Cuando la clave es un enum, EnumMap es la mejor opción
			
		    //EnumMap necesita la clase enum en el contructor
			EnumMap<Material,Integer> camionesPorMaterial =  new EnumMap<>(Material.class);
			
			//Inicialización
			for(Material material: Material.values()) {
				camionesPorMaterial.put(material, 0);
			}

			Material[] materiales = {Material.ARENA,
					Material.CEMENTO,
					Material.ARENA,
					Material.GRAVA,
					Material.CEMENTO,
					Material.ARENA};
			
			Descargador descargador = new Descargador();
			
			try {

				for(Material material: materiales) {
					descargador.descargar(material);				
					/*Integer contador = camionesPorMaterial.get(material);
					contador++;
					camionesPorMaterial.put(material, contador);
					*/
					camionesPorMaterial.put(material, camionesPorMaterial.get(material)+1);
				}
				
				
				System.out.println("------ INFORME FINAL -----");
				for(Material material:Material.values()) {
					System.out.println(material+"-->"+camionesPorMaterial.get(material)+" camiones");
				}
				
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			

	}

}












