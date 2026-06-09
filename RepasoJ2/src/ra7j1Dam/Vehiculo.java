package ra7j1Dam;

public abstract class Vehiculo {
	
	private String matricula;
	private String marca;
	private Integer año;
	
	/**
	 * @param matricula
	 * @param marca
	 * @param año
	 */
	public Vehiculo(String matricula, String marca, Integer año) {
		this.matricula = matricula;
		this.marca = marca;
		this.año = año;
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
	 * @return the año
	 */
	public Integer getAño() {
		return año;
	}

	/**
	 * @param año the año to set
	 */
	public void setAño(Integer año) {
		this.año = año;
	}
	
	public abstract String hacerSonido();

	@Override
	public String toString() {
		return "matricula: " + matricula + "| marca: " + marca + "| año: " + año;
	}
	
	
}//fin class Vehiculo
