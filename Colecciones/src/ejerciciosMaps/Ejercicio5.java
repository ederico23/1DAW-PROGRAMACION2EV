package ejerciciosMaps;

import java.util.Map;
import java.util.TreeMap;

/**
 * Ejercicio 5.- Diccionario
Implementa un diccionario usando un Map<String, String>.
Operaciones:
• Añadir palabras
• Buscar traducciones
• Mostrar el diccionario completo
Implementa con TreeMap.
¿Cómo permitirías la presencia de varias definiciones por palabra?

@author ederg
@version 1.0 - 12/02/26
 */



public class Ejercicio5 {

	public static void main(String[] args) {
		TreeMap<String, String> diccionario = new TreeMap<>();
		
		//añadimos
		agregarPalabras(diccionario, "hola" , "saludo");
		agregarPalabras(diccionario, "adios" , "despedida");
		agregarPalabras(diccionario, "casa" , "hogar de alguien");
		agregarPalabras(diccionario, "informatica" , "ciencia de la tecnologia");
		
		//mostrar diccionario
		mostrarDiccionario(diccionario);
		
		
		//mostrar defincion
		buscarDefiniciones(diccionario, "hola");
		
		

	}//fin main

	
	/**
	 * agrego palaras al diccionario
	 * @param diccionario
	 * @param palabra
	 * @param definicion
	 */
	public static void agregarPalabras(TreeMap<String, String> diccionario,
		String palabra, String definicion) {
		
		//if para impedir cambiar la definicion
		if (!diccionario.containsKey(palabra)) {
			diccionario.put(palabra, definicion);
		}
	} //fin agregarPalabras
	
	/**
	 * mostar el diccionario
	 * @param diccionario
	 */
	public static void mostrarDiccionario(TreeMap<String, String> diccionario) {
		for (Map.Entry<String, String> entry : diccionario.entrySet()) {
			System.out.println("palabra: " + entry.getKey() + "\n Definicion: " + entry.getValue());
		}
	} //fin mostrarDiccionario
	
	
	public static String buscarDefiniciones (TreeMap<String, String> diccionario, String palabra) {
		
		if(diccionario.containsKey(palabra)) {
			return diccionario.get(palabra);
		}
		return "no existe la palabra";
	}
	
	
	
	
	
}
