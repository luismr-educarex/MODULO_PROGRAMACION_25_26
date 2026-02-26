package unidad5.ejemplos.interfaces;

import javax.swing.*;
import java.awt.*;

public class EjemploFlow {

    public static void main(String[] args) {

        // Crea la ventana principal con el título "FlowLayout"
        JFrame ventana = new JFrame("FlowLayout");

        // Establece el tamaño de la ventana: 400px de ancho y 200px de alto
        ventana.setSize(400, 200);

        // Aplica FlowLayout como gestor de diseño
        // Los componentes se colocan de izquierda a derecha en fila
        // Si no caben, pasan automáticamente a la siguiente fila
        // Por defecto los componentes quedan centrados y con 5px de separación
        ventana.setLayout(new FlowLayout());

        // Añade tres botones a la ventana
        // FlowLayout los colocará uno al lado del otro en el orden en que se añaden
        ventana.add(new JButton("Uno"));
        ventana.add(new JButton("Dos"));
        ventana.add(new JButton("Tres"));

        // Hace visible la ventana
        ventana.setVisible(true);

        // Indica que al cerrar la ventana la aplicación termine por completo
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}