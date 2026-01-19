package ejercicio2;

public abstract class Figura {
	/**
	 * @param nombre
	 * Nombre de la figura geométrica
	 */
	private String nombre;
	/**
	 * Constructor
	 * @param nombre
	 */
	public Figura(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método abstracto
	 */
	public abstract double calcularArea();
	
	/**
	 * @return
	 * Devuelve un String con la información de la figura
	 */
	public String mostrarInfo() {
		String informacion = "La figura "+ nombre +" tiene un área "+calcularArea();
		return informacion;
	}

}