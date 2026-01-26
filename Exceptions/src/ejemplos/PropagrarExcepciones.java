package ejemplos;

import java.util.Scanner;



public class PropagrarExcepciones {

	private static Scanner kb = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int n1,n2;
		n1=pedirNumero();
		n2=pedirNumero();
		int suma = n1+n2;
		System.out.println("la suma es " + suma);

	}

	private static int pedirNumero() {
		int n = 0;
		System.out.println("introduce un numero");
		kb.nextInt();
		return n;
	}
	
}
