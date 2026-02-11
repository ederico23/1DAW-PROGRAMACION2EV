package streams;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {

	public static void main(String[] args) {
		ArrayList<String> listaPalabras = new ArrayList<String>();
		
		listaPalabras.add("Hola");
		listaPalabras.add("adios");
		listaPalabras.add("carcol");
		listaPalabras.add("mercedes");
		listaPalabras.add("lunes");
		
		List<Integer> longitudPalabras = listaPalabras.stream()
				.map(a -> a.length()).toList();
		
		
		System.out.println(longitudPalabras);
		
		
		//suamr todos los caracteres
		long suma = (listaPalabras.stream()
				.mapToLong(s->s.length()))
				.sum();
		
		System.out.println(suma);
		
		//imprimir todas las palabras que empiezen con vocal en mayusculas
		
		
		listaPalabras.stream()
			.filter(a -> a.matches("[aeiouAEIOU]"))
			.forEach(System.out::println);
		
	}

}
