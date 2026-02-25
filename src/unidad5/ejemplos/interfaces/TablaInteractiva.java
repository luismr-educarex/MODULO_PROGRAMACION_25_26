package unidad5.ejemplos.interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TablaInteractiva {

	// Componentes de la interfaz
	private JTextField nombre;
	private JTextField edad;
	private DefaultTableModel modelo;
	JLabel labelNombre = new JLabel("nombre:");
	JLabel labelEdad = new JLabel("edad:");
	
	
	
	public TablaInteractiva() {
		
		JFrame ventana = new JFrame("Gestión de alumnos");
		ventana.setSize(600,400);
		ventana.setLayout(null);
		
		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(null);
		panelDatos.setBorder(BorderFactory.createTitledBorder("Datos alumno"));
		panelDatos.setBounds(18, 0, 554, 80);

		nombre = new JTextField();
		edad = new JTextField();
		
		JButton botonAgregar = new JButton("Agregar");
		
		labelNombre.setBounds(20, 10, 125, 30);
		nombre.setBounds(20, 40, 125, 30);
		labelEdad.setBounds(180, 10, 125, 30);
		edad.setBounds(180, 40, 100, 30);
		botonAgregar.setBounds(300, 40, 120, 30);
		
		botonAgregar.addActionListener(e ->agregarAlumno());
		
		String[] columnas = {"Nombre","Edad"};
		modelo = new DefaultTableModel(columnas,0);
		JTable tabla = new JTable(modelo);
		
		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setBounds(20, 100, 550, 250);

		panelDatos.add(labelNombre);
		panelDatos.add(labelEdad);
		panelDatos.add(nombre);
		panelDatos.add(edad);
		panelDatos.add(botonAgregar);
		panelDatos.setVisible(true);
		ventana.add(panelDatos);
	
		
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





