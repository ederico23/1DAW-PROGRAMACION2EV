	package ejercicio3_1;
/**
 * Sublcase para probar los difertentes modificadores de la clase, atributos y
métodos
 */
public class Subclase1 extends SuperClase1 {
	public int suplemento;
	
	/**
	 * @param nombre
	 * @param edad
	 * @param dirección
	 * @param sueldo
	 * @param suplemento
	 */
	public Subclase1(String nombre, int edad, String dirección, double sueldo,
			int suplemento) {
		super(nombre, edad, dirección, sueldo);
		this.suplemento=suplemento;
	}
	
	/**
	 * Metodo para probar el acceso a los atributos de la clase padre.
	 *
	 */
	@Override
	public String metodoPrueba() {
		return "Nombre:" + nombre +" dirección:"+ dirección + " edad: "+
				edad + " sueldo:"+ sueldo ;
	}
}
