package unidad6.ejemplos.ficheros;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraBasica {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("saludo.txt");
            writer.write("Hola mundo desde Java");
            writer.write("\n");
            writer.write("Estamos preparados para el futuro");
            writer.close();

            System.out.println("Fichero escrito correctamente");

        } catch (IOException e) {
            System.out.println("Error al escribir el fichero");
        }
    }
}
