package ejercicio4;

/*
 * Superclase 
 */
public class Cooperante {
	private String nombre;
	private String dni;
	private String pais;
	/**
	 * Constructor
	 * @param nombre
	 * @param dni
	 * @param pais
	 */
	public Cooperante(String nombre, String dni, String pais) {
		this.nombre = nombre;
		this.dni = dni;
		this.pais = pais;
	}
	/**
	 * Metodo para mostrar los datos del cooperante 
	 */
	public String muestraDatos() {
		return "Nombre: "+nombre+"; DNI: "+dni+"; Pais: "+pais;
	}
	public String getDni() {
		return this.dni;
	}
}