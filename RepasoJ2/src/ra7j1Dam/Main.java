package ra7j1Dam;

import java.util.ArrayList;
import java.util.Comparator;

import ra7j1.Leer;
import ra7j1.Mascota;

public class Main {
	public static void main(String[] args) {
		ArrayList<Vehiculo> lista = new ArrayList<>();		
		llenarVehiculos(lista);
		lista.sort(Comparator.comparing(Vehiculo::getMatricula));

		int opcion;

		do {
			System.out.println("0-Salir");
			System.out.println("1-Mostrar todas los vehiculos");
			System.out.println("2-Mostrar todos las motos");
			opcion = Leer.leerEntero("Que opcion quieres?");

			switch(opcion) {
			case 1: 
				for(Vehiculo v:lista) {
					System.out.println(v + "\nSonido: " + v.hacerSonido() + " Precio seguro: " +v.calcularSeguro() + "\n");
				}//fin for
				break;

			case 2:
				for(Vehiculo v:lista) {
					if(v instanceof Moto) {
						System.out.println(v + "\nSonido: " + v.hacerSonido() + "\n");
					}//fin if
				}//fin for
				break;
			case 0:
				System.out.println("Adios");
				break;
			}//fin switch
		} while (opcion != 0);
	}//fin main

	private static void llenarVehiculos(ArrayList<Vehiculo> lista) {
		//public Camion(String matricula, String marca, Integer año, Double tonelaje, Integer numEjes)
		//public Coche(String matricula, String marca, Integer año, Integer numPuertas, boolean isElectrico)
		//public Moto(String matricula, String marca, Integer año, Integer cilindrada, boolean tieneCarnet)
		// Camiones
		lista.add(new Camion("1234ABC", "Volvo", 2020, 18.5, 3));
		lista.add(new Camion("5678DEF", "Scania", 2018, 26.0, 4));
		lista.add(new Camion("9012GHI", "Mercedes-Benz", 2022, 12.0, 2));

		// Coches
		lista.add(new Coche("3456JKL", "Toyota", 2021, 5, false));
		lista.add(new Coche("7890MNP", "Tesla", 2023, 5, true));
		lista.add(new Coche("2345QRS", "Fiat", 2019, 3, false));

		// Motos
		lista.add(new Moto("6789TUV", "Honda", 2022, 600, true));
		lista.add(new Moto("0123WXY", "Yamaha", 2020, 125, true));
		lista.add(new Moto("4567ZAB", "Vespa", 2021, 49, false));

	}//fin llenarVehiculos



}//fin class Main
