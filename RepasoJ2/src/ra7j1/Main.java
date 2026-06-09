package ra7j1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		ArrayList<Mascota> lista = new ArrayList<>();
		llenarMascotas(lista);
		lista.sort(Comparator.comparing(Mascota::getNombre));

		int opcion;

		do {
			System.out.println("0-Salir");
			System.out.println("1-Mostrar todas las mascotas");
			System.out.println("2-Mostrar todos los gatos");
			opcion = Leer.leerEntero("Que opcion quieres?");

			switch(opcion) {
			case 1:
				for(Mascota m : lista) {
					System.out.println(m + m.hacerSonido()  + "\n");
				}//fin for
				break;
				
			case 2: 
				for(Mascota m : lista) {
					if(m instanceof Gato) {
						System.out.println(m + m.hacerSonido() + "\n");
					}//fin if
				}//fin for
				break;
			
			case 0:
				System.out.println("Adios");
			}//fin switch

		} while (opcion!=0);
	}//fin main


	private static void llenarMascotas(ArrayList<Mascota> lista) {
		//perro(nombre, edad, peso, raza, isPeligroso)
		//loro(nombre, edad, peso, isHabla)
		//gato(nombre, edad, peso, isCortadas)
		lista.add(new Perro("Max", 5, 15.4, "Caniche", true));
		lista.add(new Perro("Harry", 8, 20.34, "Salchicha", false));
		lista.add(new Loro("Piolin", 3, 1.21, true));
		lista.add(new Loro("Lorito", 2, 0.94, false));
		lista.add(new Gato("Zor", 6, 7.43, true));
		lista.add(new Gato("Gala", 3, 14.53, false));
	}//fin llenarMascotas

}//fin class 
