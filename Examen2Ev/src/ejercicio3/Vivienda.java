package ejercicio3;

public abstract class Vivienda implements Valorable{
	
	private String direccion;
	private double superficie;
	private int habitaciones;
	private double precioMetro2;
	private double precioBase;
	
	/**
	 * @param direccion
	 * @param superficie
	 * @param habitaciones
	 */
	public Vivienda(String direccion, double superficie, int habitaciones) {
		super();
		this.direccion = direccion;
		this.superficie = superficie;
		this.habitaciones = habitaciones;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	 * @return the habitaciones
	 */
	public int getHabitaciones() {
		return habitaciones;
	}

	/**
	 * @param habitaciones the habitaciones to set
	 */
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	/**
	 * @return the precioMetro2
	 */
	public double getPrecioMetro2() {
		return precioMetro2;
	}

	/**
	 * @param precioMetro2 the precioMetro2 to set
	 */
	public void setPrecioMetro2(double precioMetro2) {
		this.precioMetro2 = precioMetro2;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @param precioBase the precioBase to set
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	
	
}
