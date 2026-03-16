package ejercicio2;

public abstract class Empleado {
	private String nombre;
	private int id;
	protected double salarioBase;
	public double salarioFinal;
	
	/**
	 * @param nombre
	 * @param id
	 * @param salarioBase
	 */
	public Empleado(String nombre, int id, double salarioBase) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.salarioBase = salarioBase;
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the salarioBase
	 */
	public double getSalarioBase() {
		return salarioBase;
	}

	/**
	 * @param salarioBase the salarioBase to set
	 */
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public abstract void calcularSalarioFinal();
}
