package ejercicio1;

public class Perro implements Reasonable{
	
	private String nombre;
	/**
	 * Constructor
	 * @param nombre
	 */
	public Perro(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String emitirSonido() {
		return "El perro esta ladrando";
	}
	
	
}
