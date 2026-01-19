package ejercicio1;
/**
 * sublcase arquero
 */
public class Arquero extends Personaje{
	private int flechas;
	public Arquero(String nombre, int nivel, int flechas) {
		super(nombre, nivel);
		this.flechas = flechas;
	}
	
	@Override
	public String atacar() {
		return "Arquero " + this.getNombre()+ " dispara " + flechas + " flechas";
	}

}
