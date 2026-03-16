package ejercicio1;

public class MatriculaErroneaException extends IllegalArgumentException{

	/**
	 * 
	 */
	public MatriculaErroneaException(String matriculaFalsa) {
		super("La matricula " + matriculaFalsa + " no es valida");
	}

	
	
	
}
