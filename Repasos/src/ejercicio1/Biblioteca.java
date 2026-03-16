package ejercicio1;

import utilidades.Leer;

/**
 * clase que gestionará la biblioteca
 * 
 * @author Eder Gracia
 * @version 1.0
 */
public class Biblioteca {

	Libro[] libros = new Libro [5];
	
	public void agregarLibro(Libro nuevoLibro) {
		boolean lleno = false;
		for(int i = 0; i<libros.length; i++) {
			
			if(libros[i] == null) {
				libros[i] = nuevoLibro;	
				System.out.println("libro añadido en la posicion " + i);
				lleno = true;
				break;
			}
		}
		
		if (!lleno) {
			System.out.println("biblioteca llena");
		}
	}
	
	public void buscarPorAutor(String autorBusqueda) {
		System.out.println("resultados para el autor " + autorBusqueda);
		
		for (Libro l : libros) {
			if (l != null && l.getAutor().equalsIgnoreCase(autorBusqueda)) {
				System.out.println(l.toString());
			}
		}
	}
	
}
