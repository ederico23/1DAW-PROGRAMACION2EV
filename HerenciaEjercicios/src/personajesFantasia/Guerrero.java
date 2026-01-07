package personajesFantasia;
/**
 * subclase guerrero
 */
public class Guerrero extends Personaje {
	private int fuerza;
	public Guerrero(String nombre, int nivel, int fuerza) {
		super(nombre, nivel);
		this.fuerza = fuerza;
	}
	
	@Override
	public String atacar() {
		return "Guerrero " + this.getNombre()+ " ataca con fuerza " + fuerza;
	}


}