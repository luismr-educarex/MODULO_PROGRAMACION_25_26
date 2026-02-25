package unidad5.ejemplos.interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TablaInteractiva {

	// Componentes de la interfaz
	private JTextField nombre;
	private JTextField edad;
	private DefaultTableModel modelo;
	
	
	public TablaInteractiva() {
		
		JFrame ventana = new JFrame("Gestión de alumnos");
		ventana.setSize(600,400);
		ventana.setLayout(null);
		
		nombre = new JTextField();
		edad = new JTextField();
		
		JButton botonAgregar = new JButton("Agregar");
		
		nombre.setBounds(20, 20, 125, 30);
		edad.setBounds(180, 20, 100, 30);
		botonAgregar.setBounds(300, 20, 120, 30);
		
		botonAgregar.addActionListener(e ->agregarAlumno());
		
		String[] columnas = {"Nombre","Edad"};
		modelo = new DefaultTableModel(columnas,0);
		JTable tabla = new JTable(modelo);
		
		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setBounds(20, 70, 550, 250);
		
		
		ventana.add(nombre);
		ventana.add(edad);
		ventana.add(botonAgregar);
		ventana.add(scroll);
		
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	private void agregarAlumno() {
		
		String nombre = this.nombre.getText();
		String edad = this.edad.getText();
		
		modelo.addRow(new Object[] {nombre,edad});
		
		
	}


	public static void main(String[] args) {	
		new TablaInteractiva();

	}

}





