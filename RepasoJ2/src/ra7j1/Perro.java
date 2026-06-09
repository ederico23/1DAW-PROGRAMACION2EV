package ra7j1;

public class Perro extends Mascota implements Asegurable{

	private String raza;
	private boolean isPeligroso;
		
	/**
	 * @param nombre
	 * @param edad
	 * @param peso
	 * @param raza
	 * @param isPeligroso
	 */
	public Perro(String nombre, Integer edad, Double peso, String raza, boolean isPeligroso) {
		super(nombre, edad, peso);
		this.raza = raza;
		this.isPeligroso = isPeligroso;
	}
	
	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}
	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}
	/**
	 * @return the isPeligroso
	 */
	public boolean isPeligroso() {
		return isPeligroso;
	}
	/**
	 * @param isPeligroso the isPeligroso to set
	 */
	public void setPeligroso(boolean isPeligroso) {
		this.isPeligroso = isPeligroso;
	}

	@Override
	public double precioSeguro() {
		double precio = getPrecioBase() * 0.5;
		
		if(isPeligroso = true) {
			precio = precio * 0.25;
		}
		
		return precio;
	}

	@Override
	public String hacerSonido() {
		return "El perro hace guau";
	}
	
	
	
}//fin class Perro
