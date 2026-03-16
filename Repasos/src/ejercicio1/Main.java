package ejercicio1;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblio = new Biblioteca();
		
		Libro l1 = new Libro("El mar", "eder", "abcd", true);
		
		biblio.agregarLibro(l1);
		
		biblio.buscarPorAutor("eder");

	}

}
