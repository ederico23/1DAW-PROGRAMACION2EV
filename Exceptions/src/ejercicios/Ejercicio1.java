package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author ederg
 * @version 1.0 26-01-26
Pide dos números enteros por teclado y realiza la división.
Captura:
	-ArithmeticException (división por 0)
	-InputMismatchException
	-El programa no debe terminar, debe volver a pedir los datos
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//declaramos variables
		int n1, n2, solucion;
		boolean salida = false;
		Scanner kb = new Scanner (System.in);
		
		
		//proceso
		//hacemos un do-while para que se repita hasta que la salida sea true
		do {
		//hacemos un try-catch para capturar las excepciones
			try {
		//introducimos numeros
		System.out.println("introduce el primer numero");
		n1 = kb.nextInt();
		
		System.out.println("introduce el segundo numero");
		n2 = kb.nextInt();
		
		//hacemos la operacion
		solucion = n1/n2;
		salida = true;
		//salida de datos
		System.out.println("la solucion de " + n1 + "/" + n2 + " es: " + solucion );
		//ponemos el tipo de excepcion que queremos capturar y un mensaje
			} catch (InputMismatchException e){
				System.out.println("dato erroneo, introduzca un caracter numérico");
				kb.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("no es divisible entre 0, introduzca otro");
		//el finally siempre se va a mostrar por pantalla.
			} finally {
				System.out.println("hazlo bien!!");
			}
			
		} while (!salida);
		
		System.out.println("fin de programa");
		kb.close();
	}

}
