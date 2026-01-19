package ejercicio5;

public class Jefe extends Empleado{
	private String nombreDepartamentoResponsable;
	private double plusJefeSueldo;
	
	public Jefe(String nombre, int edad, String nomDepartamento) {
		super(nombre, edad);
		nombreDepartamentoResponsable = nomDepartamento;
		this.plusJefeSueldo = 250;
		
	}
	
	

}