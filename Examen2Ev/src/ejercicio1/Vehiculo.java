package ejercicio1;

public class Vehiculo {

	private String marca;
	private String color;
	private String matricula;
	
	/**
	 * @param marca
	 * @param color
	 * @param matricula
	 */
	public Vehiculo(String marca, String color, String matricula) throws MatriculaErroneaException {
		super();
		this.marca = marca;
		this.color = color;
		if(!matricula.matches("[0-9]{4}[A-Z]{3}")) {
			throw new MatriculaErroneaException(matricula);
		}
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
}
