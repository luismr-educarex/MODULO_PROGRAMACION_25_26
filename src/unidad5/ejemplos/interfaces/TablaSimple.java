package unidad5.ejemplos.interfaces;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TablaSimple {

	public static void main(String[] args) {
		
		
		 JFrame ventana = new JFrame("Tabla de alumn@s");
		 
		 ventana.setSize(500, 500);
		 ventana.setLayout(null);
		 
		 String[] columnas = {"Nombre","Edad","Curso","Nota"};
		 
		 Object[][] datos = {
				 {"Pablo",20,"DAM",5.0},
				 {"Sara",19,"DAW",7.8},
				 {"Pedro",21,"ASIR",6.0},
				 {"Antonio",20,"DAW",4.0},
				 {"Alejandra",31,"DAM",8.0}, 
				 {"Susana",26,"DAW",9.0}, 
				 {"María",19,"DAM",5.0}, 
				 {"Francisco",24,"ASIR",7.0}, 
		 };
		 
		 obtenerMediaNotas(datos);
		 
		 
		 JTable tabla = new JTable(datos,columnas);
		 
		 JScrollPane scroll = new JScrollPane(tabla);
		 
		 scroll.setBounds(0, 0, 500, 300);
		 
		 JButton boton = new JButton("Estadísticas");
		 boton.setBounds(200, 400, 120, 30);
		 
		 
		 ventana.add(scroll);
		 ventana.add(boton);
		 
		 ventana.setVisible(true);
		 
		 ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private static void obtenerMediaNotas(Object[][] datos) {
		
		  double suma=0;
		  for(int i=0;i<datos.length;i++) {
			  suma += (double) datos[i][3];
		  }
		  
		  System.out.println("Media notas:"+(suma/datos.length));
		
	}

}
