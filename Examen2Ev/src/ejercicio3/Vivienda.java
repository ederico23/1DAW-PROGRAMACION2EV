package ejercicio3;

public abstract class Vivienda implements Valorable{
	
	private String direccion;
    private int superficie;
    private int habitaciones;
    private static double precioMetroCuadrado = 1500.0;
    
    public Vivienda(String direccion, int superficie, int habitaciones) {
        this.direccion = direccion;
        this.superficie = superficie;
        this.habitaciones = habitaciones;
    }

	/**
	 * @return the precioMetroCuadrado
	 */
	public static double getPrecioMetroCuadrado() {
		return precioMetroCuadrado;
	}

	/**
	 * @param precioMetroCuadrado the precioMetroCuadrado to set
	 */
	public static void setPrecioMetroCuadrado(double precioMetroCuadrado) {
		Vivienda.precioMetroCuadrado = precioMetroCuadrado;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @return the superficie
	 */
	public int getSuperficie() {
		return superficie;
	}

	/**
	 * @return the habitaciones
	 */
	public int getHabitaciones() {
		return habitaciones;
	}

	
	
	
	
	
}
