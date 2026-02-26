package unidad5.ejemplos.interfaces;

import javax.swing.*;
import java.awt.*;

public class EjemploBorderLayout {

    public static void main(String[] args) {

        // Crea la ventana principal con el título "BorderLayout"
        JFrame ventana = new JFrame("BorderLayout");

        // Establece el tamaño de la ventana: 400px de ancho y 300px de alto
        ventana.setSize(400, 300);

        // Indica que al cerrar la ventana, la aplicación termine por completo
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Aplica BorderLayout como gestor de diseño
        // Divide la ventana en 5 zonas: NORTH, SOUTH, EAST, WEST y CENTER
        ventana.setLayout(new BorderLayout());

        // Añade un botón en la zona superior (NORTH)
        ventana.add(new JButton("Arriba"), BorderLayout.NORTH);

        // Añade un botón en la zona central (CENTER)
        // Esta zona ocupa todo el espacio que no ocupan las demás
        ventana.add(new JButton("Centro"), BorderLayout.CENTER);

        // Añade un botón en la zona inferior (SOUTH)
        ventana.add(new JButton("Abajo"), BorderLayout.SOUTH);
        
       //Añade un botón en la zona derecha (EAST)
        ventana.add(new JButton("Derecha"), BorderLayout.EAST);
        
      //Añade un botón en la zona izquierda (WEST)
        ventana.add(new JButton("Izquierda"), BorderLayout.WEST);

        // Hace visible la ventana
        ventana.setVisible(true);
    }
}