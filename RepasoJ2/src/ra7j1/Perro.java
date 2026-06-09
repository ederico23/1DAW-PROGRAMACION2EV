package ra7j1;

public class Perro extends Mascota implements Asegurable{

	private String raza;
	private boolean isPeligroso;
	
	
	/**
	 * @param raza
	 * @param isPeligroso
	 */
	public Perro(String raza, boolean isPeligroso) {
		super();
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
		return "Guau";
	}
	
	
	
}//fin class Perro
