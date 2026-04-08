package unidad7.ejercicios;

public class Juego {

	public static void main(String[] args) {
		
		Donatelo donatelo = new Donatelo("Donatelo",30,30,"Bastón madera");
		Leonardo leonardo = new Leonardo();
		Bebop bebop = new Bebop();
		
		donatelo.correr();
		leonardo.correr();
		
		System.out.println(donatelo);
		System.out.println(leonardo);
		
		int vidaJugador1=3000;
		int vidaJugador2=3000;
		int numGolpes=0;
		
		for(int i=0;i<4;i++) {
			try {
				Thread.sleep(1000);
	
				numGolpes = Simulacion.simularGolpes();
				vidaJugador2-=leonardo.golpear()*numGolpes;
				numGolpes = Simulacion.simularGolpes();
				vidaJugador1-=bebop.golpear()*numGolpes;
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("Vida jugador 1:"+vidaJugador1);
		System.out.println("Vida jugador 2:"+vidaJugador2);

	}

}
