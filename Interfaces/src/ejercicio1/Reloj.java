package ejercicio1;

public class Reloj implements Reasonable{
	
	private String material;
	/**
	 * 
	 * @param material
	 */
	public Reloj(String material) {
		super();
		this.material = material;
	}
	
	@Override
	public String emitirSonido() {
		return "Tic, tac, tic, tac";
	}
}

