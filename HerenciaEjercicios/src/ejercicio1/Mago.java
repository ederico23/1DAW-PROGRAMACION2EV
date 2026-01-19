package ejercicio1;
/**
 * subclase mago
 */
public class Mago extends Personaje{
	private int mana;
	
	/** constructor
	 * @param nombre
	 * @param nivel
	 * @param mana
	 */
	public Mago(String nombre, int nivel, int mana) {
		super(nombre, nivel);
		this.mana= mana; 
	}
	
	@Override
	public String atacar() {
		return "Mago " + this.getNombre()+ " ataca con un hechizo y gasta " + mana + " de mana";
	}
	
}
