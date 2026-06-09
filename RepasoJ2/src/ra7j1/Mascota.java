package ra7j1;

public abstract class Mascota {

	private String nombre;
	private Integer edad;
	private Double peso;
	
	/**
	 * @param nombre
	 * @param edad
	 * @param peso
	 */
	public Mascota(String nombre, Integer edad, Double peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}
	
	private static double precioBase = 100.0;
	
	public static double getPrecioBase() {
		return precioBase;
	}

	public static void setPrecioBase (double precio ) {
		precioBase = precio;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	/**
	 * @return the peso
	 */
	public Double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public abstract String hacerSonido();

	@Override
	public String toString() {
		return "nombre: " + nombre + "| edad " + edad + " años | peso " + peso + " kg\n";
	}   
	
	
	
}//fin Mascota
