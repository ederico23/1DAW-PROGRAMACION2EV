package ejercicio4;

public class Asalariado extends Cooperante{
	private double sueldo;
	/**
	 * Constructor
	 * @param nombre
	 * @param dni
	 * @param pais
	 * @param sueldo
	 */
	public Asalariado(String nombre, String dni, String pais, double sueldo) {
		super(nombre, dni, pais);
		this.sueldo = sueldo;
	}
	/**
	 * Metodo para mostrar los datos del cooperante añadiendole el atributo de los asalariados
	 */
	public String muestraDatos() {
		return super.muestraDatos()+"; Sueldo: "+sueldo;
	}
}