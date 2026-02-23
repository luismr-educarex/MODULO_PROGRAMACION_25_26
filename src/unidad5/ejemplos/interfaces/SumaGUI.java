package unidad5.ejemplos.interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SumaGUI {

	public static void main(String[] args) {
		
		
		  JFrame ventana = new JFrame("Calculadora");
		  
		  ventana.setSize(300,300); //ancho x alto
		  
		  ventana.setLayout(null);
		  
		  //Crea dos campos de texto para leer los números
		  JTextField numero1 = new JTextField();
		  JTextField numero2 = new JTextField();
		  JButton boton = new JButton("Sumar");
		  JLabel resultado = new JLabel("Resultado:");
		  
		  //Posicionar los elementos
		  numero1.setBounds(50, 20, 200, 30);
		  numero2.setBounds(50, 60, 200, 30);
		  boton.setBounds(90, 100, 120, 30);
		  resultado.setBounds(50, 140, 200, 30);
		  
		  
		  //Añadir un listener al botón para detectar cuando se pulsa
		  
		  boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try {
					int num1 = Integer.parseInt(numero1.getText());
					int num2 = Integer.parseInt(numero2.getText());
					
					resultado.setText("Resultado:"+(num1+num2));
					
				}catch(NumberFormatException ex) {
					
					numero1.setText("");
					numero2.setText("");
					
					JOptionPane.showMessageDialog(null,"Por favor, introduce solo números enteros", "Error formato",
							JOptionPane.ERROR_MESSAGE);
					
					
				}
				
			}
		});
		  
		  
		  
		  //Añadir todos los componentes a la ventana
		  ventana.add(numero1);
		  ventana.add(numero2);
		  ventana.add(boton);
		  ventana.add(resultado);
		  
		  //Hace visible la ventana
		  ventana.setVisible(true);
		  
		  //Indica que al cerrar la ventana, la aplicación termina por completo.
		  ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  

	}

}
