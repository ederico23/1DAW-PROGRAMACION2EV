package ejercicio1;

import java.util.Scanner;

/**
 * Clase principal del Ejercicio 1.
 *
 * Pide datos al usuario por teclado, intenta crear un Vehículo,
 * y da una segunda oportunidad si la matrícula es incorrecta.
 *
 * Pistas del examen respondidas aquí:
 * - "¿Dónde la deberé recoger y tratar?" → En el bloque catch del try-catch.
 * - "Si quiero que algo ocurra indistintamente de lo que pase, ¿en qué parte?"
 *   → En el bloque FINALLY, que se ejecuta siempre, haya excepción o no.
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Vehiculo vehiculo = null; // Empezamos con null; si se crea bien, dejará de serlo

        // Pedimos marca y color (no tienen validación especial)
        System.out.print("Introduce la marca del vehículo: ");
        String marca = scanner.nextLine();

        System.out.print("Introduce el color del vehículo: ");
        String color = scanner.nextLine();

        System.out.print("Introduce la matrícula (formato: 4 números + 3 letras mayúsculas, ej: 1234ABC): ");
        String matricula = scanner.nextLine();

        // PRIMER INTENTO: tratamos de crear el vehículo con los datos introducidos
        try {
            vehiculo = new Vehiculo(marca, color, matricula);

        } catch (MatriculaErroneaException e) {
            // Si la matrícula es incorrecta, capturamos la excepción y mostramos su mensaje
            // e.getMessage() devuelve "La matrícula XXXX no es válida"
            System.out.println(e.getMessage());

            // SEGUNDA OPORTUNIDAD: solo pedimos de nuevo la matrícula
            System.out.print("Segunda oportunidad. Introduce de nuevo la matrícula: ");
            String matricula2 = scanner.nextLine();

            // Segundo intento: si vuelve a fallar, vehiculo sigue siendo null
            try {
                vehiculo = new Vehiculo(marca, color, matricula2);
            } catch (MatriculaErroneaException e2) {
                // Si falla de nuevo, mostramos el mensaje y vehiculo permanece null
                System.out.println(e2.getMessage());
            }

        } finally {
            // El bloque FINALLY se ejecuta SIEMPRE, independientemente de si hubo excepción o no.
            // Es el lugar ideal para el mensaje de resultado final.
            if (vehiculo != null) {
                // Si vehiculo se creó correctamente, no es null
                System.out.println(vehiculo); // Llama a toString()
            } else {
                // Si tras los dos intentos sigue siendo null, el vehículo no se creó
                System.out.println("El vehículo no ha sido creado correctamente");
            }
        }

        scanner.close();
    }
}