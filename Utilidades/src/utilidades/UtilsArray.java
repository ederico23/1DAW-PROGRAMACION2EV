package utilidades;

public class UtilsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[][] llenarArray(int[][] a, int valorRandom, int inicioRandom) {
		for (int f = 0; f < a.length; f++) {
			for (int c = 0; c < a[f].length; c++ ) {
				a[f][c]= (int)(Math.random()*valorRandom)+inicioRandom;
			}
		}
		return a;
	}
	public static void mostrarArray(int a[][]) {
		for (int f = 0; f < a.length; f++) {
			for (int c = 0; c < a[f].length; c++ ) {
				System.out.printf("%4d", a[f][c]);
			}
			System.out.println("");
		}
	}
}