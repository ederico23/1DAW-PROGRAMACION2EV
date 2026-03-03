package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/*
 * ley Dont
 * partidos y votos
 * hay que inventar partidos y los votos, por ende los resultados, nº de escaños a repartir.
 * 8 escaños Map<String, Integer> 
 * 
 * como se reparten:
 * 				1				2				3 				4			5
 * rojo: 	   3200			   1600
 * verde:      2000			   1000
 * azul: 	   1800			   900	
 * amarillo:   3000			   1500
 * 
 * de todos estos, el mayor se le suma un escaño
 * 
 */
public class resultadoElecciones {

	public static void main(String[] args) {
		//creamos el Map
		Map<String, Integer> resultados = new TreeMap<>();
		
		//añadimos los partidos al Map
		resultados.put("rojo", 5245);
		resultados.put("azul", 6732);
		resultados.put("verde", 7753);
		resultados.put("negro", 3442);
		resultados.put("amarillo", 7432);
		
		//variables que usarmos
		final int ESCAÑOS = 8;
		
		//imprimimos
		imprimirResultados(resultados);
		
	} //fin main

	//metodo para imprimir los partidos y los votos
	public static void imprimirResultados(Map<String, Integer> resultados) {
		ArrayList<Map.Entry<String, Integer>> resultadosVotos = new ArrayList<>(resultados.entrySet());
		
		//ordeno
		resultadosVotos.sort((a,b)->b.getValue().compareTo(a.getValue()));
		
		//mostrar ordenados
		for(Map.Entry<String, Integer> entry : resultadosVotos){
			System.out.println("partido: " + entry.getKey() + "\nvotos: " + entry.getValue());
			System.out.println("*************************************");
		}
		
	} //fin imprimirResultados
	
	//metodo para repartir los escaños
	public static void repartirEscaños(Map<String, Integer> partidosEscaños, int ESCAÑOS) {
		
		
		
		
			
	} //fin repartirEscaños
	
	
	
	
	
	
} //fin class
