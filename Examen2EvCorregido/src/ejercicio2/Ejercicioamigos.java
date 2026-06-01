package ejercicio2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Ejercicio 2: Gestión de amistades entre alumnos usando Maps.
 *
 * Respuestas a las pistas del examen:
 * - "¿De qué tipo será la clave del mapa?" → String (nombre del alumno)
 * - "¿Y los valores?" → List<String> (lista de amigos)
 * - "¿Existe algún método en Arrays para convertir en estructura dinámica?"
 *   → Arrays.asList() convierte un array en una List
 * - "¿Qué estructura de control para rellenar el mapa?" → for/for-each
 * - "¿Se puede ordenar con streams?" → Sí, usando sorted() + Collectors.toMap() con LinkedHashMap
 * - "¿Qué utilizamos en el for para recorrer los valores de un mapa?"
 *   → entrySet() → for (Map.Entry<K,V> entry : mapa.entrySet())
 */
public class Ejercicioamigos {

    public static void main(String[] args) {

        // Array original de alumnos
        String[] alumnos = {"Juan", "Ana", "Fran", "Luis", "Miguel",
                            "Veronica", "Laura", "David", "Diana", "Valeria"};

        // ─────────────────────────────────────────────────────────
        // APARTADO A: Crear el mapa alumno → lista de 5 amigos aleatorios
        // ─────────────────────────────────────────────────────────

        // Convertimos el array en una List dinámica para poder usar métodos como contains()
        // Arrays.asList() devuelve una lista de tamaño fijo, por eso usamos new ArrayList<>()
        List<String> listaAlumnos = new ArrayList<>(Arrays.asList(alumnos));

        // El mapa: clave = nombre del alumno, valor = lista de sus 5 amigos
        Map<String, List<String>> mapaAmigos = new HashMap<>();

        Random random = new Random();

        // Recorremos el array de alumnos (no el mapa, que está vacío)
        // Para cada alumno generamos su lista de amigos
        for (String alumno : alumnos) {

            List<String> amigos = new ArrayList<>();

            // Necesitamos exactamente 5 amigos distintos y distintos del propio alumno
            // Usamos un while porque no sabemos cuántas iteraciones necesitaremos
            while (amigos.size() < 5) {
                // Elegimos un índice aleatorio entre 0 y el número de alumnos
                int indiceAleatorio = random.nextInt(alumnos.length);
                String posibleAmigo = alumnos[indiceAleatorio];

                // Condición doble: que no sea él mismo Y que no esté ya en la lista
                if (!posibleAmigo.equals(alumno) && !amigos.contains(posibleAmigo)) {
                    amigos.add(posibleAmigo);
                }
            }

            // Guardamos en el mapa: clave = alumno, valor = su lista de amigos
            mapaAmigos.put(alumno, amigos);
        }

        // ─────────────────────────────────────────────────────────
        // APARTADO B: Mostrar ordenado alfabéticamente (clave y lista de amigos)
        // ─────────────────────────────────────────────────────────

        System.out.println("=== APARTADO B: Amistades ordenadas alfabéticamente ===");

        // Ordenamos el mapa por clave (nombre del alumno) con streams
        // sorted() → ordena las entradas por la clave (comparando Strings alfabéticamente)
        // Collectors.toMap() con LinkedHashMap → preserva el orden de inserción
        Map<String, List<String>> mapaOrdenado = mapaAmigos.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) // Ordena por clave alfabéticamente
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,         // En caso de colisión (no ocurre aquí), quedarse con el primero
                        LinkedHashMap::new      // Usamos LinkedHashMap para mantener el orden
                ));

        // Recorremos el mapa con entrySet() → nos da pares (clave, valor)
        for (Map.Entry<String, List<String>> entrada : mapaOrdenado.entrySet()) {
            String nombreAlumno = entrada.getKey();
            List<String> listaAmigos = entrada.getValue();

            // Ordenamos la lista de amigos alfabéticamente
            // Collections.sort() ordena en orden natural (alfabético para Strings)
            Collections.sort(listaAmigos);

            // Convertimos la lista en un String separado por comas
            // String.join() une los elementos con el separador indicado
            String amigosStr = String.join(", ", listaAmigos);

            System.out.println("Alumno: " + nombreAlumno + ": Sus amistades son: " + amigosStr + ".");
        }

        // ─────────────────────────────────────────────────────────
        // APARTADO C: Contar cuántas veces ha sido elegido cada alumno
        // ─────────────────────────────────────────────────────────

        System.out.println("\n=== APARTADO C: Veces elegido como amigo (mayor a menor) ===");

        // Nuevo mapa: clave = nombre del alumno, valor = número de veces elegido
        Map<String, Integer> contadorElecciones = new HashMap<>();

        // Inicializamos el contador a 0 para todos los alumnos
        for (String alumno : alumnos) {
            contadorElecciones.put(alumno, 0);
        }

        // Recorremos SOLO las claves del mapa de amigos (keySet() devuelve las claves)
        // Para cada alumno, recorremos su lista de amigos y sumamos 1 al contador de cada uno
        for (String alumno : mapaAmigos.keySet()) {
            List<String> susAmigos = mapaAmigos.get(alumno);

            for (String amigo : susAmigos) {
                // getOrDefault evita NullPointerException si la clave no existe
                contadorElecciones.put(amigo, contadorElecciones.get(amigo) + 1);
            }
        }

        // Ordenamos el mapa de mayor a menor número de elecciones con streams
        // comparingByValue() con orden inverso (Comparator.reverseOrder())
        Map<String, Integer> contadorOrdenado = contadorElecciones.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        // Recorremos el mapa ordenado y mostramos los resultados
        // entrySet() → para poder acceder tanto a la clave como al valor en el for
        for (Map.Entry<String, Integer> entrada : contadorOrdenado.entrySet()) {
            System.out.println("Alumno: " + entrada.getKey() +
                               ": Ha sido elegido " + entrada.getValue() + " veces.");
        }
    }
}