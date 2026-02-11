package ejerciciosMaps;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
Ejercicio 3.- Notas de alumnos
Crea un Map<String, Integer> donde la clave sea el nombre del alumno y el valor su nota.
Operaciones:
• Añadir o modificar notas
• Mostrar los alumnos aprobados
• Calcular la nota media del grupo

@version 1.0 - 11/02/26
@author ederg
 */


public class Ejercicio3 {
	
	public static void main(String[] args) {
	TreeMap<String, Integer> notas = new TreeMap<>();

	//añadir alumnos
	notas.put("javier" , 5);
	notas.put("mariano" , 9);
	notas.put("eder" , 8);
	notas.put("esther" ,4);
	notas.put("rené" , 5);
	
	//mostrar aprobados
	mostrarAprobados(notas);
	
	System.out.println();

	//mostrar la media
	System.out.println("la nota media es: " + mediaNotas(notas));
	
	//reemplazar notas
	reemplazarNota(notas, "esther" , 7);
	
	
	mostrarAprobados(notas);
	
	//ordenador por nota
	System.out.println();
	System.out.println("ordenar notas");
	ordenarPorNota(notas);
	}
	
	/**
	 * muestra todos los alumnos aprobados
	 * @param notas
	 */
	public static void mostrarAprobados (TreeMap<String, Integer> notas) {
		for (String s : notas.keySet()) {
			if (notas.get(s)>=5) {
				System.out.printf("alumno: %4s nota: %1d \n ", s, notas.get(s));
			}
		}
	}
	
	/**
	 * hace la media de las notas
	 * @param notas
	 * @return
	 */
	public static double mediaNotas(TreeMap<String, Integer> notas) {
		double resultado = 0;
		for(String s : notas.keySet()) {
			resultado = resultado + notas.get(s);
		}
		return resultado/notas.size();
		
	}
	
	/**
	 * reemplaza la nota por otra
	 * @param notas
	 * @param nombre
	 * @param notaNueva
	 */
	public static void reemplazarNota(TreeMap<String, Integer> notas, String nombre, Integer notaNueva) {
		notas.replace(nombre, notaNueva);//devuelve null si el nombre no existe en el TreeMap
	}
	
	/**
	 * ordenar por notas
	 * @param notas
	 */
	public static void ordenarPorNota(TreeMap<String, Integer> notas) {
		
		//transformar el mapa en una lista
		List<Map.Entry<String, Integer>> notasLista = new ArrayList<>(notas.entrySet()); 
		notasLista.sort((e1, e2)-> e1.getValue().compareTo(e2.getValue()));
		//System.out.println(notas);
		//System.out.println(notasLista);
		
		for(Map.Entry<String, Integer> m : notasLista) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
