package ejerciciosMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Ejercicio 4.- Inventario sencillo
Usa un Map<String, Integer> para almacenar productos y su cantidad en stock.
Operaciones:
• Añadir productos
• Vender productos (restar unidades)
• Mostrar los productos sin stock

@version 1.0 - 11/02/26
@author ederg

 */


public class Ejercicio4 {

	public static void main(String[] args) {
		
		//creamos el mapa
		Map<String, Integer> inventario = new HashMap<>();
		
		//creamos productos
		añadirProductos(inventario ,"colacao " , 5);
		System.out.println(inventario);
		
		//vendemos productos
		
		
		
		


	}// fin main
	
	
	public static void añadirProductos (Map<String, Integer> inventario,
			String nombre, Integer unidades) {
		
		Scanner kb = new Scanner (System.in);
		System.out.println("introduce el producto que quieres añadir");
		inventario.put(nombre , unidades);
				
	}//fin añadirProductos
	
	public static void venderProductos(Map<String, Integer> inventario, String nombre, 
			Integer unidadesVender) {
		
		
		
	}

}
