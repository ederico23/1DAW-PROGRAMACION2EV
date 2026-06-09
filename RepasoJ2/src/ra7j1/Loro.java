package ra7j1;

public class Loro extends Mascota implements Asegurable{

	private boolean isHabla;

	public Loro(String nombre, Integer edad, Double peso, boolean isHabla) {
		super(nombre, edad, peso);
		this.isHabla = isHabla;
	}
	
	/**
	 * @return the isHabla
	 */
	public boolean isHabla() {
		return isHabla;
	}

	/**
	 * @param isHabla the isHabla to set
	 */
	public void setHabla(boolean isHabla) {
		this.isHabla = isHabla;
	}

	@Override
	public double precioSeguro() {
		double precio = getPrecioBase();
		
		if (isHabla = true) {
			precio = precio * 0.5;
		}
		
		return precio;
	}

	@Override
	public String hacerSonido() {
		return "El loro hace lorito repite, lorito repite";
	}
	
}//fin class Loro
