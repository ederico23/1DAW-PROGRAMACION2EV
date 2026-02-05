package ejercicios;

import java.util.Objects;

public class Alumno {

	//creamos variables
	private String dni;
	private String nombre;
	private double notaMedia;
	
	public Alumno(String dni, String nombre, double notaMedia) {
		this.dni = dni;
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getNombre(){
		return nombre;
	}

	public double getNotaMedia() {
		return notaMedia;
	}
	
	
	
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param notaMedia the notaMedia to set
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	//no me deja poner @Override (sale error)
	public int hasCode() {
		return Objects.hash(dni, nombre, notaMedia);
	}
	
	//dos alumnos son iguales si tienen el mismo DNI
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if(!(obj instanceof Alumno)) 
			return false;
		Alumno a = (Alumno) obj;
		return dni.equals(a.dni);
	}
	


	
	public String toString() {
		return dni + " - " + nombre + " (" + notaMedia + ")";
	}
	
	
	
}
