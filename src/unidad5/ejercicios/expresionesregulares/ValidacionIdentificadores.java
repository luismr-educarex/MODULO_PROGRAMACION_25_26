package unidad5.ejercicios.expresionesregulares;
import java.util.HashSet;
import java.util.Set;

public class ValidacionIdentificadores {

	/**
	 * Un identificador será válido si cumple todas estas condiciones:
			-Empieza por una letra minúscula.
			-Contiene solo letras minúsculas y números.
			-Tiene una longitud entre 5 y 10 caracteres.
			
			Ejemplos válidos:
			-user1
			-admin99
			-alumno3
			
			Recorrer el array de 30 elementos.
			Comprobar cada elemento usando una expresión regular.
			Almacenar:
				-Los identificadores válidos en un Set<String> llamado validos.
				-Los identificadores no válidos en un Set<String> llamado invalidos.
			Mostrar por consola el contenido de ambos conjuntos.

	 */
	
	
    public static void main(String[] args) {

        // Array con 30 identificadores
        String[] identificadores = {
                "user1", "admin99", "alumno3", "User2", "root",
                "inv@lid", "test123", "aa", "programador1", "java8",
                "usuario_", "profesor", "dam2024", "DAW1", "alum1",
                "abcde", "abcdefghi1", "x1", "hola123", "123abc",
                "user1", "admin99", "valid9", "otroUser", "test",
                "minimo5", "maximo10a", "fuera_de_regla", "ok123", "z9999"
        };

        
    }
}
