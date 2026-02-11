package ejerciciosMaps;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Ejercicio 2.- Contador de números
Pide al usuario una serie de números.
Utiliza un Map<Integer, Integer> para contar cuántas veces aparece cada número y muestra el resultado.
	
	@version 1.0 - 11/02/26
	@author ederg
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		//creamos scanner y variables
		Scanner kb = new Scanner (System.in);
		int numero = 0;
		HashMap<Integer, Integer> listado = new HashMap<Integer, Integer>();
		
		//proceso de datos
		do {
			System.out.println("introduce un numero");
			numero = kb.nextInt();
			
			if (!listado.containsKey(numero)) {
				listado.put(numero, 0);
			}
			
			listado.put(numero, listado.get(numero)+1);
			
			} while (numero!=0);
		
		System.out.println("fin");

		kb.close();
	}

}
