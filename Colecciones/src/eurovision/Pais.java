package eurovision;

import java.util.ArrayList;

/**
 * simulacion de los votos de eurovision
 * clase Pais
 * atributos: nombre, puntuacion
 * metodos: constructor(), votar(ArrayList<paises>)
 * 
 * añadir la lista de paises que voto como argumento del pais
 */
public class Pais {

	//atributos de la clase Pais
	private String nombre = "";
	private int puntuacion = 0;
	
	/**
	 * constructor Pais
	 * @param pais
	 */
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public void votar(ArrayList<Pais> votarPaises) throws VotoErroneoException {
		//mirar que la lista sea correcta
		if(votarPaises.contains(this)) {throw new VotoErroneoException(); }
		
		else if (votarPaises.size() != 10) {throw new VotoErroneoException(); }
		//mirar que no hay paises repetidos 
		int [] votos = {1,2,3,4,5,6,7,8,10,12};
		int contador = 0;
		
		for(Pais p :votarPaises) {
			p.recibriVotacion(votos[contador]);
			contador++;
		}
		}
	
	
	
	/**
	 * metodo para que el pais reciba los puntos
	 * @param puntos
	 */
	public void recibriVotacion(int puntos) {
		puntuacion=+puntos;
	}
	
	
}
