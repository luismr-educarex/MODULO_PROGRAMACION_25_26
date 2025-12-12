package unidad4.ejemplos.puntolimpio;

public class Main {

	public static void main(String[] args) {
		
		Residuo residuoPlastico = new Residuo("Plástico");
		Residuo residuoPapel = new Residuo("Papel");
		Residuo residuoVidrio = new Residuo("Vidrio");
		
		System.out.println(residuoPlastico);
		System.out.println(residuoPapel);
		System.out.println(residuoVidrio);
		
		
		// Se introducen los datos, se validan....
		
		residuoPlastico.registrarEntrega(300);
		residuoPlastico.registrarEntrega(100);
		residuoPlastico.registrarEntrega(600);
		residuoPlastico.registrarEntrega(700);
		
		System.out.println(residuoPlastico);
		System.out.println("Media plástico:"+residuoPlastico.obtenerMedia());
		System.out.println("Media vidrio:"+residuoVidrio.obtenerMedia());
		

	}

}
