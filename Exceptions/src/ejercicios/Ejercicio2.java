package ejercicios;

import java.util.Scanner;

/**
 * @author ederg
 * @version 1.0 28/01/26
Pide una cadena y conviértela a entero usando Integer.parseInt.
	• Captura NumberFormatException
	• Repite hasta que el número sea válido.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		//creamos variables
		String c;
		boolean salir = false;
		Scanner kb = new Scanner (System.in);

		//entrada
		//hacemos un try catch para capturar la excepcion de NumberFormatExcepetion
		try {

			System.out.println("escribe lo que quieras");
			c = kb.nextLine();	

		//	c = Integer.parseInt(c);

		} catch (NumberFormatException e) {
			System.out.println("error, has introducido un numero");





			
		}

	}
}
