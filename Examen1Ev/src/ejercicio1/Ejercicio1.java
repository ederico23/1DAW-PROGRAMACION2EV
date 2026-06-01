package ejercicio1;

public class Ejercicio1 {
	private static final String PASSWORD = "EASN";
	public static void main(String[] args) {
		int intentosTotales = 0;
		String generada;
		for (int i = 0; i < 10; i++){
			int intento = 0;
			do {
				intento++;
				generada = crearPassword();
				System.out.println("Intento " + intento + " " + generada);
			} while (!adivinar(generada));
			System.out.println("Se ha acertado en el intento " + intento + " " + generada);
			intentosTotales += intento;
		}
		System.out.println("La media de los intentos ha sido " +(intentosTotales/10.0) + " intentos");
	}//fin main

	public static String crearPassword() {
		String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String resultado = "";
		for(int i = 0; i<4; i++) {
			resultado += letras.charAt((int)(Math.random()*letras.length()));
		}


		return resultado;
	}//fin crearPassword()

	public static boolean adivinar(String generada) {
		String contraseña = PASSWORD;		
		return contraseña.equals(generada);
	}
}//fin class
