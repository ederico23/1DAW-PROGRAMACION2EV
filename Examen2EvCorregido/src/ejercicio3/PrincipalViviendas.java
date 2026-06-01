package ejercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Clase principal del Ejercicio 3.
 *
 * Pistas del examen respondidas:
 * - "¿Qué operador tendré que utilizar para saber qué tipo es en cada momento?"
 *   → instanceof: comprueba si un objeto es instancia de una clase concreta.
 *     Ej: if (vivienda instanceof Piso) → es un Piso.
 *
 * - "Se puede hacer con una sola expresión con stream que filtre por tipo, ordene y muestre."
 *   → list.stream().filter(...).sorted(...).forEach(...)
 *
 * - "Si quieres comparar por precio, te recomiendo que vayas a la API de la clase Double."
 *   → Double.compare(a, b) → comparador estándar para doubles.
 *     También: Comparator.comparingDouble(Vivienda::calcularPrecio)
 */
public class PrincipalViviendas {

    public static void main(String[] args) {

        // Creamos el ArrayList de Viviendas y lo llenamos
        ArrayList<Vivienda> viviendas = new ArrayList<>();
        llenarViviendas(viviendas);

        // Menú interactivo
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n====== AGENCIA INMOBILIARIA ======");
            System.out.println("1. Mostrar todas las viviendas");
            System.out.println("2. Mostrar todos los unifamiliares");
            System.out.println("3. Mostrar todos los pisos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- TODAS LAS VIVIENDAS (de más barata a más cara) ---");
                    mostrarViviendas(viviendas, null);
                    break;

                case 2:
                    System.out.println("\n--- UNIFAMILIARES (de más barata a más cara) ---");
                    // Pasamos Unifamiliar.class para que el método filtre por ese tipo
                    mostrarViviendas(viviendas, Unifamiliar.class);
                    break;

                case 3:
                    System.out.println("\n--- PISOS (de más barato a más caro) ---");
                    // Pasamos Piso.class para filtrar solo los pisos
                    mostrarViviendas(viviendas, Piso.class);
                    break;

                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }

    /**
     * Método que muestra viviendas ordenadas de más barata a más cara.
     * Si tipoFiltro es null, muestra todas.
     * Si tipoFiltro es Piso.class o Unifamiliar.class, filtra por ese tipo.
     *
     * Usamos streams con:
     * - filter()  → filtra por tipo (instanceof)
     * - sorted()  → ordena por precio usando Double.compare()
     * - forEach() → imprime cada vivienda (llama a toString())
     *
     * @param lista      Lista de todas las viviendas
     * @param tipoFiltro Clase por la que filtrar, o null para mostrar todas
     */
    private static void mostrarViviendas(List<Vivienda> lista, Class<?> tipoFiltro) {

        lista.stream()
            // filter: si tipoFiltro es null → mostramos todas; si no → solo las del tipo indicado
            // isInstance() es el equivalente dinámico de instanceof para usar con variables de clase
            .filter(v -> tipoFiltro == null || tipoFiltro.isInstance(v))
            // sorted: usamos Comparator con Double.compare() (recomendación del examen)
            // comparingDouble también funciona: Comparator.comparingDouble(Vivienda::calcularPrecio)
            .sorted((v1, v2) -> Double.compare(v1.calcularPrecio(), v2.calcularPrecio()))
            // forEach: imprime cada vivienda usando su toString()
            .forEach(v -> System.out.println(v + "\n"));
    }

    /**
     * Método que rellena el ArrayList con 3 pisos y 3 unifamiliares inventados.
     * Los datos son ficticios.
     */
    private static void llenarViviendas(ArrayList<Vivienda> lista) {

        // ─── 3 Pisos ───────────────────────────────────────────────
        lista.add(new Piso("Calle Mayor 1, 3ºA", 75.0, 3, 3, true));
        lista.add(new Piso("Av. Constitución 22, 7ºB", 90.0, 4, 7, true));
        lista.add(new Piso("Calle del Pez 5, 1ºC", 55.0, 2, 1, false));

        // ─── 3 Unifamiliares ───────────────────────────────────────
        lista.add(new Unifamiliar("Urbanización Las Flores, 14", 120.0, 4, true));   // con jardín
        lista.add(new Unifamiliar("Calle Robles 8", 95.0, 3, false));               // sin jardín
        lista.add(new Unifamiliar("Bº El Pinar, Chalet 5", 150.0, 5, true));        // con jardín
    }
}
