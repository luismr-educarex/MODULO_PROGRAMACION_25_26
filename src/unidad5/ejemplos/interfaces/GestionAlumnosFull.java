package unidad5.ejemplos.interfaces;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 * EJERCICIO: Gestión de Alumnos
 * -----------------------------
 * Conceptos que se practican:
 *  - Swing: JFrame, JTable, JTextField, JButton, JComboBox
 *  - Colecciones: List<Alumno> para almacenar, Map<String,String> para módulos
 *  - Ficheros de texto: guardar y cargar con BufferedWriter / BufferedReader
 */
public class GestionAlumnosFull {

    // ── Modelo de datos ───────────────────────────────────────────────────────

    /**
     * Clase interna que representa a un alumno.
     * Atributos: nombre, nota y módulo al que pertenece.
     */
    static class Alumno {
        String nombre;
        double nota;
        String modulo;

        public Alumno(String nombre, double nota, String modulo) {
            this.nombre = nombre;
            this.nota   = nota;
            this.modulo = modulo;
        }

        // Convierte el alumno a una línea de texto para guardar en fichero
        // Formato: nombre;nota;modulo
        public String aLinea() {
            return nombre + ";" + nota + ";" + modulo;
        }

        // Crea un Alumno a partir de una línea de texto leída del fichero
        public static Alumno desdeLinea(String linea) {
            String[] partes = linea.split(";");
            return new Alumno(partes[0], Double.parseDouble(partes[1]), partes[2]);
        }
    }

    // ── Fichero donde se guardarán los datos ──────────────────────────────────
    private static final String FICHERO = "alumnos.txt";

    // ── Colección principal: lista de alumnos ─────────────────────────────────
    // List permite guardar los alumnos en orden de inserción
    private List<Alumno> listaAlumnos = new ArrayList<>();

    // ── Mapa de módulos disponibles ───────────────────────────────────────────
    // Map relaciona el código del módulo con su nombre completo
    // Clave (String) → código    Valor (String) → nombre
    private Map<String, String> modulos = new LinkedHashMap<>();

    // ── Componentes Swing ─────────────────────────────────────────────────────
    private JTextField txtNombre;
    private JTextField txtNota;
    private JComboBox<String> cboModulo;
    private JLabel lblMedia;
    private DefaultTableModel modeloTabla;

    // ── Constructor ───────────────────────────────────────────────────────────
    public GestionAlumnosFull() {
        inicializarModulos();   // Rellena el mapa de módulos
        construirVentana();     // Monta la interfaz gráfica
        cargarDesdeFichero();   // Carga datos previos si existen
    }

    // ── Inicializar el mapa de módulos ────────────────────────────────────────
    /**
     * Se usa un Map para asociar cada código con el nombre del módulo.
     * Así el JComboBox muestra el nombre, pero internamente guardamos el código.
     */
    private void inicializarModulos() {
        modulos.put("PRO", "Programación");
        modulos.put("BDD", "Bases de Datos");
        modulos.put("SIS", "Sistemas Informáticos");
        modulos.put("ENT", "Entornos de Desarrollo");
        modulos.put("LEN", "Lenguajes de Marcas");
    }

    // ── Construir la ventana ──────────────────────────────────────────────────
    private void construirVentana() {
        JFrame ventana = new JFrame("Gestión de Alumnos - 1º DAM");
        ventana.setSize(700, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout(10, 10));
        ((JPanel) ventana.getContentPane()).setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ventana.add(crearPanelFormulario(), BorderLayout.NORTH);
        ventana.add(crearPanelTabla(),      BorderLayout.CENTER);
        ventana.add(crearPanelBotones(),    BorderLayout.SOUTH);

        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    // ── Panel superior: formulario de entrada ─────────────────────────────────
    private JPanel crearPanelFormulario() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Datos del alumno"));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill   = GridBagConstraints.HORIZONTAL;

        // Fila 0 – Nombre
        gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 0;
        panel.add(new JLabel("Nombre:"), gbc);
        txtNombre = new JTextField();
        gbc.gridx = 1; gbc.weightx = 1;
        panel.add(txtNombre, gbc);

        // Fila 0 – Nota (misma fila, columnas 2 y 3)
        gbc.gridx = 2; gbc.weightx = 0;
        panel.add(new JLabel("Nota (0-10):"), gbc);
        txtNota = new JTextField();
        gbc.gridx = 3; gbc.weightx = 0.5;
        panel.add(txtNota, gbc);

        // Fila 1 – Módulo (JComboBox relleno con los valores del Map)
        gbc.gridx = 0; gbc.gridy = 1; gbc.weightx = 0;
        panel.add(new JLabel("Módulo:"), gbc);

        // Convertimos los valores del Map en un array para el JComboBox
        String[] nombresModulos = modulos.values().toArray(new String[0]);
        cboModulo = new JComboBox<>(nombresModulos);
        gbc.gridx = 1; gbc.gridwidth = 3; gbc.weightx = 1;
        panel.add(cboModulo, gbc);
        gbc.gridwidth = 1;

        return panel;
    }

