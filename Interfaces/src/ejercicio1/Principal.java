package ejercicio1;


public class Principal {
	
	public static void main(String[] args) {
		
		Coche miCoche = new Coche(1500.0);
		Perro miPerro = new Perro("Buggy");
		Reloj miReloj = new Reloj("Plata");
		
		System.out.println(miCoche.emitirSonido());
		System.out.println(miPerro.emitirSonido());
		System.out.println(miReloj.emitirSonido());
	}
}