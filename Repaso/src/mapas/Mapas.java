package mapas;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Mapas {
	public static void main(String[] args) {
		
		//HASHMAP---------------------------------------

		Map<String, Integer> edades = new HashMap<>();

		// PUT: añadir o sobreescribir
		edades.put("Juan", 25);
		edades.put("Ana", 30);
		edades.put("Luis", 22);

		// GET: obtener valor por clave
		System.out.println(edades.get("Ana")); // 30

		// GET si no existe → devuelve el valor por defecto (no null)
		System.out.println(edades.getOrDefault("Pedro", 0)); // 0

		// CONTAINS: ¿existe esa clave?
		edades.containsKey("Juan");   // true
		edades.containsValue(30);     // true

		// REMOVE: eliminar
		edades.remove("Luis");

		// SIZE: cuántas entradas hay
		edades.size(); // 2

		// Recorrer con entrySet() → te da clave Y valor a la vez
		for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
			System.out.println(entrada.getKey() + " tiene " + entrada.getValue() + " años");
		}

		// Recorrer solo claves
		for (String nombre : edades.keySet()) {
			System.out.println(nombre);
		}

		// Recorrer solo valores
		for (int edad : edades.values()) {
			System.out.println(edad);
		}
		
		
		//LINKEDHASPMAP-----------------
		Map<String, String> capitales = new LinkedHashMap<>();

		capitales.put("España",   "Madrid");
		capitales.put("Francia",  "París");
		capitales.put("Italia",   "Roma");

		// Al recorrer, saldrá en el orden que insertaste: España, Francia, Italia
		for (Map.Entry<String, String> e : capitales.entrySet()) {
		    System.out.println(e.getKey() + " → " + e.getValue());
		}
		// España → Madrid
		// Francia → París
		// Italia → Roma
	
		
		//TREEMAP----------------------
		Map<String, Integer> notas = new TreeMap<>();

		notas.put("Luis",     7);
		notas.put("Ana",      9);
		notas.put("Veronica", 6);
		notas.put("Fran",     8);

		// Al recorrer, saldrá en orden alfabético de la clave: Ana, Fran, Luis, Veronica
		for (Map.Entry<String, Integer> e : notas.entrySet()) {
		    System.out.println(e.getKey() + ": " + e.getValue());
		}
		// Ana: 9
		// Fran: 8
		// Luis: 7
		// Veronica: 6
		
		
		
		//METODOS A CONOCER----------------------------------------------------------
		Map<String, Integer> mapa = new HashMap<>();

		// ── Añadir ──────────────────────────────────────────────────────────
		mapa.put("a", 1);                    // Añade o sobreescribe
		mapa.putIfAbsent("a", 99);           // Solo añade si la clave NO existe (sigue siendo 1)

		// ── Obtener ─────────────────────────────────────────────────────────
		mapa.get("a");                       // 1  (null si no existe)
		mapa.getOrDefault("z", 0);          // 0  (valor por defecto si no existe)

		// ── Modificar ───────────────────────────────────────────────────────
		// Suma 1 al valor existente, o pone 1 si la clave no existe:
		mapa.put("a", mapa.getOrDefault("a", 0) + 1);
		// Versión más moderna con merge:
		mapa.merge("a", 1, Integer::sum);    // equivalente a lo anterior

		// ── Borrar ──────────────────────────────────────────────────────────
		mapa.remove("a");                    // Elimina la entrada con clave "a"

		// ── Consultar ───────────────────────────────────────────────────────
		mapa.containsKey("a");               // ¿Existe la clave?
		mapa.containsValue(1);               // ¿Existe el valor?
		mapa.isEmpty();                      // ¿Está vacío?
		mapa.size();                         // Número de entradas
		
		
		
		
		//ORDENAR---------------------------------------------------------
		Map<String, Integer> puntos = new HashMap<>();
		puntos.put("David",   7);
		puntos.put("Ana",     3);
		puntos.put("Miguel",  5);

		// ── Ordenar por CLAVE (alfabético) ──────────────────────────────────
		Map<String, Integer> porClave = puntos.entrySet().stream()
		    .sorted(Map.Entry.comparingByKey())
		    .collect(Collectors.toMap(
		        Map.Entry::getKey,
		        Map.Entry::getValue,
		        (e1, e2) -> e1,
		        LinkedHashMap::new   // ← imprescindible para mantener el orden
		    ));

		// ── Ordenar por VALOR de mayor a menor ──────────────────────────────
		Map<String, Integer> porValor = puntos.entrySet().stream()
		    .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()))
		    .collect(Collectors.toMap(
		        Map.Entry::getKey,
		        Map.Entry::getValue,
		        (e1, e2) -> e1,
		        LinkedHashMap::new
		    ));
		
	}
}