    // ── Panel central: tabla de alumnos ───────────────────────────────────────
    private JScrollPane crearPanelTabla() {
        modeloTabla = new DefaultTableModel(
                new String[]{"Nombre", "Nota", "Módulo", "Calificación"}, 0) {
            // Hace que las celdas no sean editables directamente
            @Override
            public boolean isCellEditable(int row, int col) { return false; }
        };

        JTable tabla = new JTable(modeloTabla);
        tabla.setRowHeight(22);
        tabla.getTableHeader().setReorderingAllowed(false);

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBorder(BorderFactory.createTitledBorder("Lista de alumnos"));
        return scroll;
    }

    // ── Panel inferior: botones y media ───────────────────────────────────────
    private JPanel crearPanelBotones() {
        JButton btnAgregar  = new JButton("Agregar alumno");
        JButton btnEliminar = new JButton("Eliminar seleccionado");
        JButton btnGuardar  = new JButton("Guardar en fichero");
        JButton btnCargar   = new JButton("Cargar desde fichero");

        // Listeners con expresiones lambda que delegan en métodos privados
        btnAgregar.addActionListener(e  -> agregarAlumno());
        btnEliminar.addActionListener(e -> eliminarAlumno());
        btnGuardar.addActionListener(e  -> guardarEnFichero());
        btnCargar.addActionListener(e   -> cargarDesdeFichero());

        lblMedia = new JLabel("Media de notas: -", SwingConstants.RIGHT);
        lblMedia.setFont(lblMedia.getFont().deriveFont(Font.BOLD, 12f));

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnGuardar);
        panelBotones.add(btnCargar);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(panelBotones, BorderLayout.WEST);
        panel.add(lblMedia,     BorderLayout.EAST);
        return panel;
    }

    // ── Métodos privados de lógica ────────────────────────────────────────────

    /**
     * Recoge los datos del formulario, crea un Alumno,
     * lo añade a la List y actualiza la tabla y la media.
     */
    private void agregarAlumno() {
        String nombre = txtNombre.getText().trim();
        String notaTxt = txtNota.getText().trim();

        // Validación básica
        if (nombre.isEmpty() || notaTxt.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nombre y nota son obligatorios.");
            return;
        }

        double nota;
        try {
            nota = Double.parseDouble(notaTxt);
            if (nota < 0 || nota > 10) throw new NumberFormatException();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "La nota debe ser un número entre 0 y 10.");
            return;
        }

        // Obtiene el código del módulo seleccionado buscando en el Map
        String nombreModulo = (String) cboModulo.getSelectedItem();
        String codigoModulo = obtenerCodigoModulo(nombreModulo);

        // Crea el objeto y lo añade a la List
        Alumno alumno = new Alumno(nombre, nota, codigoModulo);
        listaAlumnos.add(alumno);

        // Añade la fila a la tabla con la calificación calculada
        modeloTabla.addRow(new Object[]{
                nombre,
                nota,
                nombreModulo,
                calcularCalificacion(nota)
        });

        actualizarMedia();
        limpiarFormulario();
    }

    /**
     * Elimina el alumno seleccionado en la tabla,
     * también lo borra de la List.
     */
    private void eliminarAlumno() {
        // Obtiene la fila seleccionada en la tabla
        int fila = getFila();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona un alumno de la tabla.");
            return;
        }

        listaAlumnos.remove(fila);   // Borra de la List por índice
        modeloTabla.removeRow(fila); // Borra la fila de la tabla
        actualizarMedia();
    }

    /**
     * Recorre la List y escribe cada alumno como una línea en alumnos.txt
     * usando BufferedWriter para mayor eficiencia.
     */
    private void guardarEnFichero() {
        if (listaAlumnos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay alumnos para guardar.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO))) {
            for (Alumno a : listaAlumnos) {
                bw.write(a.aLinea()); // Escribe "nombre;nota;modulo"
                bw.newLine();         // Salto de línea entre alumnos
            }
            JOptionPane.showMessageDialog(null,
                    listaAlumnos.size() + " alumno(s) guardados en " + FICHERO);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar: " + ex.getMessage());
        }
    }

    /**
     * Lee alumnos.txt línea a línea con BufferedReader,
     * reconstruye los objetos Alumno y los añade a la List y la tabla.
     */
    private void cargarDesdeFichero() {
        File fichero = new File(FICHERO);
        if (!fichero.exists()) return; // Si no existe, no hace nada

        // Limpia el estado actual antes de cargar
        listaAlumnos.clear();
        modeloTabla.setRowCount(0);

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.isBlank()) continue;

                Alumno a = Alumno.desdeLinea(linea);  // Reconstruye el objeto
                listaAlumnos.add(a);                  // Añade a la List

                // Busca el nombre del módulo en el Map usando el código guardado
                String nombreModulo = modulos.getOrDefault(a.modulo, a.modulo);

                modeloTabla.addRow(new Object[]{
                        a.nombre,
                        a.nota,
                        nombreModulo,
                        calcularCalificacion(a.nota)
                });
            }
            actualizarMedia();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar: " + ex.getMessage());
        }
    }

    // ── Métodos auxiliares ────────────────────────────────────────────────────

    /**
     * Busca en el Map el código correspondiente a un nombre de módulo.
     * Recorre las entradas del Map hasta encontrar el valor que coincide.
     */
    private String obtenerCodigoModulo(String nombreModulo) {
        for (Map.Entry<String, String> entrada : modulos.entrySet()) {
            if (entrada.getValue().equals(nombreModulo)) {
                return entrada.getKey(); // Devuelve el código, ej: "PRO"
            }
        }
        return nombreModulo;
    }

    /**
     * Calcula la calificación textual según la nota numérica.
     */
    private String calcularCalificacion(double nota) {
        if (nota < 5)  return "Suspenso";
        if (nota < 6)  return "Suficiente";
        if (nota < 7)  return "Bien";
        if (nota < 9)  return "Notable";
        return "Sobresaliente";
    }

    /**
     * Recalcula la media de notas recorriendo la List
     * y actualiza la etiqueta inferior.
     */
    private void actualizarMedia() {
        if (listaAlumnos.isEmpty()) {
            lblMedia.setText("Media de notas: -");
            return;
        }
        double suma = 0;
        for (Alumno a : listaAlumnos) {
            suma += a.nota;
        }
        double media = suma / listaAlumnos.size();
        lblMedia.setText(String.format("Media de notas: %.2f", media));
    }

    /** Devuelve el índice de la fila seleccionada en la tabla, o -1 si no hay ninguna. */
    private int getFila() {
        // Busca la tabla dentro del scroll para obtener la selección
        // Se hace recorriendo los componentes de la ventana
        for (Window w : Window.getWindows()) {
            JTable t = buscarTabla((Container) w);
            if (t != null) return t.getSelectedRow();
        }
        return -1;
    }

    /** Busca recursivamente un JTable dentro de un contenedor. */
    private JTable buscarTabla(Container c) {
        for (Component comp : c.getComponents()) {
            if (comp instanceof JTable)     return (JTable) comp;
            if (comp instanceof Container)  {
                JTable t = buscarTabla((Container) comp);
                if (t != null) return t;
            }
        }
        return null;
    }

    private void limpiarFormulario() {
        txtNombre.setText("");
        txtNota.setText("");
        txtNombre.requestFocus();
    }

    // ── Main ──────────────────────────────────────────────────────────────────
    public static void main(String[] args) {
        SwingUtilities.invokeLater(GestionAlumnosFull::new);
    }
}