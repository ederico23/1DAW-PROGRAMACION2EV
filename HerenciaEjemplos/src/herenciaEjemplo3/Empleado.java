package herenciaEjemplo3;
/**
 * superclase empleado
 */	
public class Empleado {
	private String nombre;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
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

	public void mostrarInfo() {
		System.out.println("Empleado: "+nombre);
		
	}
	
	
	
}
