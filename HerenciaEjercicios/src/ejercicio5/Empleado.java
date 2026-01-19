package ejercicio5;

public class Empleado {
	protected final String NOMBRE_EMPRESA = "Electrica, SA.";
	protected String nombre;
	protected int edad;
	protected double porcentajeIncrementoSueldo;
	// Aunque en el ejercicio establezca que todos los empleados tienen el mismo sueldo base, 
	// No se haria estatico porque aunque vaya a ser el mismo de base para cada uno, cada empleado puede tener
	// Alguna bonificacion y si se hace estatico se daria esa bonificacion a todas las instancias de empleado
	protected double sueldoBase = 1000;
	/**
	 * COnstructor
	 * @param nombre
	 * @param edad
	 */
	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		sueldoBase = sueldoBase + (porcentajeIncrementoSueldo*sueldoBase);
	}
	@Override
	public String toString() {
		return "Empleado [NOMBRE_EMPRESA=" + NOMBRE_EMPRESA + ", nombre=" + nombre + ", edad=" + edad + ", sueldoBase="
				+ sueldoBase + "]\n";
	}
}
