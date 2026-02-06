package unidad5.ejemplos.recorridos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		
		 List<String> equipos = new ArrayList<>();
		 
		 equipos.add("Betis");
		 equipos.add("Real Sociedad");
		 equipos.add("Oviedo");
		 equipos.add("Valencia");
		 
		 for(String equipo: equipos) {
			 System.out.println(equipo);
		 }
		 System.out.println("-----------------------");
		 
		 Iterator<String> iterator = equipos.iterator();
		 while(iterator.hasNext()) {
			 String equipo = iterator.next();
			 System.out.println(equipo);
		 }
		 

	}

}











