package unidad5.ejercicios.gestiontemperaturas;

import java.awt.GridBagLayout;
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
	private JTextField ciudad;
	private JTextField mes;
	private JTextField temperatura;
	JLabel labelCiudad = new JLabel("ciudad:");
	JLabel labelMes = new JLabel("mes:");
	JLabel labelTemp = new JLabel("temperatura:");
	private DefaultTableModel modelo;
	
	
	public TablaInteractiva() {
		
		JFrame ventana = new JFrame("Gestión de temperaturas");
		ventana.setSize(600,500);
		ventana.setLayout(null);
		
		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(null);
		panelDatos.setBorder(BorderFactory.createTitledBorder("Datos de la lectura temperatura"));
		panelDatos.setBounds(18, 0, 554, 80);
		
		ciudad = new JTextField();
		mes = new JTextField();
		temperatura = new JTextField();
		
		labelCiudad.setBounds(20, 10, 125, 30);
		ciudad.setBounds(20, 40, 125, 30);
		
		labelMes.setBounds(180, 10, 125, 30);
		mes.setBounds(180, 40, 100, 30);
		
		labelTemp.setBounds(320, 10, 125, 30);
		temperatura.setBounds(320, 40, 100, 30);
		
		JButton botonAgregar = new JButton("Agregar");
		botonAgregar.setBounds(450, 40, 90, 30);
		botonAgregar.addActionListener(e ->agregarAlumno());
		
		JButton botonGrabar = new JButton("Grabar");
		botonGrabar.setBounds(20, 380, 90, 30);
		botonGrabar.addActionListener(e ->agregarAlumno());
		
		String[] columnas = {"Ciudad","Mes","Temperatura"};
		modelo = new DefaultTableModel(columnas,0);
		JTable tabla = new JTable(modelo);
		
		JScrollPane scroll = new JScrollPane(tabla);
		scroll.setBounds(20, 90, 550, 250);
		
		panelDatos.add(labelCiudad);
		panelDatos.add(labelMes);
		panelDatos.add(labelTemp);
		panelDatos.add(ciudad);
		panelDatos.add(mes);
		panelDatos.add(temperatura);
		panelDatos.add(botonAgregar);
		panelDatos.setVisible(true);
		ventana.add(panelDatos);
		ventana.add(botonGrabar);
		ventana.add(scroll);
		
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	private void agregarAlumno() {
		
		String nombre = this.ciudad.getText();
		String edad = this.mes.getText();
		
		modelo.addRow(new Object[] {nombre,edad});
		
		
	}


	public static void main(String[] args) {	
		new TablaInteractiva();

	}

}





