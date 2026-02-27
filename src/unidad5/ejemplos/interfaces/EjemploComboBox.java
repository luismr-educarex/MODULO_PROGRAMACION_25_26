package unidad5.ejemplos.interfaces;

import javax.swing.*;
import java.awt.*;

public class EjemploComboBox extends JFrame {

    // Declaración de los componentes como atributos de la clase
    private JComboBox<String> cmbCurso;   // Lista desplegable de cursos
    private JLabel            lblResultado; // Etiqueta que muestra el curso elegido

    public EjemploComboBox() {

        // Configura la ventana principal
        setTitle("Ejemplo JComboBox");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crea un panel con GridLayout de 3 filas y 1 columna
        JPanel panel = new JPanel(new GridLayout(3, 1, 0, 10));

        // Añade un margen interior de 15px en los cuatro lados
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Etiqueta descriptiva encima del desplegable
        panel.add(new JLabel("Selecciona tu curso:"));

        // Array con las opciones que aparecerán en el desplegable
        String[] cursos = {"Elige opción","1º DAM", "2º DAM", "1º DAW", "2º DAW"};

        // Crea el JComboBox con las opciones del array
        // Por defecto muestra el primer elemento: "1º DAM"
        cmbCurso = new JComboBox<>(cursos);

        // Listener que se ejecuta cada vez que el usuario cambia la selección
        // getSelectedItem() devuelve la opción elegida y toString() la convierte a String
        cmbCurso.addActionListener(e -> leerOpcion());
           
        // Añade el desplegable al panel
        panel.add(cmbCurso);

        // Crea la etiqueta de resultado con el valor inicial del combo
        lblResultado = new JLabel("");
        lblResultado.setForeground(new Color(0, 100, 0));
        panel.add(lblResultado);

        // Añade el panel a la ventana y la hace visible
        add(panel);
        setVisible(true);
    }

    private void leerOpcion() {
    	 lblResultado.setText("Has elegido: " + cmbCurso.getSelectedItem().toString()+"("+cmbCurso.getSelectedIndex()+")");
         
	}

	// Punto de entrada de la aplicación
    public static void main(String[] args) {

        // Lanza la interfaz en el hilo de eventos de Swing (EDT)
        SwingUtilities.invokeLater(() -> new EjemploComboBox());
    }
}









