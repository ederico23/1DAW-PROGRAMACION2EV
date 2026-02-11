package ejerciciosMaps;

import java.util.HashMap;

/**
Ejercicio 1.- Agenda básica
Usa un HashMap<String, String> para guardar nombres y teléfonos.
Operaciones:
• Añadir contacto
• Buscar contacto por nombre
• Mostrar todos los contactos

@version 1.0 - 11/02/26
@author ederg

 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//creamos el HashMap
		HashMap<String, String> listado = new HashMap<>();
		
		//añadimos datos de prueba
		listado.put("javier", "123456");
		listado.put("mariano", "654312");
		listado.put("juanjo", "123456");
		
		//añadir contacto con metodo
		addContacto("eder","643423", listado);
		System.out.println(listado);
				
		//buscar contacto con metodo
		String telefono = buscarContacto("javier", listado);
		if(telefono==null) {
			System.out.println("esta persona no está en la lista");
		} else {
			System.out.println(telefono);
		}//fin ifelse
		
		//mostrar todos los contactos
		mostrarContactos(listado);
		
		
	}

	/**
	 * metodo para buscar un contacto
	 * @param nombre
	 * @param telef
	 * @param listado
	 */
	
	public static void addContacto(String nombre, String telef, HashMap<String, String> listado) {
		listado.put(nombre, telef);
	}//fin addContacto
	
	public static String buscarContacto (String nombre, HashMap<String,String> listado) {
		return listado.get(nombre);
	}
	
	public static void mostrarContactos(HashMap<String,String> listado) {
		for (String s : listado.keySet()) {
			System.out.printf("nombre: %4s  telefono: %4s \n" , s, listado.get(s));
		}
	}
	
}
