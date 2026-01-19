package ejercicio4;

import java.util.Arrays;

import utilidades.Leer;
import utilidades.ValidarDatos;

public class Lanzadora {

	public static void main(String[] args) {
		// Lista de cooperantes
		Cooperante[] listaCiudadanos = new Cooperante[10];
		// Rellenamos la lista
		llenarArrayCooperantes(listaCiudadanos);
		// Variable para menu
		int opcionMenu = 0;
		// Bucle
		do {
			// Imprimir menu
			System.out.println("1. Alta asalariado");
			System.out.println("2. Alta voluntario");
			System.out.println("3. Listar cooperantes");
			System.out.println("4. Listar asalariados");
			System.out.println("5. Listar voluntarios");
			System.out.println("0. Salir");
			// Elegir opcion
			opcionMenu = Leer.leerEntero("Introduce tu opcion");
			// Menu
			switch(opcionMenu) {
			case 1: 
				Asalariado a = altaAsalariado(listaCiudadanos);
				if (a != null) {
					listaCiudadanos = Arrays.copyOf(listaCiudadanos, listaCiudadanos.length+1);
					listaCiudadanos[listaCiudadanos.length-1] = a;
				} else {
					break;
				}
				break;
			case 2:
				Voluntario v = altaVoluntario(listaCiudadanos);
				if (v != null) {
					listaCiudadanos = Arrays.copyOf(listaCiudadanos, listaCiudadanos.length+1);
					listaCiudadanos[listaCiudadanos.length-1] = v;
				} else {
					break;
				}
				break;
			case 3:
				listarCooperantes(listaCiudadanos);
				break;
			case 4: 
				listarAsalariados(listaCiudadanos);
				break;
			case 5:
				listarVoluntarios(listaCiudadanos);
				break;
			}
		} while (opcionMenu != 0);
	}
	/**
	 * Metodo para llenar el array de cooperantes con datos aleatorios
	 * @param listaCooperantes lista de cooperantes que rellenar
	 */
	public static void llenarArrayCooperantes(Cooperante[] listaCooperantes) {
		String[] nombres = {"Mario", "Javier", "Antonio", "Maria", "Kim", "Carla"};
		String dni = ValidarDatos.generarDni();
		String pais = "España";
		// HAcemos un bucle de 5 para rellenar el array con 5 Asalariados
		for (int i = 0; i < listaCooperantes.length-5; i++) {
			// Variable para elegir aleatoriamente el nombre
			double numeroNombre = Math.random()*5;
			// Variable a la cual le daremos un nombre aleatorio
			String nombre = nombres[(int)(numeroNombre)];
			// Metemos a la lista de cooperantes un nuevo asalariado
			listaCooperantes[i] = new Asalariado(nombre, dni, pais, (int)(Math.random()*500+1000));
			// reiniciamos el dni para que no se repita;
			dni = ValidarDatos.generarDni();
		}
		// HAcemos un bucle de 5 para rellenar el array con 5 voluntarios
		for (int i = 5; i < listaCooperantes.length; i++) {
			// Variable para elegir aleatoriamente el nombre
			double numeroNombre = Math.random()*5;
			// Variable a la cual le daremos un nombre aleatorio
			String nombre = nombres[(int)(numeroNombre)];
			// Metemos a la lista de cooperantes un nuevo voluntario
			listaCooperantes[i] = new Voluntario(nombre, dni, pais, "CruzRoja");
			// reiniciamos el dni para que no se repita;
			dni = ValidarDatos.generarDni();
		}
	}
	/**
	 * MEtodo para dar de alta a un asalariado pidiendo un dni por teclado
	 * @param listaCooperantes pasamos la lista a la que se le quiere añadir el asalariado
	 * @return booleano con true o false para saber si se pudo hacer el alta o no
	 */
	public static Asalariado altaAsalariado(Cooperante[] listaCooperantes) {
		String dni = Leer.leerFrase("Introduce tu DNI");
		if (!ValidarDatos.validarDNI(dni) || dniEstaEnLista(dni, listaCooperantes)) {
			System.out.println("Esta persona ya esta dada de alta o su dni no existe");
			return null;
		} else {
			Asalariado asalariadoNuevo = new Asalariado("Gabriel", dni , "España", 1000);
			return asalariadoNuevo;
		}
	}
	/**
	 * MEtodo para dar de alta a un voluntario pidiendo un dni por teclado
	 * @param listaCooperantes pasamos la lista a la que se le quiere añadir el asalariado
	 * @return booleano con true o false para saber si se pudo hacer el alta o no
	 */
	public static Voluntario altaVoluntario(Cooperante[] listaCooperantes) {
		String dni = Leer.leerFrase("Introduce tu DNI");
		if (!ValidarDatos.validarDNI(dni)|| dniEstaEnLista(dni, listaCooperantes)) {
			System.out.println("Esta persona ya esta dada de alta o su dni no existe");
			return null;
		} else {
			Voluntario voluntarioNuevo = new Voluntario("Gabriel", dni , "España", "CruzRoja");
			return voluntarioNuevo;
		}
	}
	/**
	 * Metodo para mostrar los datos de toda la lista
	 * @param listaCooperantes
	 */
	public static void listarCooperantes(Cooperante[] listaCooperantes) {
		for (Cooperante c : listaCooperantes) {
			System.out.println(c.muestraDatos());
		}
	}
	/**
	 * Metodo para mostrar solo los datos de los asalariados en la lista
	 * @param listaCooperantes
	 */
	public static void listarAsalariados(Cooperante[] listaCooperantes) {
		for (Cooperante c : listaCooperantes) {
			if (c instanceof Asalariado)
			System.out.println(c.muestraDatos());
		}
	}
	/**
	 * Metodo para mostrar solo los datos de los voluntarios en la lista
	 * @param listaCooperantes
	 */
	public static void listarVoluntarios(Cooperante[] listaCooperantes) {
		for (Cooperante c : listaCooperantes) {
			if (c instanceof Voluntario)
			System.out.println(c.muestraDatos());
		}
	}
	private static boolean dniEstaEnLista(String dni, Cooperante[] listaCooperante) {
		for (int i = 0; i < listaCooperante.length; i++) {
			if (listaCooperante[i].getDni().equals(dni)) {
				return true;
			}
		}
		return false;
	}
}