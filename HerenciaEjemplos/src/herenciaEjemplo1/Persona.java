package herenciaEjemplo1;
/**
 * ejemplo basico de superclase
 */
public class Persona {
	private String nombre;
	
	public Persona (String nombre) {
		this.nombre = nombre;
		System.out.println("hemos ejecutado el constructor de la clase persona");
	}
	
	//metodos
	public void presentarse() {
		System.out.println("Hola soy " + nombre);
	}
}