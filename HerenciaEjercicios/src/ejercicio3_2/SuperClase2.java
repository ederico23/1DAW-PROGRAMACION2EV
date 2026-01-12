package ejercicio3_2;
public class SuperClase2 {
	private String nombre;
	public int edad;
	String dirección;
	protected double sueldo;
	public SuperClase2(String nombre, int edad, String dirección, double
			sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dirección = dirección;
		this.sueldo = sueldo;
	}
	public String metodoPrueba() {
		return "Nombre:" + nombre +" dirección:"+ dirección + " edad: "+
				edad + " sueldo:"+ sueldo ;
	}
}
