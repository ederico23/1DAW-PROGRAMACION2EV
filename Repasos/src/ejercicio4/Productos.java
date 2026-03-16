package ejercicio4;

public abstract class Productos {
	protected String nombre;
	protected double precioBase;
	protected double precioFinal;
	
	/**
	 * @param nombre
	 * @param precioBase
	 */
	public Productos(String nombre, double precioBase) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}


	public double calcularPrecioFinal() {
		return 0;
	}
}
