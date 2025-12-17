package unidad3.ejercicios;


import java.util.Scanner;

public class CodigoCPQ_BASE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un código CPQ: ");
        String cpq = sc.nextLine();

        // 1️⃣ Validar longitud
        if (cpq.length() != 10) {
            System.out.println("❌ Error: el código debe tener exactamente 10 caracteres.");
            return;
        }

        // 2️⃣ Extraer partes LL-NNNN-XC
        String letras = cpq.substring(0, 2);  // LL
        char guion1 = cpq.charAt(2);          // -
        String numeros = cpq.substring(3, 7); // NNNN
        char guion2 = cpq.charAt(7);          // -
        char estado = cpq.charAt(8);          // X
        char control = cpq.charAt(9);         // C

        // 3️⃣ Comprobar guiones
        if (guion1 != '-' || guion2 != '-') {
            System.out.println("❌ Error: los guiones no están en la posición correcta.");
            return;
        }

        // 4️⃣ Validación del tipo de compuesto (LL)
        if (!letras.matches("AC|BS|SL|OG")) {
            System.out.println("❌ Error: tipo de compuesto inválido.");
            return;
        }

        // 5️⃣ Validar que el lote son 4 dígitos
        boolean validoLote = true;

        for (int i = 0; i < numeros.length(); i++) {
            char c = numeros.charAt(i);

            if (c < '0' || c > '9') {
                validoLote = false;
                break;
            }
        }

        if (!validoLote) {
            System.out.println("❌ Error: el número de lote debe tener 4 dígitos.");
            return;
        }

        // 6️⃣ Validar estado físico (S/L/G)
        if ("SLG".indexOf(estado) == -1) {
            System.out.println("❌ Error: estado físico inválido.");
            return;
        }

        // 7️⃣ 👉 Aquí debe calcularse el dígito de control esperado
        //    (El alumno debe completar esta parte)
        //
        //    Pistas:
        //    - Recorrer los 4 dígitos del lote
        //    - Convertir cada carácter en número: (c - '0')
        //    - Sumar todos los dígitos
        //    - Obtener digito = suma % 10
        //
        //    Luego comparar con el último carácter del código (control)

        // Ejemplo de estructura a completar:
        /*
        int suma = 0;
        // completar sumatorio…

        int digitoCalculado = suma % 10;
        int digitoIncluido = control - '0';

        if (digitoCalculado != digitoIncluido) {
            System.out.println("❌ Dígito de control incorrecto.");
            return;
        }
        */

        // 8️⃣ 👉 Mostrar información final
        //    (El alumno deberá completar los switch con los textos:
        //     Ácido, Base, Sal, Orgánico
        //     Sólido, Líquido, Gas)

        System.out.println("✔ Validaciones básicas superadas. (Falta implementar el dígito de control y mostrar resultados)");
    }
}
