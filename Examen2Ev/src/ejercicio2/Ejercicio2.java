package ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//lista de amigos
		String[]alumnos={"Juan","Ana","Fran","Luis","Miguel","Veronica","Laura","David","Diana",
				"Valeria"};
	
		//estructura para almacenar la eleccion de amigos
		Map<String, ArrayList<String>> listaAmigos = llenarLista(alumnos);
		
	
	}
	
	//metodo que genera una lista
	private static Map<String, ArrayList<String>> llenarLista(String[] alumnos) {
		Map<String, ArrayList<String>> resultado = new TreeMap<>();
		
		for (String a : alumnos) {
			//creamos arrayList con los nombres de los alumnos. asList para convertirlo en una lista
			ArrayList<String> listaAmigos = new ArrayList<> (Arrays.asList(alumnos));
			//eliminamos a ("a tiene como amigos a juan,...")
			listaAmigos.remove(a);
			//mezcla los amigos, los barajea
			Collections.shuffle(listaAmigos);
			//coge los primeros 5 amigos de la lista, se podria hacer con un random tb
			ArrayList<String> primerosCinco = new ArrayList<>(listaAmigos.subList(0, Math.min(5, listaAmigos.size())));
			//añado los 5
			Collections.sort(primerosCinco);
			resultado.put(a, primerosCinco);
			
		}
		
		
		return resultado;
	}

	
	
	private static Map<String, Integer> contarAmigos(Map<String, List<String>> listaAmigos){
		
		HashMap<String, Integer> resultado = new HashMap<>();
		//inicialzar a 0
		for (String s : listaAmigos.keySet()) {
			resultado.put(s, 0);
		}
		
		for (String s:listaAmigos.keySet()) {
			for (String a: listaAmigos.get(s)) {
				resultado.put(a, resultado.get(a));
			}
		}
		
		
		return resultado;
		
	}
}
