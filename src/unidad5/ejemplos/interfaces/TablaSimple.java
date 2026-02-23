package unidad5.ejemplos.interfaces;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablaSimple {

	public static void main(String[] args) {
		
		
		 JFrame ventana = new JFrame("Tabla de alumn@s");
		 
		 ventana.setSize(500, 300);
		 
		 String[] columnas = {"Nombre","Edad","Curso","Nota"};
		 
		 Object[][] datos = {
				 {"Pablo",20,"DAM",5},
				 {"Sara",19,"DAW",7.8},
				 {"Pedro",21,"ASIR",6},
				 {"Antonio",20,"DAW",4},
				 {"Alejandra",31,"DAM",8}, 
				 {"Susana",26,"DAW",9}, 
				 {"María",19,"DAM",5}, 
				 {"Francisco",24,"ASIR",7}, 
		 };
		 
		 JTable tabla = new JTable(datos,columnas);
		 
		 JScrollPane scroll = new JScrollPane(tabla);
		 
		 ventana.add(scroll);
		 
		 ventana.setVisible(true);
		 
		 ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
