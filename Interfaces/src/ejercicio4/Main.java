package ejercicio4;

public class Main {

	public static void main(String[] args) {
		String cadenaPrueba="La casa es Azul";
		
		procesarCadena(cadenaPrueba, (s)->s.toUpperCase());
		procesarCadena(cadenaPrueba, (s)->s+"!!!!!!");
		procesarCadena(cadenaPrueba, (s)->new StringBuilder(s).reverse().toString());
		
		
		

	}
	private static void procesarCadena(String s, Transformador t) {
		System.out.println(t.transformar(s));
		
	}

}