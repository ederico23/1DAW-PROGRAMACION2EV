package utilidades;

import java.util.Scanner;

public class Leer {
	//metodo para leer una frase
		public static Scanner sc = new Scanner(System.in);
		public static String leerFrase() {
			System.out.println("Dame una frase: ");
			return sc.nextLine();
		}
		//metodo para leer un string y le paso como argumento la pregunta que va a mostrar por consola
		public static String leerFrase(String mensaje) {
			System.out.println(mensaje);
			return sc.nextLine();
		}
		
		//metodo para leer un entero
		public static int leerEntero(String mensaje) {
			System.out.println(mensaje);
			int n = sc.nextInt();
			sc.nextLine();
			return n;
		}
		
		//metodo para leer un double
		public static double leerDouble(String mensaje) {
			System.out.println(mensaje);
			double d = sc.nextDouble();
			sc.nextLine();
			return d;

		}
		
		//metodo para cerrar el teclado
		public static void cerrarScanner() {
			sc.close();
		}
}