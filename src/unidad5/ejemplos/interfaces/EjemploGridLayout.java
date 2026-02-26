package unidad5.ejemplos.interfaces;

import javax.swing.*;
import java.awt.*;

public class EjemploGridLayout {

    public static void main(String[] args) {

        // Crea la ventana principal con el título "GridLayout"
        JFrame ventana = new JFrame("GridLayout");

        // Establece el tamaño de la ventana: 400px de ancho y 300px de alto
        ventana.setSize(400, 300);

        // Indica que al cerrar la ventana, la aplicación termine por completo
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Aplica GridLayout como gestor de diseño
        // Divide la ventana en una cuadrícula de 2 filas y 3 columnas
        // Todos los componentes tendrán el mismo tamaño automáticamente
        ventana.setLayout(new GridLayout(2, 3));

        // Añade 6 botones que se colocan de izquierda a derecha y de arriba a abajo
        // ocupando cada celda de la cuadrícula en orden
        ventana.add(new JButton("1")); // Fila 1, Columna 1
        ventana.add(new JButton("2")); // Fila 1, Columna 2
        ventana.add(new JButton("3")); // Fila 1, Columna 3
        ventana.add(new JButton("4")); // Fila 2, Columna 1
        ventana.add(new JButton("5")); // Fila 2, Columna 2
        ventana.add(new JButton("6")); // Fila 2, Columna 3

        // Hace visible la ventana
        ventana.setVisible(true);
    }
}