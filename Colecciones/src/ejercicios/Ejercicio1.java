package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Utilizando un ArrayList<String> comprueba el funcionamiento 
de todos los métodos de la clase ArrayList. Para cada método
incluye un comentario donde describas su sintaxis y función y 
pruebes su funcionamiento.

 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//creamos un arraylist
		ArrayList<String> nombres = new ArrayList<>();

		//nombreDeLaVariable.add(datos a añadir)
		//sirve para añadir elementos a la listav 
		nombres.add("ana");
		nombres.add("luis");
		nombres.add("carlos");

		//nombreDeLaVariable.add(int, datos a añadir)
		//inserta un elemento en la posicion indicada
		nombres.add(1, "jose");

		//nombreDeLaVariable.contains(Object o) 
		//verifica si existe
		System.out.println("¿contiene 'luis'? " + nombres.contains("luis"));

		//nombreDeLaVariable.indexOf(Object o) 
		//primera aparicion
		System.out.println("indexOf('ana') " + nombres.indexOf("ana")); 

		//nombreDeLaVariable.lastIndexOf(Object o)
		//ultima aparicion
		System.out.println("lastIndexOf('ana') " + nombres.lastIndexOf("ana"));

		//nombreDeLaVariable.isEmpty()
		//verifica si esta vacia
		System.out.println("esta vacia? " + nombres.isEmpty());

		//nombreDeLaVariable.get(int)
		//devuelve el elemento que ehay en una posicion concreta
		System.out.println("elemento en posicion 1: " + nombres.get(1));

		//nombreDeLaVariable.set(int, dato nuevo)
		//reemplaza el elemento que ehay en una posicion concreta
		nombres.set(1, "eder");
		System.out.println("despues del set: " + nombres);

		//nombreDeLaVariable.size()
		//tamaño de la lista
		System.out.println("tamaño lista: " + nombres.size());
		
		
		//nombreDeLaVariable.remove(int)
		//elimina el elemento que hay en una posicion concreta
		nombres.remove(2);
		System.out.println("lista despues remove(2) " + nombres);
		
		//nombreDeLaVariable.remove(Object o) 
		//elimina por objeto
		nombres.remove("ana"); //elimina la primera si hay muchas
		System.out.println("lista despues remove(ana) " + nombres);
		
		//nombreDeLaVariable.addAll(Colecction) 
		//agrega otra coleccion
		ArrayList<String> invitados = new ArrayList<>();
		
		invitados.add("maria");
		invitados.add("jose");
		
		nombres.addAll(invitados);
		System.out.println("despues de addAll(invitados) " + nombres);
		
		//nombreDeLaVariable.addAll(int, collection)
		//agrega en posicion especifica
		//MIRAR BIEN
		nombres.addAll(1,invitados);
		System.out.println("despues de addAll(1,invitados) " + nombres);
		
		//nombreDeLaVariable.retainAll(collection)
		//conserva solo los que coinciden
		nombres.retainAll(invitados);
		System.out.println("lista despues retainAll(invitados) " + nombres);
		
		
		//nombreDeLaVariable.clear()
		//elimina todos los elementos
		nombres.clear();
		System.out.println("lista despues clear() " + nombres);
		
		//volvemos a entregar datos
		nombres.add("juan");
		nombres.add("sofia");
		nombres.add("andres");
		nombres.add("lucia");
		
		//nombreDeLaVariable.iterator()
		//recorrer con Iterator
		System.out.println("recorrido con Iterator:");
		//iterador  es un objeto que recorre sin usar indices
		Iterator<String> it = nombres.iterator();
		while (it.hasNext()) { //hasNext devuelve true si hay elemento siguiente en la lista
			System.out.println(it.next()); //devuelve el siguiente elemento, avanza el iterador
		}
		
		
		//nombreDeLaVariable.listIterator()
		//recorrer hacia adelante y hacia atras
		System.out.println("recorrido con listIterator: ");
		ListIterator<String> lit = nombres.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		//del reves
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		
		//recorremos la lista usando un for con índice
		//esto nos permite modificar directamente los elementos de la lista
		for(int i = 0; i < nombres.size(); i++) {
		    //nombres.get(i) obtiene el elemento en la posición i
		    //concatenamos "cambiado" al String actual (se crea un nuevo String)
		    //nombres.set(i, ...) reemplaza el elemento original por el nuevo String
		    nombres.set(i, nombres.get(i) + "cambiado");
		}

		System.out.println("Después de modificar con for con índice: " + nombres);

		//nombreDeLaVariable.removeIf(condicion)
		//elimina con condicion
		nombres.removeIf(n -> n.startsWith("a"));
		System.out.println("despues del removeIf() " + nombres);
		
		//nombreDeLaVariable.replaceAll(funcion)
		//reemplaza todos
		nombres.replaceAll(n -> n.toUpperCase());
		System.out.println("despues del replaceAll() " + nombres);
		
		//nombreDeLaVariable.sort(comparator)
		//ordenar
		nombres.sort(Comparator.naturalOrder()); //abecedario
		System.out.println("despues de sort() " + nombres);
		
		//nombreDeLaVariable.subList(from, to)
		//sublista
		nombres.add("pedro");
		nombres.add("alberto");
		System.out.println("lista completa: " + nombres);
		System.out.println("sublista(1,3) " + nombres.subList(1, 3));
		
		//nombreDeLaVariable.toArray()
		//convertir a Array
		Object[] array = nombres.toArray();
		System.out.println("array: ");
		for (Object o : array) {
			System.out.println(o);
		}
		
		//nombreDeLaVariable.clone()
		//clonar la lista
		ArrayList<String> copia = (ArrayList<String>) nombres.clone();
		System.out.println("lista clonada: " + copia);
		
		
		System.out.println("lista final " +nombres );


	}
}