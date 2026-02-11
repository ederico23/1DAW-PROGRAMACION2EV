package streams;

import java.util.ArrayList;
import java.util.List;

import ejercicios.Alumno;

public class Ejercicio6 {

	public static void main(String[] args) {
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		listaAlumnos.add(new Alumno("12345678A", "luis", 8.5));
		listaAlumnos.add(new Alumno("12345678B", "mario", 5.5));
		listaAlumnos.add(new Alumno("12345678C", "eder", 6.5));
		listaAlumnos.add(new Alumno("12345678D", "mariano", 7.5));
		
		
		listaAlumnos.stream().forEach(a->System.out.println(a.getNombre().toUpperCase()));
	
		//solo escribir en mayus los aprobados
		listaAlumnos.stream().filter(a-> a.getNotaMedia()>=5.0).forEach(a-> System.out.println(a.getNombre().toUpperCase()));
		
		List<String> lista =listaAlumnos.stream()
				.filter(a -> a.getNotaMedia()>=5.0)
				.map(a-> a.getNombre().toUpperCase())
				.sorted()
				.toList();

	
	
	}

}
