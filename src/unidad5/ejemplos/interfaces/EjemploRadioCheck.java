package unidad5.ejemplos.interfaces;

import javax.swing.*;
import java.awt.*;

public class EjemploRadioCheck extends JFrame {
	
	private JRadioButton rdMañana;
	private JRadioButton rdTarde;
	private ButtonGroup grupo;
	private JCheckBox chkPMDM;
	private JCheckBox chkAD; 
	private JLabel lblResultado = new JLabel(" ");

    public EjemploRadioCheck() {

        setTitle("Radio y Check");
        setSize(300, 380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(8, 1, 0, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // -------------------------------------------------------
        // JRADIOBUTTON - Solo se puede seleccionar una opción
        // -------------------------------------------------------
        panel.add(new JLabel("Selecciona tu turno:"));

         rdMañana = new JRadioButton("Mañana");
         rdTarde  = new JRadioButton("Tarde");

        // ButtonGroup agrupa los radio buttons para que sean excluyentes
        grupo = new ButtonGroup();
        grupo.add(rdMañana);
        grupo.add(rdTarde);

        // Marca el primero por defecto
        rdMañana.setSelected(true);

        panel.add(rdMañana);
        panel.add(rdTarde);

        // -------------------------------------------------------
        // JCHECKBOX - Se pueden seleccionar varias opciones a la vez
        // -------------------------------------------------------
        panel.add(new JLabel("Módulos matriculados:"));

         chkPMDM = new JCheckBox("PMDM");
         chkAD   = new JCheckBox("AD");

        panel.add(chkPMDM);
        panel.add(chkAD);

        // -------------------------------------------------------
        // BOTÓN Y ETIQUETA DE RESULTADO
        // -------------------------------------------------------
        JButton boton = new JButton("Ver selección");

        // Etiqueta que mostrará el resumen de las elecciones del usuario
        
        lblResultado.setForeground(new Color(0, 100, 0));

        // Al pulsar el botón se leen los valores de radio y check
        boton.addActionListener(e -> verSeleccion());
        panel.add(boton);
        panel.add(lblResultado);

        add(panel);
        setVisible(true);
    }

    private void verSeleccion() {
		
            // Lee el turno seleccionado comprobando cuál radio está marcado
            // isSelected() devuelve true si el radio button está marcado
            String turno = rdMañana.isSelected() ? "Mañana" : "Tarde";

            // Lee los módulos marcados construyendo un texto con los seleccionados
            // isSelected() devuelve true si el checkbox está marcado
            String modulos = "";
            if (chkPMDM.isSelected()) modulos += "PMDM ";
            if (chkAD.isSelected())   modulos += "AD ";

            // Si no hay ningún módulo marcado muestra un aviso
            if (modulos.isEmpty()) modulos = "ninguno";

            // Muestra el resumen en la etiqueta
            lblResultado.setText("Turno: " + turno + " | Módulos: " + modulos);
       
		
	}

	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EjemploRadioCheck());
    }
}