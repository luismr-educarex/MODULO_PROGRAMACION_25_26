package unidad5.ejemplos.interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EjemploComboBoxPaises extends JFrame {

    // Declaración de los componentes como atributos de la clase
    private JComboBox<String> cmbPais;   // Lista desplegable de países
    private JLabel            lblBandera; // Etiqueta que mostrará la bandera del país
    private JLabel            lblInfo;    // Etiqueta que mostrará información del país

    public EjemploComboBoxPaises() {

        // Configura la ventana principal
        setTitle("Ejemplo JComboBox - Selector de países");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // -------------------------------------------------------
        // PANEL SUPERIOR: contiene la etiqueta y el JComboBox
        // -------------------------------------------------------
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelSuperior.setBorder(BorderFactory.createTitledBorder("Selecciona un país"));

        // Etiqueta descriptiva junto al desplegable
        panelSuperior.add(new JLabel("País:"));

        // Array con las opciones que aparecerán en el desplegable
        // El tipo genérico <String> indica que solo acepta cadenas de texto
        String[] paises = {"España", "Francia", "Italia", "Alemania", "Portugal"};

        // Crea el JComboBox pasándole el array de opciones
        // Por defecto muestra el primer elemento del array
        cmbPais = new JComboBox<>(paises);

        // Establece el ancho preferido del desplegable en 150px
        cmbPais.setPreferredSize(new Dimension(150, 30));

        // Añade el desplegable al panel superior
        panelSuperior.add(cmbPais);

        // -------------------------------------------------------
        // PANEL CENTRAL: muestra la bandera del país seleccionado
        // -------------------------------------------------------
        JPanel panelCentral = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelCentral.setBorder(BorderFactory.createTitledBorder("Bandera"));

        // Etiqueta que mostrará el emoji de la bandera en tamaño grande
        lblBandera = new JLabel("🇪🇸");

        // Aumenta el tamaño de la fuente para que el emoji se vea grande
        lblBandera.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 48));
        panelCentral.add(lblBandera);

        // -------------------------------------------------------
        // PANEL INFERIOR: muestra información del país seleccionado
        // -------------------------------------------------------
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelInferior.setBorder(BorderFactory.createTitledBorder("Información"));

        // Etiqueta que mostrará la capital del país seleccionado
        // Se inicializa con el valor correspondiente al primer elemento del combo
        lblInfo = new JLabel("Capital: Madrid");
        lblInfo.setForeground(new Color(0, 80, 160));
        lblInfo.setFont(new Font("Arial", Font.BOLD, 14));
        panelInferior.add(lblInfo);

        // -------------------------------------------------------
        // LISTENER DEL JCOMBOBOX
        // -------------------------------------------------------
        // addActionListener detecta cada vez que el usuario cambia la selección
        // getSelectedItem() devuelve el objeto seleccionado como tipo Object
        // Se usa toString() para convertirlo a String y poder compararlo
        cmbPais.addActionListener(e -> {

            // Obtiene el elemento actualmente seleccionado en el desplegable
            String paisSeleccionado = cmbPais.getSelectedItem().toString();

            // Actualiza la bandera y la información según el país seleccionado
            // Se usa switch para ejecutar un bloque distinto por cada opción
            switch (paisSeleccionado) {
                case "España":
                    lblBandera.setText("🇪🇸");
                    lblInfo.setText("Capital: Madrid");
                    break;
                case "Francia":
                    lblBandera.setText("🇫🇷");
                    lblInfo.setText("Capital: París");
                    break;
                case "Italia":
                    lblBandera.setText("🇮🇹");
                    lblInfo.setText("Capital: Roma");
                    break;
                case "Alemania":
                    lblBandera.setText("🇩🇪");
                    lblInfo.setText("Capital: Berlín");
                    break;
                case "Portugal":
                    lblBandera.setText("🇵🇹");
                    lblInfo.setText("Capital: Lisboa");
                    break;
            }
        });

        // -------------------------------------------------------
        // AÑADIR PANELES AL JFRAME
        // -------------------------------------------------------
        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral,  BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);

        // Hace visible la ventana
        setVisible(true);
    }

    // Punto de entrada de la aplicación
    public static void main(String[] args) {

        // Lanza la interfaz en el hilo de eventos de Swing (EDT)
        SwingUtilities.invokeLater(() -> new EjemploComboBoxPaises());
    }
}