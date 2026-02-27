package unidad5.ejemplos.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaBasica extends JFrame {

    // Declaración de los componentes como atributos de la clase
    // para poder acceder a ellos desde cualquier método
    private JTextField txtNombre;    // Campo de texto para introducir el nombre
    private JButton    btnSaludar;   // Botón que lanza el saludo
    private JLabel     lblResultado; // Etiqueta que muestra el resultado

    // Constructor: se ejecuta al crear un objeto VentanaBasica
    // y se encarga de construir y configurar toda la interfaz
    public VentanaBasica() {

        // Establece el título de la barra superior de la ventana
        setTitle("Ejemplo - Ventana básica");

        // Establece el tamaño de la ventana: 400px de ancho y 200px de alto
        setSize(400, 200);

        // Indica que al cerrar la ventana la aplicación termine por completo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centra la ventana en la pantalla (null = relativo a la pantalla completa)
        setLocationRelativeTo(null);

        // Crea un panel con GridLayout de 3 filas, 2 columnas
        // y 5px de separación horizontal y vertical entre celdas
        JPanel panelCentro = new JPanel(new GridLayout(3, 2, 5, 5));

        // Añade un margen interior de 15px en los cuatro lados del panel
        // para que los componentes no queden pegados al borde
        panelCentro.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Añade la etiqueta descriptiva en la primera celda (fila 1, col 1)
        panelCentro.add(new JLabel("Introduce tu nombre:"));

        // Crea el campo de texto con un ancho sugerido de 20 caracteres
        // y lo añade en la segunda celda (fila 1, col 2)
        txtNombre = new JTextField(20);
        panelCentro.add(txtNombre);

        // Crea el botón y lo añade en la tercera celda (fila 2, col 1)
        btnSaludar = new JButton("Saludar");
        panelCentro.add(btnSaludar);

        // Añade un listener al botón mediante una expresión lambda
        // Equivale a crear una clase anónima con actionPerformed,
        // pero de forma mucho más compacta: (parámetro) -> { instrucciones }
        btnSaludar.addActionListener(e -> saludar()); 

        // Crea la etiqueta de resultado inicialmente vacía
        lblResultado = new JLabel("");

        // Establece el color azul como color por defecto del texto
        lblResultado.setForeground(Color.BLUE);

        // Añade la etiqueta en la cuarta celda (fila 2, col 2)
        panelCentro.add(lblResultado);

        // Añade el panel en la zona central del JFrame (BorderLayout por defecto)
        add(panelCentro, BorderLayout.CENTER);

        // Hace visible la ventana
        setVisible(true);
    }

    private void saludar() {
    	

            // Obtiene el texto del campo y elimina espacios al inicio y al final
            String nombre = txtNombre.getText().trim();

            // Comprueba si el campo está vacío tras eliminar los espacios
            if (nombre.isEmpty()) {

                // Si está vacío, muestra un mensaje de aviso en color rojo
                lblResultado.setText("Por favor, escribe tu nombre.");
                lblResultado.setForeground(Color.RED);

            } else {

                // Si hay nombre, muestra el saludo en color verde oscuro
                // new Color(0, 120, 0) define un verde más oscuro que Color.GREEN
                lblResultado.setText("¡Hola, " + nombre + "!");
                lblResultado.setForeground(new Color(0, 120, 0));
            }
       
	}

	// Punto de entrada de la aplicación
    public static void main(String[] args) {

    	// invokeLater garantiza que la interfaz gráfica se crea y actualiza
        // en el hilo de eventos de Swing (Event Dispatch Thread - EDT)
        // Esto evita errores de concurrencia al manipular componentes visuales
        SwingUtilities.invokeLater(() -> new VentanaBasica());
    }
}