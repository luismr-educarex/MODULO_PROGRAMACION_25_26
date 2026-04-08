package unidad5.ejemplos.interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

/**
 * Ejercicio Swing: Formulario con tres campos, almacenamiento en array de objetos
 * y guardado en el fichero fijo "personas.txt".
 */
public class FormularioSwing extends JFrame {

    // ── Fichero destino (fijo) ────────────────────────────────────────────────

    private static final String FICHERO = "personas.txt";

    // ── Modelo de datos ───────────────────────────────────────────────────────

    static class Persona {
        private final String nombre;
        private final String apellido;
        private final String email;

        public Persona(String nombre, String apellido, String email) {
            this.nombre   = nombre;
            this.apellido = apellido;
            this.email    = email;
        }

        public String getNombre()   { return nombre;   }
        public String getApellido() { return apellido; }
        public String getEmail()    { return email;    }

        /** Formato de línea que se escribirá en personas.txt */
        @Override
        public String toString() {
            return "Nombre: " + nombre + " | Apellido: " + apellido + " | Email: " + email;
        }
    }

    // ── Estado ────────────────────────────────────────────────────────────────

    private final List<Persona> personas = new ArrayList<>();

    // ── Componentes UI ────────────────────────────────────────────────────────

    private final JTextField txtNombre   = new JTextField(20);
    private final JTextField txtApellido = new JTextField(20);
    private final JTextField txtEmail    = new JTextField(20);

    private final DefaultTableModel tableModel = new DefaultTableModel(
            new String[]{"Nombre", "Apellido", "Email"}, 0) {
        @Override public boolean isCellEditable(int r, int c) { return false; }
    };

    private final JTable tabla     = new JTable(tableModel);
    private final JLabel lblEstado = new JLabel(" ");

    // ── Constructor ───────────────────────────────────────────────────────────

    public FormularioSwing() {
        super("Formulario de Personas -> personas.txt");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        ((JPanel) getContentPane()).setBorder(new EmptyBorder(15, 15, 15, 15));

        add(crearPanelFormulario(), BorderLayout.NORTH);
        add(crearPanelTabla(),      BorderLayout.CENTER);
        add(crearPanelBotones(),    BorderLayout.SOUTH);

        pack();
        setMinimumSize(new Dimension(560, 460));
        setLocationRelativeTo(null);
    }

    // ── Paneles ───────────────────────────────────────────────────────────────

    private JPanel crearPanelFormulario() {
        
    	JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Datos de la persona"));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill   = GridBagConstraints.HORIZONTAL;

        String[]     etiquetas = {"Nombre:", "Apellido:", "Email:"};
        JTextField[] campos    = {txtNombre, txtApellido, txtEmail};

        for (int i = 0; i < etiquetas.length; i++) {
            gbc.gridx = 0; gbc.gridy = i; gbc.weightx = 0;
            panel.add(new JLabel(etiquetas[i]), gbc);
            gbc.gridx = 1; gbc.weightx = 1;
            panel.add(campos[i], gbc);
        }
        return panel;
    }

    private JScrollPane crearPanelTabla() {
        tabla.setRowHeight(22);
        tabla.getTableHeader().setReorderingAllowed(false);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(BorderFactory.createTitledBorder("Registros en memoria"));
        return scroll;
    }

    private JPanel crearPanelBotones() {
        JButton btnAgregar = new JButton("Agregar registro");
        btnAgregar.addActionListener(e -> agregarPersona());

        JButton btnGuardar = new JButton("Guardar en personas.txt");
        btnGuardar.addActionListener(e -> guardarEnFichero());

        JButton btnLimpiar = new JButton("Limpiar campos");
        btnLimpiar.addActionListener(e -> limpiarCampos());

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panelBotones.add(btnAgregar);
        panelBotones.add(btnGuardar);
        panelBotones.add(btnLimpiar);

        // Etiqueta informativa con la ruta absoluta del fichero
        JLabel lblRuta = new JLabel("Fichero: " + new File(FICHERO).getAbsolutePath(),
                SwingConstants.CENTER);
        lblRuta.setFont(lblRuta.getFont().deriveFont(Font.ITALIC, 11f));
        lblRuta.setForeground(Color.GRAY);

        lblEstado.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panelSur = new JPanel(new BorderLayout(0, 2));
        panelSur.add(panelBotones, BorderLayout.NORTH);
        panelSur.add(lblRuta,      BorderLayout.CENTER);
        panelSur.add(lblEstado,    BorderLayout.SOUTH);
        return panelSur;
    }

    // ── Logica ────────────────────────────────────────────────────────────────

    /** Valida campos, crea el objeto Persona y lo agrega al array. */
    private void agregarPersona() {
        String nombre   = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String email    = txtEmail.getText().trim();

        if (nombre.isEmpty() || apellido.isEmpty() || email.isEmpty()) {
            mostrarEstado("Todos los campos son obligatorios.", Color.ORANGE.darker());
            return;
        }

        Persona p = new Persona(nombre, apellido, email);
        personas.add(p);                                           // guarda en el array
        tableModel.addRow(new Object[]{nombre, apellido, email});  // actualiza la tabla

        mostrarEstado("Registro agregado. Total en memoria: " + personas.size(),
                new Color(0, 128, 0));
        limpiarCampos();
    }

    /**
     * Recorre el array de objetos Persona y sobreescribe personas.txt
     * con todos los registros actuales.
     */
    private void guardarEnFichero() {
        if (personas.isEmpty()) {
            mostrarEstado("No hay registros para guardar.", Color.ORANGE.darker());
            return;
        }

        File fichero = new File(FICHERO);

        try (FileWriter fw = new FileWriter(fichero, false)) {  // false = sobreescribir
            fw.write("===== Lista de Personas =====\n\n");
            for (int i = 0; i < personas.size(); i++) {
                fw.write((i + 1) + ". " + personas.get(i).toString() + "\n");
            }
            fw.write("\nTotal: " + personas.size() + " persona(s)\n");

            mostrarEstado(personas.size() + " registro(s) guardados en " + FICHERO,
                    new Color(0, 100, 200));

        } catch (IOException ex) {
            mostrarEstado("Error al escribir el fichero: " + ex.getMessage(), Color.RED);
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtEmail.setText("");
        txtNombre.requestFocus();
    }

    private void mostrarEstado(String msg, Color color) {
        lblEstado.setText(msg);
        lblEstado.setForeground(color);
    }

    // ── Main ──────────────────────────────────────────────────────────────────

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
            catch (Exception ignored) {}
            new FormularioSwing().setVisible(true);
        });
    }
}
