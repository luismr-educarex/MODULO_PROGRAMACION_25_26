package unidad4.ejemplos.puntolimpio;

public class Main {

	public static void main(String[] args) {
		
		Residuo residuoPlastico = new Residuo("Plástico");
		Residuo residuoPapel = new Residuo("Papel");
		Residuo residuoVidrio = new Residuo("Vidrio");
		
		CodigoEntrega codigoEntrega = new CodigoEntrega("123-PL");
		CodigoEntrega codigoEntrega2 = new CodigoEntrega("987-PL");
		
		Entrega entregaEmpresa = new Entrega(codigoEntrega,true,"RECIEX","483872CC",200);
		Entrega entregaParticular = new Entrega(codigoEntrega2,false,"Michael","32323232H",10);

		
		
		// Se introducen los datos, se validan....
		
		residuoPlastico.registrarEntrega(300);
		residuoPlastico.registrarEntrega(100);
		residuoPlastico.registrarEntrega(600);
		residuoPlastico.registrarEntrega(700);
		residuoPlastico.registrarEntrega(entregaEmpresa);
		residuoPlastico.registrarEntrega(entregaParticular);
		
		
		System.out.println(residuoPlastico);
		System.out.println("Media plástico:"+residuoPlastico.obtenerMedia());

		

	}

}
