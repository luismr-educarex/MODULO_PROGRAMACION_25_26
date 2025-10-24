package unidad2.ejemplos.mates;

public class Matematicas {

	public static void main(String[] args) {
		
		System.out.println("Mínimo:"+Math.min(45, 282828));
		System.out.println("Máximo:"+Math.max(45, 282828));
		System.out.println("Potecia:"+Math.pow(2, 3));
		System.out.println("Raíz cuadrada:"+Math.sqrt(25));
		System.out.println("Redondeo hacia arriba:"+Math.ceil(4.0001));
		System.out.println("Redondeo hacia abajo:"+Math.floor(4.9));
		System.out.println("Aleatorio (0.0-1.0):"+Math.random());
		
		System.out.println();
		double aleatorio = Math.random();
		System.out.println("Aleatorio generado:"+aleatorio);
		double aleatorio_100 = aleatorio*100;
		System.out.println("Aleatorio generado 100:"+aleatorio_100);
		int aleatorioFinal_100 = (int)aleatorio_100;
		System.out.println("Aleatorio final(0-100):"+aleatorioFinal_100);
		double aleatorio_10 = aleatorio*10;
		int aleatorioFinal_10 = (int)aleatorio_10;
		System.out.println("Aleatorio final(0-10):"+aleatorioFinal_10);
		
		int min = 20;
		int max = 50;
		
		int aleatorioEntreRango = (int) (Math.random()*(max-min+1))+min;
		System.out.println("Aleatorio entre "+min+" y "+max+":"+aleatorioEntreRango);
		
		
		
		
		
		
	}

}





