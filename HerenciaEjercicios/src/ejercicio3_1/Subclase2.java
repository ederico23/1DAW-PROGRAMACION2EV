package ejercicio3_1;
public class Subclase2 extends SuperClase1{
	public int suplemento;
	public Subclase2(String nombre, int edad, String dirección, double sueldo, int
			suplemento) {
		super(nombre, edad, dirección, sueldo);
		this.suplemento=suplemento;
	}
	/**
	 * Metodo para probar el acceso a los atributos de la clase padre.
	 *
	 */
	@Override
	public String metodoPrueba() {
		return "Nombre:" + nombre +" dirección:"+ dirección + " edad: "+ edad + 
				"sueldo:" + sueldo ;
	}
}
