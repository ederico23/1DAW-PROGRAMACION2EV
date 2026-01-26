package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		int[] listaNumeros = {1,2,3,4,5};
		int numero = 0;
		boolean seguir = true;
		Scanner teclado = new Scanner(System.in);
		
		do {
			try {
				System.out.println("introduce un numero");
				numero = teclado.nextInt();
				System.out.println(listaNumeros[7]);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("fuera de rango");
			} catch (InputMismatchException e) {
				System.out.println("fuera de rango");
				teclado.nextLine();
			}
			
		} while (seguir);
		

	}

}
