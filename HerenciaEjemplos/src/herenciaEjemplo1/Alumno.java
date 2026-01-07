package herenciaEjemplo1;
/**
 * clase alumno que hereda de persona
 */
public class Alumno extends Persona { //alumno hereda de persona
	private String curso;
	
	public Alumno (String nombre, String curso) {
		super(nombre);
		this.curso = curso; 
		System.out.println("contructor de la clase alumno");
	}
	
	//metodo
	public void presentarse () {
		super.presentarse();
		System.out.println("hola mi curso es " + curso);
	}
	
	
	
}
