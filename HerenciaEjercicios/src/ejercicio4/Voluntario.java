package ejercicio4;

public class Voluntario extends Cooperante{
	private String ong;
	/**
	 * Constructor
	 * @param nombre
	 * @param dni
	 * @param pais
	 * @param ong
	 */
	public Voluntario(String nombre, String dni, String pais, String ong) {
		super(nombre, dni, pais);
		this.ong = ong;
	}
	/**
	 * Metodo para mostrar los datos del cooperante añadiendole el atributo de los voluntarios
	 */
	public String muestraDatos() {
		return super.muestraDatos()+"; ONG: "+ong;
	}
}
