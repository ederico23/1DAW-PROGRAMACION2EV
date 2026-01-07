package personajesFantasia;
/**
 * superclase personaje
 */
public class Personaje {
	private String nombre;
	private int nivel;
	
	/**
	 * constructor
	 * @param nombre
	 * @param nivel
	 */
	public Personaje(String nombre, int nivel) {
		this.nombre = nombre;
		this.nivel = nivel;
	}
	public String getNombre() {
		return nombre;
	}
	//metodo atacar
	public String atacar() {
		return "El personaje " + nombre + " ataca";
	}
	
	/**
	 * metodo para mostrar la info del personaje
	 * @return devuelve la info del personaje (nombre y nivel)
	 */
	public String mostrarInfo() {
		return "personaje: " +nombre + " nivel: " +nivel;
		
	}
	

}
