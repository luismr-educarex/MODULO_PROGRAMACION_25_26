package unidad5.ejemplos.recorridos;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main2 {

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
		 
		 ListIterator<String> iterator = equipos.listIterator();
		 while(iterator.hasNext()) {
			 String equipo = iterator.next();
			 System.out.println(equipo);
			 iterator.remove();
			 iterator.set("Sevilla");
			 iterator.add("Sevilla");
		 }
		 

	}

}











